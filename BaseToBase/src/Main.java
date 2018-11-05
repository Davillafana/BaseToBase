import java.util.Scanner;
import java.lang.String;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	// write your code here

            System.out.println("================================");
            System.out.println("========= Base converter =======");
            System.out.println("================================");



        int base1;
        int num1;
        int base2;
        int num2;
        int yes;
        int no;



        Scanner input = new Scanner(System.in);

        System.out.println("please enter the base of the first number");
        base1 = input.nextInt();

        System.out.println("please enter the first number");
        num1 = input.nextInt();

        System.out.println("please enter the base to convert to");
        base2 = input.nextInt();

        System.out.println("please enter the second number");
        base2 = input.nextInt();


        Scanner op = new Scanner(System.in);

        System.out.println("is this what you want?");
        System.out.println("input 1 for yes or input 2 for no");

        yes = input.nextInt();
        switch(yes)
        {
            case(1):
                System.out.println("cool you chose yes");
                break;
            case(2):
                System.out.println("cool you chose no, back to the beginning!");
                break;
        }
    }
}
        //operation = op.next();}