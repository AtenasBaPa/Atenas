public class SMS extends notifierDecorator{
    Notifier notifier;

    public SMS() {
        notificacion = "Notificacion de SMS";
    }

    public String getNotificacion(){
        return notifier.getNotificacion() + ", SMS";
    }

    public String SendM(){
        return mensaje;
    }

}
