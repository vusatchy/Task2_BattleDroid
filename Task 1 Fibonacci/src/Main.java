import mathlib.Fibonacci;
import mathlib.Segment;

import java.util.ArrayList;

/**
 * Created by white on 20.04.2017.
 */
public class Main {


    public static void main(String[] args) {
        intsScanner sc = intsScanner.getInstance();
        System.out.print("Input min value:");
        int minValue=sc.getNextInt();
        System.out.print("Input max value:");
        int maxValue=sc.getNextInt();
        Segment segment = new Segment(minValue,maxValue);
        segment.printEvenNumbers();
        segment.printOddNumbers();
        System.out.println("+--------------------------+");
        System.out.print("Input fibs size:");
        int fibsSize=sc.getNextInt();
        Fibonacci fibonacci = new Fibonacci(segment.getMaxEven(),segment.getMaxOdd(),fibsSize);
        fibonacci.printFibonacciSequence();
        System.out.println("Percent of even numbers:"+fibonacci.getEvenPerc()+"%");
        System.out.println("Percent of odd numbers:"+fibonacci.getOddPerc()+"%");
    }
}
