class A extends Thread{
	public void run(){
		for(int i = 1; i < 11; i++){
			System.out.println("Thread A : " + i + " process running..");
			try{Thread.sleep(1000);} catch(InterruptedException ie){
				//ie.printStackTrace();
			}	
		}	
	}
}

class B extends Thread{
	public void run(){
		for(int i = 1; i < 11; i++){
			System.out.println("Thread B : " + i + " process running..");
			try{Thread.sleep(1000);} catch(InterruptedException ie){}
		}	
	}

}

public class threads2{
	public static void main(String[] args){

		A t1 = new A();
		B t2 = new B();


		t1.start();
		t1.setPriority(6);
		System.out.println("t1 priority - " + t1.getPriority());
		t2.start();
		System.out.println("t2 priority - " + t2.getPriority());

		for(int i = 1; i < 11; i++)
			System.out.println("Main Thread : " + i + " process running..");

	}
}