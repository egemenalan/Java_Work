package bolum10;

public class UseBMIClass {

	public static void main(String[] args) {
		BMI bmi1 = new BMI("Egemen",35, 76, 176);
		System.out.println(bmi1.getName() + bmi1.getBMI() + bmi1.getStatus());
		
		BMI bmi2 = new BMI("ALAN", 120, 150);
		System.out.println(bmi2.getName() + bmi2.getBMI() + bmi2.getStatus());
	}

}
