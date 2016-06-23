package ga.lab;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args){

        String charString;
        double summedDoubles;
        int middleValue;

        //Problem 1:
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");

        //Problem 2:
        reversedOrder();
        //Problem 3:
        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});

        //Problem 4:

        summedDoubles = sumOfValues(new double[]{12.1, 13.9, 7.0});
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{1.23, 2.09, 9.2});
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
      //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        //how do we print a variable to the command line


        //Problem 5:
        charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        //how do we print a variable to the command line

        charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        //how do we print a variable to the command line

        charString = charsToString(new char[]{'I', ' ', 'a','m', ' '});
        //how do we print a variable to the command line

        charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        //how do we print a variable to the command line

        //Problem 6:
        //Put your code for problem 6 here
        ArrayList<String>myStringList = new ArrayList<>();
        myStringList.add("dog");
        myStringList.add("fish");
        myStringList.add("house");
        myStringList.add("koala");
        myStringList.add("nitrogen");

        //Problem 7:
        reversedStringOrder(myStringList);

        //Problem 8:
        printOrAdd(myStringList);

        //Problem 9:
        //Create an int array of an odd size, with the variable name 'oddSizedArray'
        //Make sure the size is at least 5.
        int[] oddSizedArray = new int[9];

        //Problem 10:
        findMiddle(oddSizedArray);
        //how do we print a variable to the command line

        findMiddle(new int[]{2,7,9,12,15});
        //how do we print a variable to the command line

        findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10});
        //how do we print a variable to the command line

        findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145});
        //how do we print a variable to the command line

    }

    /** Question 1 **/
    public static void stringLengthOrValue(String s){
        if(s.length() > 5)
            System.out.println(s);
        else System.out.println(s.length());
    }

    /** Question 2 **/
    public static void reversedOrder() {
        int[] labarray = new int[10];
        //initialize
        for (int i = 0; i <= labarray.length - 1; i++)
            labarray[i] = i;

        int j = 9;
        while (j >= 0) {
            System.out.println(labarray[j]);
            j--;
        }
    }

     /** Question 3 **/
     public static int maxValue(int[] a){
         int largest = 0;

         for(int i = 0; i <= a.length-1; i++){
             a[i] = largest;
             if(largest < a[i])
                 a[i] = largest;
         }
         return largest;
     }

/** Question 4 **/
     public static double sumOfValues(double[] d){
         double sum = 0;
         for(int i = 0; i <=d.length-1; i++){
             sum = sum + d[i];
         }
         return sum;
     }

    /** Question 5 **/
    public static String charsToString(char[] c){
        String concat = "";
        for(int i = 0; i <= c.length-1; i++){
            concat+=c[i];
        }
        return concat;
    }

    /** Question 7 **/
    public static void reversedStringOrder(ArrayList<String> s){
        for(int i = s.size(); i >=0; i--)
            System.out.println(s.indexOf(i));
    }

    /** Question 8 **/
    public static void printOrAdd(ArrayList<String> s){
        if(s.size() == 10){
            for(int i=0;i<=s.size();i++)
                System.out.println(s.indexOf(i));
        }

    }

    /** Question 10**/
    public static int findMiddle(int[] a){
        int midpoint =  1 + (a.length / 2); //integer will say: 9/2 = 4, or 5/2 =2
        return a[midpoint];
    }
}





