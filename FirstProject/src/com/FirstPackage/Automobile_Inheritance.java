package FirstPackage;

import java.util.Scanner;

class driverClass_Inheritance{
	
}

class Automobile_Inheritance {
	static Scanner input = new Scanner(System.in);
	
	public static String type;

	public static String name;
	public static int gears;

	public int maxSpeed;
	public double engineCapacity, horsePower, torque;
	
	public Automobile_Inheritance(int gears) {
		this.gears = gears;
	}

		
	public static void main(String args[]) {
		System.out.println("Choose your input:\n1-Two Wheeler\n2-Four Wheeler");int option = input.nextInt();

		switch(option) {
		case 1: inputVariables(option);break;
		case 2:inputVariables(option);break;
		}
	}
	
	public static void inputVariables(int option) {
		if(option == 1) {
			type = "Two Wheeler";
			System.out.println("Input name of "+type);name = input.next();
			System.out.println("Enter the gears in "+name);gears = input.nextInt();
			twoWheelers obj1 = new twoWheelers(name,gears); 
			System.out.println(obj1.toString());
			}
		else {
			type = "Four Wheeler";
			System.out.println("Input name of "+type);name = input.next();
			System.out.println("Enter the gears in "+name);gears = input.nextInt();
			fourWheelers obj2 = new fourWheelers(name,gears);
			System.out.println(obj2.toString());
		}
	}
}
class twoWheelers extends Automobile_Inheritance{

	public twoWheelers(String name, int gears) {
		super(gears);
		// TODO Auto-generated constructor stub
	}
		private int rpm;
		public int addRpm(int val) {
			return val = rpm;
		}
		
	public String toString() {
		return(super.toString()+"\nName:"+name);
	}
}
class fourWheelers extends Automobile_Inheritance{

	public fourWheelers(String name, int gears) {
		super(gears);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return(super.toString()+"\nName:"+name);
	}
}
