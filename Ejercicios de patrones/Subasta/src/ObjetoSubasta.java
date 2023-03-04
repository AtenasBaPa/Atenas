import java.util.ArrayList;
import java.util.List;


public class ObjetoSubasta implements Subject {
    private String nombre;
    private double precio;
    private boolean avaible;
    

     private List<Cliente> clientes = new ArrayList<Cliente>();
     
     public ObjetoSubasta(String nombre, double precio, boolean avaible) {
        this.nombre = nombre;
        this.precio = precio;
        this.avaible = avaible;
    }
     
     @Override
    public void registerCliente(Cliente c) {
        clientes.add(c);
    }
    
     @Override
    public void removeCliente(Cliente c) {
        clientes.add(c);
    }
     
      @Override
    public void notifyCliente() {
        for (Cliente cliente : clientes) {
            cliente.update(this);
        }
    }
    
     public double getPrecio() {
        return precio;
    }
    public String getNombre() {
        return nombre;
    }
     
      public void setPrecio(double precio) {
        this.precio = precio;
        notifyCliente();
    }

    public boolean estaDisponible() {
        return avaible;
    }

    public void setAvaible(boolean avaible) {
        this.avaible = avaible;
    }

    
     
}