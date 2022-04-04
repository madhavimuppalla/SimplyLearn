
 
 class Employe {
	 
	 private String empNo;
	 private String empName;
	 private int sal;
	 private int bonus;
	 
int calSalary(int bonus) {
	this.sal = this.sal+bonus;
	
	return this.sal;
}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
 }
public class TestEmployee{
	
	public static void main(String[] args) {
		
		Employe emp[] =  new Employe[4];
		//e.setYear(123);
		//System.out.println("Empl:"+e);
	}
	
}