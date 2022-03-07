import java.io.File;
import java.io.IOException;
class files{

	public static void main(String[] args) throws IOException{

		File f1 = new File("/Users/atul/Desktop/file.txt");

		System.out.println("Can write to file? - " + f1.canWrite());
		System.out.println("File exist? - " + f1.exists());
		System.out.println("File name? - " + f1.getName());
		System.out.println("File length? - " + f1.length());

		try{Thread.sleep(5000);}
		catch(InterruptedException i){}
		f1.createNewFile();
		System.out.println("File exist? - " + f1.exists());
		f1.delete();
		System.out.println("File exist? - " + f1.exists());

		if(!!!!!!!!!!!!!!!!!!true){
			System.out.println("You did it");

		}

	}
}