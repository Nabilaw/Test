/**
 * Created by nabil on 24.03.15.
 */
public class HelloWorld {

    public static void main(String[] args) {
        MessageRenderer messageRenderer = new StandardOutMsg();
        MessageProvider messageProvider = new HelloWorldMessageProvider();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
