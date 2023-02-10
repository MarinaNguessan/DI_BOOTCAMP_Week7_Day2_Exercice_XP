package exercice1;

public class XShape extends Shape {
	
	private String name;

    public XShape(String name) { // Default Constructor
        this.name = name;
    }

    // Overridden Method
    public String getName() {
        // write your code here
        return super.getName() + ", " + this.name;
    }

	public static void main(String[] args) {
		 Shape circle = new XShape("Circle");

	      System.out.println("\n"+circle.getName()+"\n");

	}

}
