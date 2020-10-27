import java.util.*;
public class Triangle {
	
	static float findArea(float a, float b, float c) 
	    { 
	        
	        if (a < 0 || b < 0 || c <0 || (a+b <= c) || 
	            a+c <=b || b+c <=a) 
	        { 
	            System.out.println("Not a valid triangle"); 
	            System.exit(0); 
	        } 
	        float s = (a+b+c)/2; 
	        return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
	    } 
	          
	    // Driver method 
	    public static void main(String[] args)  
	    { 
	    	
	    	Scanner sn = new Scanner(System.in);
	    	System.out.println("Enter the three sides of triangle");
	        float a =  sn.nextFloat();
	        float b =  sn.nextFloat();
	        float c =  sn.nextFloat();
	    	
	      
	        System.out.println("Area is " + findArea(a, b, c));
	    	
	    } 
	} 
