import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name;
	
    List<String> toppings = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void prepare() {
                System.out.println("... ");
		System.out.println("Preparing " + name);
	}

	public void bake() {
                System.out.println("... ");
		System.out.println("Baking " + name);
	}

	public void cut() {
                System.out.println("... ");
		System.out.println("Cutting " + name);
	}

	public void box() {
                System.out.println("... ");
		System.out.println("Boxing " + name);
                System.out.println("... ");
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
                System.out.println("Pizza Toppings: ");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}