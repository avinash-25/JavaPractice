import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] ar = {12, 3, 45, 76, 8};
        int len = ar.length;
        int num = 0,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search :");
        num = sc.nextInt();
        for(int i=0;i<len;i++){
            if(ar[i] == num){
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("Element found");
        else
            System.out.println("Element not found");

    }
}
