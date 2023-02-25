package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Chapter5 {
	public static void main(String[] args) throws Exception{
		
		LocalDate l1 = LocalDate.of(2021,10,21);
		LocalDate l2 = LocalDate.of(2021,9,15);
		LocalDate l3 = LocalDate.of(2021,12,4);
		LocalDate l4 = LocalDate.of(2021,8,10);
		LocalDate l5 = LocalDate.of(2021,11,9);		
		
		Task t1 = new Task(l1,"牛乳を買う。");
		Task t2 = new Task(l2,"○○社面談。");
		Task t3 = new Task(l3,"手帳を買う。");
		Task t4 = new Task(l4,"散髪に行く。");
		Task t5 = new Task(l5,"スクールの課題を解く。");
				
		ArrayList<Task> list1 = new ArrayList<Task>();
		list1.add(t1);
		list1.add(t2);
		list1.add(t3);
		list1.add(t4);
		list1.add(t5);
		
		Collections.sort(list1);
		
		for (Task t : list1) {
			System.out.println(t.getDatetime() + ":" + t.getContent());
		}
		
		

	}

}
