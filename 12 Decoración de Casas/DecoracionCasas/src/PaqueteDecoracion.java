import java.util.Scanner;
public abstract class PaqueteDecoracion {
    final void elaboracion(){
        laminar();
        cortarMedida();
        if(solicitudAcabado()){
            darAcabado();
        }
        empaquetar();
    }

    public void cortarMedida(){
        Scanner datos = new Scanner(System.in);
        int Medida1, Medida2;
        System.out.println("Medida del largo :");
        Medida1 = datos.nextInt();
        System.out.println("Medida del ancho :");
        Medida2 = datos.nextInt();
        System.out.println("Laminas cortadas en medidas de :" + Medida1 + " X "+ Medida2);

    }
    abstract void darAcabado();

    public void laminar(){
        System.out.println("Piedra coratda en laminas delgadas");
    }

    public void empaquetar(){
        System.out.println("Paquetes con 5 piezas listos!");
    }

    boolean solicitudAcabado(){
        return true;
    }

}