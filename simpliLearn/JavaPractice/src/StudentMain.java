
class Student {
	
	private int sid;
	private String course;
	private double tutionFee;
	
	public double assaignFee(double fine) {
		this.tutionFee = fine;
		
		return this.tutionFee;
	}

	
	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getTutionFee() {
		return tutionFee;
	}

	public void setTutionFee(double tutionFee) {
		this.tutionFee = tutionFee;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", course=" + course + ", tutionFee=" + tutionFee + "]";
	}
	
}
  public class StudentMain {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println("--"+s.assaignFee(123));
	
	}
}
