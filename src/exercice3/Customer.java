package exercice3;

public class Customer {

	
	private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + ("" + ID + "");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
