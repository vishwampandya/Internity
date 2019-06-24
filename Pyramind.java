import java.util.Scanner;

class Pyramind{
	public static void main(String[] agrs){
			System.out.println("enter the number of rows you want in a pyramind");
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();

			for(int i=1;i<=n;i++){
					for(int j=n;j>i;j--){
						System.out.print(" ");
					}
					for(int k=1;k<=2*i-1;k++){
						System.out.print("*");
					}
					System.out.println();
			}
	}
}