import java.util.*;
class SetOperations{
	public static void main(String args[]){
		Set<Integer> set=new HashSet<>();
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(104);
		set.add(105);
		set.add(106);
		set.add(107);
		set.add(108);
		set.add(109);
		set.add(110);
		System.out.println("Printing the Set1 : "+set);
		//display(set);
		set.remove(108);
		System.out.println("After removing the element : "+set);
		//display(set);
		set.add(103);
		System.out.println("After adding duplicate element : "+set);
		Set<Integer> set2=new HashSet<>();
		set2.add(101);
		set2.add(102);
		set2.add(210);
		System.out.println("Printing the Set2 : "+set2);
		Set<Integer> CommonElements=new HashSet<>(set);
		CommonElements.retainAll(set2);
		System.out.println("Common Elements in 2 sets : "+CommonElements);
		
	}
	static void display(Set<Integer> set){
		for(int ele:set){
			System.out.print(ele+" ");
		}
	}
}