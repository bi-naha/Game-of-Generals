package cli;
import java.util.Scanner;

public class MyScanner {
    private static MyScanner myScanner;
    private Scanner scanner;

    public static MyScanner getScanner(){
        if (myScanner == null)
            return new MyScanner();
        return myScanner;
    }

    private MyScanner(){
        this.scanner = new Scanner(System.in);
    }

    public String scan(){
        String ans=scanner.nextLine();
        if (ans.equals("0")){
            System.exit(0);
        }

        return ans;
    }
}
