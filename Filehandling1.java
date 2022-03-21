//Write a program to added prime numbers to a file named prime.data and added the composite number to the composite.data

import java.io.*;
import java.util.Scanner;                                                                                   //    importing .................

class Filehandling1 {
    public static void main(String[] args) throws Exception {
        int c[] = new int[30];                                                                              //    intialising ...............
        int p[] = new int[30];
        int co[] = new int[30];
        int in[] = new int[30];
        int k = 0, z = 0, n = 0;
        File f = new File("prime.data");
        File b = new File("composite.data");
        System.out.println();
        System.out.println("******* TO ADD THE NUMBERS TO RESPECTIVE FILES *******");
        System.out.println();
        System.out.println("INPUTING ......................");
        System.out.println("");
        System.out.println("enter the number of iterations");                                               //   inputing the limit ......
        Scanner a1 = new Scanner(System.in);
        int a = a1.nextInt();
        System.out.println();
        System.out.println("enter the elements in to the array:");                                          //   inputing the element ....
        for (int i = 0; i < a; i++) {
            Scanner x = new Scanner(System.in);
            int v = x.nextInt();
            c[i] = v;
        }
        System.out.println();
        System.out.println("DISPLAYING THE ARRAY ");                                                        //   displaying the array .....
        System.out.println("************************");
        System.out.println();
        System.out.print(" [ ");
        for (int i = 0; i < a; i++) {
            System.out.print(" " + c[i]);
        }
        System.out.print(" ] ");
        System.out.println(" ");
        FileWriter f1 = new FileWriter(f);
        FileWriter f2 = new FileWriter(b);
        System.out.println();
        System.out.println("///  OUTPUT ///");
        System.out.println("************************");
        System.out.println();
        for (int i = 0; i < a; i++) {
            int s = 0;
            if (c[i] == 1) {
                System.out.println("1 is neither compositive nor prime number");                            //  displaying 1 as it is neither compositive
            } else {                                                                                        //  nor prime number ......................
                for (int j = 1; j < c[i]; j++) {
                    if (c[i] % j == 0) {
                        s = s + 1;
                    }
                }
                if (s == 1) {
                    f1.write(c[i]);
                    p[z] = c[i];
                    in[n] = i;
                    n++;
                    z++;
                } else {
                    co[k] = c[i];
                    k++;
                    f2.write(c[i]);
                }
            }
        }
        System.out.print("PRIME NUMBER :: ");                                                               //   displaying the prime number ...........
        System.out.print("[ ");
        for (int i = 0; i < z; i++) {
            System.out.print(" " + p[i]);
        }
        System.out.print(" ] ");
        System.out.println();
        System.out.print("COMPOSITE NUMBER :: ");                                                           //  displaying the composite number ......... 
        System.out.print("[ ");
        for (int i = 0; i < k; i++) {
            System.out.print(" " + co[i]);
        }
        System.out.print(" ] ");
        FileReader ch1 = new FileReader(f);
        FileReader ch2 = new FileReader(b);
        System.out.println();
        System.out.println();
        System.out.println("/// OUTPUT FROM FILE ///");                                                      //  output in the file ......................
        System.out.println("************************");
        System.out.println();
        if (f1 != null) {
            System.out.println(" successfully written into prime number file");
        }
        if (f2 != null) {
            System.out.println(" successfully written into compositive number file");
        }
        System.out.println();
        System.out.println();
        System.out.println("*************************** ***************************");
        System.out.println("                       THANK YOU ");
        ch1.close();
        f1.close();                                                                                           //    closing all the files .................
        f2.close();
        ch2.close();

    }
}
