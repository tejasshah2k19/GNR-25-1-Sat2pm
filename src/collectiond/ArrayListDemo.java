package collectiond;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		// array ->
		// 4
		// 5
		ArrayList list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add("royal");

		Student s = new Student();
		list.add(s);

		System.out.println(list);// 10 20 30 40 50

		ArrayList<Integer> list1 = new ArrayList<>();// 7 diamond

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
//			list1.add("royal");

		System.out.println(list1);

		// single element
		System.out.println(list1.get(2));

//			System.out.println(list1.get(10));
//			System.out.println(list1.get(-1));

		//iterate print 
		System.out.println("Iteration : ");
		for(int i=0; i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("Iteration : ");
		for(Integer x:list1) {
			System.out.println(x);
		}
		
		//take 5 numbers from user and store in ArrayList 
			//find out sum and min from it 
			//sort it 
		
	}
}

class Student {

}
