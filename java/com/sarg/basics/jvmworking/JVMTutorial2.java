package jvmworking;

//Java code to demonstrate Class Loader subsystem 
public class JVMTutorial2 
{ 
 public static void main(String[] args) 
 { 
     // String class is loaded by bootstrap loader, and 
     // bootstrap loader is not Java object, hence null 
     //System.out.println(String.class.getClassLoader()); 

     // Test class is loaded by Application loader 
    // System.out.println(JVMTutorial2.class.getClassLoader()); 
 } 
}     
