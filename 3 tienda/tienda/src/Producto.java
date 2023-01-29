public class Producto implements Subject {
    public void registerObserver(){
        String nombre = "Atenas";
        System.out.println("Hola "+ nombre + ", ahora estas regisrado");
    }

    public void notifyObserver() {
        System.out.println("Hola... Hay un nuevo producto");
    }

    public void removeOberserver(){
        System.out.println("Su usuario fue removido");
    }

    public void dataChanged(){
        System.out.println("Algunos datos de los productos se han cambiado");
    }

    @Override
    public void observado() {
        
    }

    @Override
    public void showTienda() {
        
    }

 

}
