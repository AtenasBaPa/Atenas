public class Main {

    public static void main(String [] args){

        Singleton b1 = Singleton.getInstancia("Url 1", "DataBase 1");
        System.out.println(b1.getDataBase());
        System.out.println(b1.getUrl());

        Singleton b2 = Singleton.getInstancia("Url 2", "DataBase 2");
        System.out.println(b2.getDataBase());
        System.out.println(b2.getUrl());
    }
}