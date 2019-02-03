package ch1.caelum.java.basics;

//import java.util.ArrayList;

/**
 * @author Mariana Azevedo
 * @since 03/12/2018
 * 
 * Question 1.2.1 (page 16) - Choose the appropriate option when trying to compile and run the following file 
 * without any parameters on the command line, such as java D:
 * 
 * import java.util.ArrayList;
 * 
 * class Question6 {

	    public static void main(String[] args) {
		
		     ArrayList<String> existing = new ArrayList<>();
		
		     for(String arg : args) {
			     if(new E().exists(arg))
				     existing.add(arg);
		     }
	    }
    }

    import java.io.*;
    
    class E{
	    public boolean exists(String name) {
		    File f = new File(name);
		    return f.exists();
	    }
    }
 * 
 * a) File doesn't compile (x)
 * b) The file compiles, but gives execution error, since array is null
 * c) The file compiles, but gives execution error, since array has size zero
 * d) Run and print false
 * e) Run and print true
 * f) Run and prints nothing
 *
 * Please, uncomment the code below to analyze the answer
 */
class Question06 {
//
//	public static void main(String[] args) {
//		
//		ArrayList<String> existing = new ArrayList<>();
//		
//		for(String arg : args) {
//			if(new E().exists(arg))
//				existing.add(arg);
//		}
//	}
//
}
//
//import java.io.*;
//
class E{
//	public boolean exists(String name) {
//		File f = new File(name);
//		return f.exists();
//	}
}
