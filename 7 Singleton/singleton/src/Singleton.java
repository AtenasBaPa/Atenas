public class Singleton {

    private String DataBase;
    private String url;
    private static  Singleton UniqueInstance;

    private Singleton(String url,String DataBase){
        this.url = url;
        this.DataBase = DataBase;
    }

    public static Singleton getInstancia(String url, String DataBase){

        if(UniqueInstance == null){
            System.out.println("Empty instance ---> Creating instance");
            UniqueInstance = new Singleton(url, DataBase);
        }
        System.out.println("--- Closing the previous instance ---");
        System.out.println("** Creating new instance **");
        UniqueInstance = new Singleton(url, DataBase);
        return UniqueInstance;
    }

    public String getDataBase(){
        return DataBase;
    }

    public String getUrl(){
        return url;
    }
}