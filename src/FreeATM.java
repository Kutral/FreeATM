import com.freeatm.welcome.WelcomeController;

public class FreeATM {
    public static final String version= "0.0.1";
    public static void main(String[] args) {
        System.out.println("Version :" + version);
        WelcomeController controller = new WelcomeController();
        controller.start();

    }
}
