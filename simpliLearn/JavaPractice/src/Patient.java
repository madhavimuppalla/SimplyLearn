
public class Patient {

	double height, weight;
	double computeBMI(double height,double weight) {
		
		return height*weight;
	}
	int a;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
		a++;
		System.out.println("Patient one BMI:"+a);
	}
	

	public Patient(double height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	public static void main(String[] args) {
		
		Patient one = new Patient();
		Patient two = new Patient();
		
		System.out.println("Patient one BMI:"+one.computeBMI(5.4, 55.4));
		System.out.println("Patient two BMI:"+two.computeBMI(6.4, 70.4));
		
	}
}
