public class Facebook extends notifierDecorator{
    Notifier notifier;

    public Facebook() {
        notificacion = "Notificacion de Facebook";
    }

    public String getNotificacion(){
        return notifier.getNotificacion() + ", Facebook";
    }

    public String SendM(){
        return mensaje;
    }

}
