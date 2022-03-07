class CoreThread extends Thread{
	int id = 0;
	CoreThread(int id){ this.id = id;}

	public void run(){
		for(int i = 1; i < 11; i++){
			System.out.println( this.id + " Thread is running!");
			try{Thread.sleep(1000);} catch(InterruptedException ie){}
		}
	}

}

public class Threading{

	public static void main(String[] args){

		for(int i = 0; i < 10; i++){
			CoreThread ct1 = new CoreThread(i);
			ct1.start();
		}
	}
}