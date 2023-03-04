public class Cliente {

    private String nombre;
    
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    public void update(Subject subject) {
        System.out.println("El producto en subasta se ha actulaizado ");
    }

    public void offer(ObjetoSubasta ObjetoSubasta, double precio) {
        ObjetoSubasta.setPrecio(precio);
    }

    public String getNCliente(){
        return nombre;
    }

    public void setNCliente(){
        this.nombre = nombre;
    }

}
