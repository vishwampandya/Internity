interface PrintName{
	void print(String name);
}
interface Addable{
	int add(int a,int b);
}
public class lambda{
	public static void main(String[] args) {
		
		PrintName ab = (name) ->{
			System.out.println(name);
		};
		ab.print("vishwam pandya");
		
		Addable ac = (a,b)->(a+b);
		System.out.println(ac.add(20,30));
	}
}