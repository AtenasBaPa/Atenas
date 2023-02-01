public class App {
    public static void main(String[] args) {
		Xiaomi xiaomi = new Xiaomi("9");
	
        Cliente1 cliente1 = new Cliente1(xiaomi);
        Cliente2 cliente2 = new Cliente2(xiaomi);
        Cliente3 cliente3 = new Cliente3(xiaomi);

        xiaomi.setModel ("9");
        xiaomi.setModel ("9S");
        xiaomi.setModel ("9 PRO");
		
	}
}
