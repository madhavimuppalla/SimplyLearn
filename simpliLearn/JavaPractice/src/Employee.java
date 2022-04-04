
public class Employee {
private String empName;
private int empSal;
private int bonus;
	
	public int employeeBonus(int bonus) {
		
		
		bonus = empSal+ bonus;
		
		return bonus;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.empName="Madhavi";
		emp.empSal=10000;
System.out.println("Employee name:"+emp.empName);
System.out.println("Employee salary:"+emp.empSal );
System.out.println( "Salary with Bonus:"+emp.employeeBonus(200));
	}

	public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public int getEmpSal() {
	return empSal;
}

public void setEmpSal(int empSal) {
	this.empSal = empSal;
}

public int getBonus() {
	return bonus;
}

public void setBonus(int bonus) {
	this.bonus = bonus;
}


}
