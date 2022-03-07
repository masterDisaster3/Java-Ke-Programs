class Work {
	private int data;
	private boolean flag =false;
	public synchronized void setData(int data){
		while(flag){
			try{wait();}
			catch(InterruptedException ie){}
		}
		this.data = data;
		this.flag =true;
		notify();
	}

	public synchronized int getData(){
		while(!flag){
			try{wait();}
			catch(InterruptedException ie) {}

		}
		int data = this.data;
		this.flag = false;
		notify();
		return data;
	}
}

class Producer extends Thread{
	private Work w;
	Producer(Work w){this.w = w;}
	public void run(){
		for(int i = 0; i < 100; i ++){
			try{Thread.sleep(500);}
			catch(InterruptedException ie){}
			w.setData(i);
		}
	}
}

class Consumer extends Thread{
	private Work w;
	Consumer(Work w){this.w = w;}
	public void run(){
		for(int i = 0; i < 100; ++i)
		{
			System.out.println("Data : " + w.getData());
		}
	}
}

public class Thread3{
	public static void main(String[] args){
		Work w = new Work();
		Thread producer = new Producer(w);
		Thread consumer = new Consumer(w);
		producer.start();
		consumer.start();
	}
}