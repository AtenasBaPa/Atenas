import java.util.*;

public class Cliente2 implements Observer {
    private java.lang.String ModeloCelular;
    private Xiaomi xiaomi;

    public Cliente2(Xiaomi i) {
        this.xiaomi = i;
        xiaomi.registerObserver(this);
        ModeloCelular = "Redmi Note 9S";
    }

    public void update(java.lang.String m) {
        ModeloCelular = m;
        sendEmail();
    }

    public void sendEmail() {
        System.out.println("Email a telefono 2: El celular " + ModeloCelular + " Ya está registrado");
    }
}