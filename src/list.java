import java.util.*;
public class list {
	
	public static void main(String args[])
	{
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(3);
		list2.add(2);
		list2.add(1);
		list2.add(4);
		System.out.println("ArrayList:");
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}
		
		HashSet<Integer> list3=new HashSet<Integer>();
		list3.add(3);
		list3.add(2);
		list3.add(1);
		list3.add(4);
		System.out.println("Set:");
		Iterator<Integer> i=list3.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(1,"Vaibhav");
		m.put(2,"Vanshika");
		m.put(3,"Vriti");
		m.put(3,"Yajur");
		
		System.out.println("Hash Map:");
		for(Map.Entry map:m.entrySet())
		{
			System.out.println(map.getKey()+":"+map.getValue());
		}
	}
}
