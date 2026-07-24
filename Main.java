import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        Scanner kb = new Scanner(System.in);
        System.out.print("Input number:");
        num = kb.nextInt();
        if(num  > 0){
            System.out.println("your number more than zero");
        }
        else{
            System.out.println("your number less or equal zero");
        }
    }

}