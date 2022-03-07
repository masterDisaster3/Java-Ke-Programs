class Worker{
	public int counter = 0;
	public synchronized void count(){
		this.counter++;
	}

}

class MyThreadA extends Thread{
	private Worker w;
	private int id;
	MyThreadA(Worker w, int id){
		this.w = w;
		this.id = id;
	}

	public void run(){
		for(int i = 0; i < 1000000; ++i){
			this.w.count();
			System.out.println(id + "Thread is increamenting!" + w.counter);

		}
	}
}

public class WorkerMain{
	public static void main(String[] args){
		Worker w = new Worker();
		Thread t1 = new MyThreadA(w, 1);
		Thread t2 = new MyThreadA(w, 2);
		t1.start();
		t2.start();
		try{t1.join();
			t2.join();}
			catch (InterruptedException e) {
				
			}
		System.out.println("Counter : " + w.counter);
	}
}