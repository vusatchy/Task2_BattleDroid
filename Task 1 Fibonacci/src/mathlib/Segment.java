package mathlib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by white on 20.04.2017.
 */
public class Segment {

    private  int minValue;
    private  int maxValue;
    private List<Integer> oddNumbers = new ArrayList<>();
    private List<Integer> evenNumbers = new ArrayList<>();




    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public Segment(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        setOddAndEvenNumbers();
    }

    public void printOddNumbers(){
        System.out.println("Odd numbers:"+oddNumbers.toString());
    }


    public void printEvenNumbers(){
        System.out.println("Even numbers:"+evenNumbers.toString());
    }



    private void setOddAndEvenNumbers(){

        for (int i=minValue;i<=maxValue;i++){
            if(i%2==0){
                evenNumbers.add(i);
            }
            else  oddNumbers.add(i);
        }
        Collections.reverse(oddNumbers);
    }

    public  int getMaxOdd(){
        return Collections.max(oddNumbers);
    }

    public int getMaxEven(){
        return Collections.max(evenNumbers);
    }
}
