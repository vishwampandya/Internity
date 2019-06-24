import java.io.*;
class FileHandling3{
	public static void main(String[] args){
		
		try{
			File f  = new File("newfile.txt");
			if(f.createNewFile()){
				System.out.println("file created");
			}
			else{
				System.out.println("file already exist");
			}

			FileWriter fw = new FileWriter("newfile.txt");
			fw.write("origanl file");

			File file2 = f.getCanonicalFile();
			boolean bool = file2.exists();
			if(bool){
				System.out.println("copy of file created");
				String path = file2.getAbsolutePath();
				System.out.println("path : "+path);
			}

			//getting list of filenames
			File itr = new File("C:\\Users\\Vishwam Pandya\\Desktop\\iternity 2");
			String filenames[] = itr.list();

			for (String filename : filenames){
				System.out.println(filename);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
}