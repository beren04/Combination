package first;

import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" C(n,r)! \n enter the n");
        int n = input.nextInt();
        System.out.println(" C(n,r)! \n enter the r");
        int r = input.nextInt();
        if(n<r){
            System.out.println("Please enter n>r");
        }else {

            int factorial1 = 1;
            int factorial2 = 1;
            int factorial3 = 1;
            int substraction = n - r;

            for (int i = 1; i <= n; i++) {
                factorial1 = factorial1 * i;
            }
            System.out.println("n's factorial:" + factorial1);
            for (int j = 1; j <= r; j++) {
                factorial2 = factorial2 * j;
            }
            System.out.println("r's factorial:" + factorial2);
            for (int k = 1; k <= substraction; k++) {
                factorial3 = factorial3 * k;
            }
            System.out.println("(n-r)'s factorial:" + factorial3);
            int multiply = factorial2 * factorial3;
            System.out.println("C(" + n + "," + r + ")=" + factorial1 / multiply);
        }
    }
}
