import java.util.Scanner;

public class Exception_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in the array:" );
            int []arr = new int[s.nextInt()];
            for (int i = 0; i <arr.length ; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println("Enter elements in arrays are:");
            for (int j = 0; j < arr.length ;j++) {
                System.out.print(arr[j]+"\t");
            }
            System.out.println(arr[s.nextInt()]);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
