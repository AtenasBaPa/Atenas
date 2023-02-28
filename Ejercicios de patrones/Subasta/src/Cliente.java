public class Cliente {
    
    public Cliente(String nombre) {
    }
    
    public void update(Subject subject) {
        System.out.println("El producto en subasta se ha actulaizado ");
    }

    public void offer(ObjetoSubasta ObjetoSubasta, double precio) {
        ObjetoSubasta.setPrecio(precio);
    }
}
