

class Box{
	
	int l;int b;int h;
	
	int volume(int l,int b,int h) {
		return l*b*h;
	}
	void volume1( int l,int b,int h) {
		
		System.out.println("With arguments , without return type:"+l*b*h);
	}
	int volume2() {
		l=2;b=5;h=3;
		return l*b*h;
	}
	void volume3() {
		System.out.println("With out arguments , without return type:"+l*b*h);
	}
}
public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Box  box = new Box();
		System.out.println("With  arguments:"+box.volume(10, 20, 30));
		box.volume1(10, 20, 30);
		//System.out.println("With out arguments and with return type:"+box.volume3());
		box.volume3();
	}
	//2,3,4 ex

}
