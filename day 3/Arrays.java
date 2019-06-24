class Arrays{
	public static void main(String[] adf){
		int arr[][]={{1,9,200,45,324},{3,45,35,234,54},{43,543,76,323,65},{54,34,65,23,543},{4,3,423,432,3}};
		int a[]={12,13,14,44};  
		int max=-1;
		for(int i=0;i<5;i++)
		 for(int num : arr[i]){
		 	if(max<num){
		 		max=num;
		 	}
		 }          
		 System.out.println("maximum element in the 2D array is "+max);
	}
}
/*
1) 2D arrays
2) for each loop
*/