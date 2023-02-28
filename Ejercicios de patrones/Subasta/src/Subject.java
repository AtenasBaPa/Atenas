public interface Subject {
    void registerCliente(Cliente c);
    void removeCliente(Cliente c);
    void notifyCliente();
}