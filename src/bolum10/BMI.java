package bolum10;

public class BMI {
	
	private String name;
	

	

	public static double getKilogramsPerPound() {
		return KILOGRAMS_PER_POUND;
	}

	public static double getMetersPerInc() {
		return METERS_PER_INC;
	}

	private int age;
	private double weight;
	private double height;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INC = 0.0254;

	
	
	public BMI(String name,int age,double weight,double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		
	}
	
	public BMI(String name,double weight,double height) {
		this(name, 20, weight, height);
		
	}
	
	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INC) * (height * METERS_PER_INC));
		return Math.round(bmi * 100) / 100.0;
		
	}
	
	public String getStatus() {
		double bmi = getBMI();
		if(bmi < 18.5)
			return "under weight";
		else if(bmi < 25)
			return "normal";
		else if(bmi < 30)
			return "overheight";
		else
			return "Obese";
		
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}
}


