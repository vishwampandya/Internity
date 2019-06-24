import java.util.*;

class Collections{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("vishwam");
		al.add("pandya");
		al.add("indore");
		al.add("dheradun");

		System.out.println("simply calling the ArrayList");
		System.out.println(al);

		System.out.println("ArrayList through foreach loop");
		for(String s : al){
			System.out.println(s);
		}

		System.out.println("ArrayList through simple for loop");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i)+"\n");
		}
		System.out.println("ArrayList through iterator");

		Iterator itr = al.iterator(); 
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		System.out.println("TreeSet");
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(22);
		set.add(43);
		set.add(32);

		Iterator i = set.descendingIterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("highest value is"+set.pollLast()); 

		System.out.println("TreeMap");

		TreeMap<String,String> phonebook=new TreeMap<String,String>();    
      	phonebook.put("9039026699","vishwam");    
      	phonebook.put("8982520025","ram");    
    	phonebook.put("2134567897","raj");    
     	phonebook.put("5468975646","Rahul");    
        
      for(Map.Entry p:phonebook.entrySet()){    
       System.out.println(p.getKey()+" "+p.getValue());    
      }    
	}
}