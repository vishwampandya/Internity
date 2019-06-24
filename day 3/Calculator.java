import java.util.Scanner;


// Custom exception class for negetive exponential.
class MyException extends Exception{
	public MyException(String s){
		//passing the error message to the parent class.
		super(s);
	}
}


//main class
class Calculator{
	//method for calculating power.
	double power(double base,int raiseto) throws MyException{

		if(raiseto<0){
			throw new MyException("power can't be negative");
		}

		double expo=1;
		for(int i = 0; i<raiseto;i++){
			expo=expo*base;
		}

		return expo;
	}

	//main method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------------CALCULATOR-----------------------------------------");
		//instructions
		System.out.println("Instructions");
		System.out.println("* You can perform the following oprations - (+,-,*,/,^).");
		System.out.println("* Add spaces between every number and opration.");
		System.out.println("* Enter '=' when you want to end your calculation.");
		System.out.println("* If you want to do a multiplication or division than first hit enter(for clarity).");
		System.out.println("* Your exponential as decimal input will be taken as integers.\n");

		//agreement
		System.out.println("Did you read all the instructions?(y/n)\n");
		char ans = input.next().charAt(0);
		boolean agree = (ans=='y'||ans=='Y'?true:false);

		//all declrations 
		int next2;
		double next,result,firstNumber,prev;
		char op,prev_op;
		Calculator obj = new Calculator();
		

		//if agreed that user have read the instructions
		if(agree){
			try{
				//taking numbers and operations for the first round 
	     	 	System.out.println("perform calculation  ");
			 	firstNumber = input.nextDouble();
			 	result=firstNumber;
			 	prev=firstNumber;
		 		op = input.next().charAt(0);

		 		//and now looping it until = is not entered
				do{
				 	next = input.nextDouble();
					prev=result;
					prev_op=op;
			
					switch(op){
						case '+':
							result=result+next;
							break;
						case '-':
							result=result-next;
							break;
						case '*':
							result=result*next;
							break;
						case '/':
							result=result/next;
							break;
						case '^':
							next2=(int)next;
							result=obj.power(result,next2);
							break;		
						default:
							System.out.println("please choose an opration as mentioned above");	 	
					}
			        //history of what the user performed recently
					System.out.print(prev +" "+prev_op+" "+next+" = "+result+" ");
				    
					op = input.next().charAt(0); 
					System.out.println();			

			    }while(op!='=');
				System.out.println(result);

		    }
			catch(ArithmeticException e){
				System.out.println("you can't divide a number by 0");
			}	
			catch(MyException ex){
				System.out.println(ex.getMessage());
			}	
			catch(Exception e){
				System.out.println("you may not have read the instructions properly (apply proper spaces between number and oprations.)");
			}

		}
		//if not agreed to read the instructions
		else{
			System.out.println("Sorry , but you have to read the instructions before procceding");
		}	
	}
}
/*
1) used boolean expression , ternary operatorson , strings equality line 45
2) used switch case ,break, do while , for loops
3) done explicit typecasting on line 85
4) read and write through objects
5) done exception handling 
6) created a custom exption
*/