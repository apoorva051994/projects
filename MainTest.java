package concAssignment;

import concAssignment.Departmentsys;
import concAssignment.Main;

public class MainTest {
	 public static void main(String[] args) {
	        Departmentsys d1 = new Departmentsys();
	 
	        for (int i = 1; i < Departmentsys.ACCOUNTS; i++) {
	        
	            Thread t1 = new Thread(new Main(d1, i));
	            t1.start();
	        }
	            for (int j = 1; j < Departmentsys.DEPARTMENTS; j++) {
	    	       
		            Thread t2 = new Thread(new Main(d1, j));
		            t2.start();
	        }
	    }
	
	}
	



