package corejava;

//import java.util.Scanner;

class program {

    public static void main(String[] args) {
        /*
         * int i, j, n = 5;
         * for (i = 1; i <= n; i++)
         * {
         * for (j = n; j >= i; j--)
         * {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        /*
         * int i, j, n = 5;
         * for (i = n - 1; i >= 0; i--) {
         * for (j = 0; j <= i; j++) {
         * System.out.print(j + 1);
         * }
         * System.out.println();
         * }
         */

        /*
         * int i, j, n = 5, num = 1;
         * for (i = 0; i <= n; i++) {
         * for (j = n; j >= i; j--) {
         * System.out.print(num++);
         * }
         * System.out.println();
         * num = 1;
         * }
         */

        // input statement
        /*
         * Scanner s = new Scanner(System.in);
         * System.out.print("enter the number ");
         * int a = s.nextInt();
         * System.out.println("you have entered " + a);
         */

        /*
         * product p = new product();
         * String result = p.AddProduct();
         * p.DeleteProduct();// function calling//
         * p.GetProductName();
         * System.out.print(result);
         */

        /*
         * mobile mobj = new mobile();
         * mobj.Dial();
         * mobj.Receive();
         * int output = mobj.GetImeNumber(100);
         * System.out.print(output);
         */

        /*
         * samsung sam = new samsung();
         * sam.SendMessage();
         */

        // Report reportObj = new Report(reportType="pdf",deptGroup="IT");

        /*
         * int i, j, k, n = 4;
         * for (i = 1; i <= n; i++) {
         * for (j = n; j >= i; j--) {
         * System.out.print(" ");
         * }
         * 
         * for (k = 1; k <= i; k++) {
         * System.out.print(" *");
         * }
         * System.out.println();
         * 
         * }
         */

        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            for (j = n; j >= 1; j--)

                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(" *");
                }
            System.out.println();
        }

    }
}
