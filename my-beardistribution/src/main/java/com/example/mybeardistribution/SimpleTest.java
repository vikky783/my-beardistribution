package com.example.mybeardistribution;

public class SimpleTest {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int marks[][]= {{1,2,3,4},{8,5,9,2},{3,54,2,5}};
		int max=0;
		
	    for (int i=0;i<marks.length ;i++ ) {
	    	
	    System.out.println("Printing marks of section"+ marks[i]);
	    for (int j=0;j<marks[i].length ;j++ ) {
	    	if(max<marks[i][j]) {
	    		max=marks[i][j];
	    		System.out.println(j);
	    	}
	    	
	    	
	    }
	    System.out.println("Printing max" +max);
	    
	    
	    }
		
		
	}

}
