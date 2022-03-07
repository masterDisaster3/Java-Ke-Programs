import network.ApplicationLayer;


public class odjectoriented{


	public static void main(String args[]){

		Student s1 = new Student();
		s1.name = "Atul";

		s1.printName();

		ApplicationLayer a1 = new ApplicationLayer();



	}



} 


class Student{
	String name;


	public void printName(){
		System.out.println("My name is " + this.name);
	}
}