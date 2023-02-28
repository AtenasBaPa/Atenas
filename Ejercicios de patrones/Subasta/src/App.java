public class App {
     public static void main(String[] args) {
         Cliente clienteAtenas = new Cliente("Atenas");
         Cliente clienteLalo = new Cliente("Lalo");
 
         ObjetoSubasta producto1 = new ObjetoSubasta("Vincent van Gogh",15000, true);
         ObjetoSubasta producto2 = new ObjetoSubasta("Monalisa", 10000, true);
 
         System.out.println("PrimerProducto: " + producto1.getNombre() + " Precio inicial: " + producto1.getPrecio());
         System.out.println("SegundoProducto: " + producto2.getNombre() + " Precio inicial: " + producto2.getPrecio());
 
         producto1.registerCliente(clienteLalo);
         producto2.registerCliente(clienteAtenas);
 
         clienteAtenas.offer(producto1, 20000);
         clienteLalo.offer(producto1, 18000); // Lalo ofrece 18000 después de que Atenas ofreciera 20000
 
         producto1.removeCliente(clienteLalo);
 
         System.out.println("Ganador de la subasta: " + clienteAtenas);
     }
 }