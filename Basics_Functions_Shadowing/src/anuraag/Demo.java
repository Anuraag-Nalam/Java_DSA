package anuraag;

import java.util.Arrays;
import java.util.Scanner;
//nth fibonacci number
//public class Demo {
//    public static void main(String[] args) {
//        int a=0,c=0;
//        int b=1;
//        int i=0;
//        int n=4;
//        if(n==1||n==2){
//            System.out.println(n-1);
//        }else{
//            while(i<n-1){
//                a=b;
//                b=c;
//                c=a+b;
//                i+=1;
//            }
//            System.out.println(c);
//        }
//    }
//}

//Java is always pass by value
public class Demo {
//    public static void main(String[] args) {
//        //example of pass by value
//        String name="anuraag";
//        changeName(name);
//        System.out.println(name);
//    }
//    //otherName reference will be pointing to name object but new object will be created inside the function
//    //iN CASE OF PRIMITIVES, ONLY VALUE IS PASSED, FOR OBJECTS, THE COPY OF REFERENCE IS PASSED
//    static void changeName(String otherName){
//        otherName="splitwise";
//    }
//public static void main(String[] args) {
//    //shadowing
//    int x=10;
//    fun(x);
//    System.out.println(x);
//}
//static void fun(int value){
//    int x=20;
//    //the variable present in the global scope is shadowed
//    System.out.println(value+" "+x);
//}
//}
//shadowing begins when the local variable is declared but not defined


//varargs-passing multiple arguments

    public static void main(String[] args) {
        fun("anurag",1,2,1,2,3,34,54,5,7,8,78);
    }
    //basically we can pass any value or no value to the function, it treats as if it is an array of values.
    static void fun(String a,int ...v){
        System.out.println(a+" "+Arrays.toString(v));//hence arrays.toString function
        //vargargs should always come at the end. 
    }
}

