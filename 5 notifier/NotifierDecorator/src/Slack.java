public class Slack extends notifierDecorator{
    Notifier notifier;

    public Slack() {
        notificacion = "Notificacion de Slack";
    }

    public String getNotificacion(){
        return notifier.getNotificacion() + ", Slack";
    }

    public String SendM(){
        return mensaje;
    }

}
