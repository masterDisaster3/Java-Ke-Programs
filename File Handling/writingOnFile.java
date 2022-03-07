import java.io.*;

class writingOnFile{

	public static void main(String[] args) throws IOException{

		FileOutputStream fout;
		fout = new FileOutputStream("/Users/atul/Desktop/document.txt", true);

		String data = "Cigarette after sex";

		char dataChar[] = data.toCharArray();
		for(int i = 0; i < data.length();i++)
			fout.write(dataChar[i]);

		fout.close();
	}
}