import java.util.*;

public class Cliente1 implements Observer {
    private java.lang.String ModeloCelular;
    private Xiaomi xiaomi;

    public Cliente1(Xiaomi i) {
        this.xiaomi = i;
        xiaomi.registerObserver(this);
        ModeloCelular = "Redmi Note 9";
    }

    public void update(java.lang.String m) {
        ModeloCelular = m;
        sendEmail();
    }

    public void sendEmail() {
        System.out.println("Email a telefono 1: El celular " + ModeloCelular + " Ya está registrado");
    }
}