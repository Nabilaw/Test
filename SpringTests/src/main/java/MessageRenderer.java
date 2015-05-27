/**
 * Created by nabil on 24.03.15.
 */
public interface MessageRenderer {

    public void render();
    public void setMessageProvider(MessageProvider messageProvider);
    public MessageProvider getMessageProvider();
}
