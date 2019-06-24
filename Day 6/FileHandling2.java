import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.PrintStream;

class FileHandling2{
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("C:\\Users\\Vishwam Pandya\\Desktop\\iternity 2\\Day 6\\test2.txt");
			fw.write("vishwam pandya");
			fw.close();

			FileOutputStream fout = new FileOutputStream("C:\\Users\\Vishwam Pandya\\Desktop\\iternity 2\\Day 6\\test2.txt");
			PrintStream pout = new PrintStream(fout);
			pout.println("this is next line through PrintStream");
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
}