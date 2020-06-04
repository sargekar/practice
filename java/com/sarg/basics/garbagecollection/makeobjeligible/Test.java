/**
 * Ways to make obj eligible for GC: (not 100% reliable)
 * 1. declared inside method.
 * 2. Reassigning reference variable
 * 3. Nullify reference variable
 * 4. Anonymous objects
 * 
 * Note: output order and variables picked up by GC might vary 
 */
package garbagecollection.makeobjeligible;

public class Test 
{ 
      
    String obj_name; 
      
    public Test(String obj_name)  
    { 
        this.obj_name = obj_name; 
    } 
      
    static void show() { 
    	Test t1 = new Test("t1");  // t1 becomes unreachable when show() removed 
        display(); 
          
    } 
    
    static void display() { 
    	Test t2 = new Test("t2");    //t2 becomes unreachable when display() removed 
    } 
      
   
    @Override
     protected void finalize() throws Throwable  
    { 
    	// will print name of object 
        System.out.println(this.obj_name + " successfully garbage collected"); 
    } 
    
    // Driver method 
    public static void main(String args[]) 
    { 
       /* Method 1: Obj created inside method (here inside show() and display() gets GC*/
        show();  
         
        System.gc();   // calling garbage collector 
        
        /* Method 2: Reassigning reference variable*/
        Test t1 = new Test("t1");
        Test t2 = new Test("t2");
        t1=t2; 
        System.gc(); //t1 will be GC as it doesn't have reference
        
        /* Method 3: Nullify reference variable*/
        Test t3 = new Test("t3");
        t3=null;
        System.gc(); //t3 will be GC as it doesn't have reference
        
        /* Method 4: Anonymous class*/
        new Test("t4");
        System.gc();
    } 
      
   
} 

