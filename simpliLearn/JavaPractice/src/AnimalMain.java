
 class Animal {
	void sleep() {
	System.out.println("Animal sleep");
	}
}

 class Cat  extends Animal {
	void eat() {
	System.out.println("cat eat");
	}
}
 class SmallCat  extends Cat {
		void sound() {
		System.out.println("cat sound");
		}
	}
 public class AnimalMain{
	 
	 public static void main(String[] args) {
		/* Cat cat = new Cat();
		 cat.sleep();
		 cat.eat(); single inheritance*/
		 
		 SmallCat s = new SmallCat();
		 s.sound();
		 s.eat();
		 s.sleep();//multilevel 
	 }
 }
