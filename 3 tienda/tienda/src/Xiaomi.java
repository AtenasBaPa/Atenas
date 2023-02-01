import java.util.ArrayList;

public class Xiaomi implements Subject{

    private ArrayList observers;
    private java.lang.String ModeloCelular;
    
    public Xiaomi (java.lang.String modelo){
        observers = new ArrayList();
        ModeloCelular = modelo;
    }
    
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void remove(Observer o) {
        int i = observers.indexOf(o);
        if (i >=0){
            observers.remove (i);
        }
    }

    public void notifyObservers() {
        for (int i=0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(ModeloCelular);
        }
    }
    
    public void modelChanged (){
        notifyObservers();
    }
    
    public void setModel (java.lang.String ModeloCelular){
        this.ModeloCelular = ModeloCelular;
        
        
        modelChanged();
    }
    
}