package com.example.mybeardistribution.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainSortingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Sad1", 1);
		Student student2 = new Student("Sed", 4);
		Student student3 = new Student("Snd", 6);
		Student student4 = new Student("Scd", 2);
		Student student5 = new Student("Sid", 3);
		
		ArrayList<Student> stdenentList = new ArrayList<>();
		stdenentList.add(student1);
		stdenentList.add(student2);
		stdenentList.add(student3);
		stdenentList.add(student4);
		stdenentList.add(student5);
		
		for(Student str:stdenentList) {
			System.out.println(str.name +" " + str.rollNo);
		}
		System.out.println(stdenentList);
		Collections.sort(stdenentList, new SortBasedOnName());
		for(Student str:stdenentList) {
			System.out.println(str.name +" " + str.rollNo);
		}

	}

}
