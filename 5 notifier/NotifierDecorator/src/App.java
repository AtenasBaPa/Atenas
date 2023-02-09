public class App {
    public static void main(String[] args) {
        Notifier notifier = new Application();
        notifier = new Facebook();
        notifier = new SMS();
        System.out.println(notifier.getNotificacion());
        System.out.println(notifier.SendM());
    }
}
