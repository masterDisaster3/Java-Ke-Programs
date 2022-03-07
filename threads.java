
class A implements Runnable{
	public void run(){
		for(int i = 1; i <= 100; i++)
			System.out.println("Thread A: " + i + " process running..");
		try{Thread.sleep(1000);} catch(InterruptedException ie){}
	}
}


class B implements Runnable{
	public void run(){
		for(int i = 1; i <= 100; i++)
			System.out.println("Thread B: " + i + " process running..");
		try{Thread.sleep(1000);} catch(InterruptedException ie){}

	}
}

public class threads{

	public static void main(String[] args){

		Thread t1 = new Thread(new A());
		Thread t2 = new Thread(new B());

		t1.start();
		t2.start();
	}

}