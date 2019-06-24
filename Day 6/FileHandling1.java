import java.io.FileOutputStream;
import java.io.FileInputStream;

class FileHandling1{
	public static void main(String[] agrs){
		try{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Vishwam Pandya\\Desktop\\iternity 2\\Day 6\\test.txt");
			fout.write(67);
			//fout.close();
			System.out.println("entered character");

			//for writing a string through FileOutpuStream
			String name = "vishwam";
			byte b[]=name.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("entered string");

			//reading from file
			FileInputStream fin = new FileInputStream("C:\\Users\\Vishwam Pandya\\Desktop\\iternity 2\\Day 6\\test.txt");
			int i = fin.read();
			System.out.println((char)i);		
			//to print the whole string
			
			while(i!=-1){
				System.out.print((char)i);
				i=fin.read();
			}	
		}	
		catch(Exception e){
			System.out.println(e);
		}

	}
}