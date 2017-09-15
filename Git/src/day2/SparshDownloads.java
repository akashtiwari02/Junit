package day2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SparshDownloads {

    


    	@BeforeClass
    	public static void m1(){
    		System.out.println("in method 1");
    	}
    	
    	@Test
    	public void m2(){
    		System.out.println("in method 2");
            
    	}
    	@AfterClass
    	public static void m3(){
    		System.out.println("in method 2");
    	}
}
