import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_keyword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int []arr = {10,20,30,40,50};
            int index = sc.nextInt();
            System.out.println(a/b);

            System.out.println(arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException | InputMismatchException obj){
            System.out.println(obj);
        }
        finally {
            {
                System.out.println("you are inside in finally bock");
            }
        }
    }
}
