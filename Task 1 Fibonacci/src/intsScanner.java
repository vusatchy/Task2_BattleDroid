import java.util.Scanner;

/**
 * Created by white on 24.04.2017.
 */
public class intsScanner {
    private Scanner scanner;
    private static intsScanner instance=null;

    private  intsScanner(){
        scanner=new Scanner (System.in);
    }

    public int getNextInt(){
        while (!scanner.hasNextInt()){
            System.out.println("Input int number");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static synchronized intsScanner getInstance(){

        if(instance==null)
            instance=new intsScanner();
        return instance;
    }
}
