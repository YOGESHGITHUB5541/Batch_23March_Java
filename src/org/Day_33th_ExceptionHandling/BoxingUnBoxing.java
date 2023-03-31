package org.Day_33th_ExceptionHandling;

public class BoxingUnBoxing {
	public static void main(String[] args) {
		int a=10;
		Integer obj = new Integer(a);  //Boxing
		Integer obj1 = a;             //auto-boxing
		Integer obj2 = 10;            //auto boxing
		int a2 = obj.intValue();     //Un-boxing
		int a3 = obj2;               //auto-Unboxing
		
		
		float f = 10.4f;
		Float floatboj = new Float(f);
		Float floatobj2 = f;
		float f2 = floatobj2.floatValue();
	    float f3 = floatobj2;
	    
	    byte b = 20;
	    Byte obj3 = new Byte(b);
	    Byte obj4 = b;
	    Byte obj5 = 20;
	    byte b2 = obj3.byteValue();
	    byte b3 = obj5;
	    
	    long l = 30;
	    Long L = new Long(l);
	    Long L1 = l;
	    Long L2 = (long) 30;
	    long L3 = obj.longValue();
	    long L4 = L2;
	    
	    
	    
	    
	    
		

	}

}
