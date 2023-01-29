public abstract class Tienda {
    Subject subject;
    Observer observer;

    public Tienda() {
    } 

    public void performObservado() {
        subject.observado();
    }

    public void performObservador() {
        observer.observador();  
    }

    public void setSubjetc(Subject sub) {
        subject = sub;
    }

    public void setObserver(Observer ob) {
        observer = ob;
    }

    public abstract void display();
    
    public void showTienda() {
        performObservado();
        performObservador();
    }
}
