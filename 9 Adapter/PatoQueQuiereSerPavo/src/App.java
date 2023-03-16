import static java.lang.System.out;


public class App {
        public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Turkey duck_in_disguise = new DuckAdapter(duck);


      out.println("\nThe Turkey says...");
      testTurkey(turkey);

      out.println("\nThe Duck adapter says...");
      testTurkey(duck_in_disguise);
    }

        private static void testTurkey(Turkey turkey) {
        }
}