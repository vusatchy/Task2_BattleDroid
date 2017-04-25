package mathlib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by white on 20.04.2017.
 */
public class Fibonacci {
    private int size;
    private List<Integer> fibSequence;


    public int getSize() {
        return size;
    }

    public Fibonacci(int startValue1,int startValue2,int size ) {
        this.size = size;
        makeFibonacciSequence(startValue1,startValue2);

    }

    private void makeFibonacciSequence(int startValue1,int startValue2  ){
        fibSequence=new ArrayList<>(6);
        fibSequence.add(startValue1);
        fibSequence.add(startValue2);
        Collections.sort(fibSequence);


        for(int i=fibSequence.size();i<size;i++){
            fibSequence.add(fibSequence.get(i-1)+fibSequence.get(i-2));
        }
    }

    public List<Integer> getFibSequence() {
        return fibSequence;
    }


    public void printFibonacciSequence(){
        System.out.println("Fibonacci sequance: "+fibSequence.toString());
    }

    public  double getOddPerc(){
        int count=0;
        for (int number: fibSequence
                ) {
            if(number%2!=0) count++;
        }
        return  (double)count/size*100.0;
    }

    public  double getEvenPerc(){
        int count=0;
        for (int number: fibSequence
             ) {
            if(number%2==0) count++;
        }
        return  (double)count/size*100.0;
    }


}

