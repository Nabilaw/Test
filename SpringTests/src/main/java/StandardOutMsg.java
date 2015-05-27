/**
 * Created by nabil on 24.03.15.
 */
public class StandardOutMsg implements MessageRenderer {

    private MessageProvider messageProvider = null;

    @Override
    public void render() {
        if(messageProvider == null) {
            throw new RuntimeException(
                    "YOu must set the prop message provider" +
                            StandardOutMsg.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;

    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
