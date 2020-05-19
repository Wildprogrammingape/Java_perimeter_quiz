

public class first_java_progam {

    public static void main(String[] args) {
        int i = 1;
        String s = "hello world";                   // capital   String
        double [] a = new double[5];
        
        System.out.println(a);
        System.out.println(a.length);
        System.out.println(i);
        System.out.println("hello world");         // capital System 
        
        System.out.println(abs(-6));    
    }

// fuction to calculate absolute value
    public static int abs(int x) {
        if (x<0) return -x;
        else    return x;
    }

}

// What is “String args[]”parameter in main method Java? 

// "public" means that main() can be called from anywhere.

// "static" means that main() doesn't belong to a specific object

// "void" means that main() returns no value

// "main" is the name of a function. main() is special because it is the start of the program.

// "String[]" means an array of String.

// "args" is the name of the String[] (within the body of main()). "args" is not special; you could name it anything else and the program would work the same.

// String[] args is a collection of Strings, separated by a space, which can be typed into the program on the terminal.
//  More times than not, the beginner isn't going to use this variable, but it's always there just in case.