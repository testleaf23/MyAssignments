package week1.day1.assignments;

public class Bike {
	
	public void applyBrake(){
		System.out.println("Applied Brake for Bike");
	}
	
	public static void main(String[] args) {
		Car ca = new Car();
		Bike bi = new Bike();
		ca.applyBrake();
		ca.soundHorn();
		bi.applyBrake();
		

	}

}
