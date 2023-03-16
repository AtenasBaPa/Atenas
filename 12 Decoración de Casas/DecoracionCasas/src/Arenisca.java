import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arenisca extends PaqueteDecoracion{

    @Override
    void darAcabado() {
        System.out.println("El material ha sido lajado");
    }

    boolean solicitudAcabado(){
        String answer = respuestaUser();
        if(answer.toLowerCase().startsWith("s")){
            return true;
        }else {
            return false;
        }
    }
    private String respuestaUser(){
        String answer = null;
        System.out.println("¿Desea darle acabado de lajado al material? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch (IOException ioe){
            System.err.println("no se ha entendido su respuesta");
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}