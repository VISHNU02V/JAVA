// create a file and add the number into it ,read the file and if it is prime ,add to prime.txt .If it is composite ,add to composite.txt

import java.util.Scanner;
import java.io.*;

class Filehandling2 {
    public static void main(String[] args) throws Exception {
        int c[] = new int[90];
        int p[] = new int[90];
        int co[] = new int[90];
        int in[] = new int[90];
        int r1[] = new int[90];
        int r2[] = new int[90];
        int r3[] = new int[90];
        int k = 0, z = 0, n = 0;
        System.out.println();
        System.out.println();
        System.out.println("///////  TO ADD THE NUMBER INTO FILES //////");
        System.out.println("--------------------------------------------- ");
        File f1 = new File("content.txt");
        File f2 = new File("prime.txt");
        File f3 = new File("composite.txt");
        FileWriter wf2 = new FileWriter(f2);
        FileWriter wf3 = new FileWriter(f3);
        FileWriter wf1 = new FileWriter(f1);
        System.out.println();
        System.out.println();
        System.out.println("////    TO ADD THE NUMBERS INTO A CONTENT FILE ");
        System.out.println("*************************************************");
        System.out.println();
        System.out.print("enter the limit :: ");
        System.out.println();
        Scanner a = new Scanner(System.in);
        int a1 = a.nextInt();
        for (int i = 0; i < a1; i++) {
            System.out.println();
            System.out.print("enter the number into the file :");
            Scanner b = new Scanner(System.in);
            int b1 = b.nextInt();
            wf1.write((int) b1);
        }
        wf1.close();
        FileReader rf1 = new FileReader(f1);
        int ch, v = 0;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("////    THE ELEMENTS ENTERED BY USER ");
        System.out.println("**************************************");
        System.out.print(" [ ");
        while ((ch = rf1.read()) != -1) {
            c[v] = (int) ch;
            System.out.print(" " + c[v] + ", ");
            v = v + 1;
        }
        System.out.print(" ] ");
        System.out.println();
        System.out.println();
        System.out.println("////    COMMENTS ON THE INPUT ");
        System.out.println("*******************************");
        System.out.println();
        for (int i = 0; i < v; i++) {
            int s = 0;
            if (c[i] == 1) {
                System.out.println("1 is neither compositive nor prime number"); // displaying 1 as it is neither
                                                                                 // compositive
            } else { // nor prime number ......................
                for (int j = 1; j < c[i]; j++) {
                    if (c[i] % j == 0) {
                        s = s + 1;
                    }
                }
                if (s == 1) {
                    wf2.write(c[i]);
                    p[z] = c[i];
                    in[n] = i;
                    n++;
                    z++;
                } else {
                    co[k] = c[i];
                    k++;
                    wf3.write(c[i]);
                }
            }
        }
        wf2.close();
        wf3.close();
        System.out.print("PRIME NUMBER :: "); // displaying the prime number ...........
        System.out.print("[ ");
        for (int i = 0; i < z; i++) {
            System.out.print(" " + p[i]);
        }
        System.out.print(" ] ");
        System.out.println();
        System.out.print("COMPOSITE NUMBER :: "); // displaying the composite number .........
        System.out.print("[ ");
        for (int i = 0; i < k; i++) {
            System.out.print(" " + co[i]);
        }
        System.out.print(" ] ");
        System.out.println();
        System.out.println();
        System.out.println("////    OUTPUT FROM FILES   ////"); // output in the file ......................
        System.out.println("*******************************");
        System.out.println();
        if (f2 != null) {
            System.out.println("Successfully written in to the prime number file");
        }
        if (f3 != null) {
            System.out.println("Successfully written in to the composite number file");
        }
        FileReader rf0 = new FileReader(f1);
        int ch1, v1 = 0;
        System.out.println();
        System.out.println();
        System.out.println("////    THE CONTENTS IN THE FILE content.txt");
        System.out.println("*******************************************");
        while ((ch1 = rf0.read()) != -1) {
            r1[v1] = (int) ch1;
            System.out.print(" " + r1[v1] + ", ");
            v1 = v1 + 1;
        }
        System.out.println();
        FileReader rf2 = new FileReader(f2);
        FileReader rf3 = new FileReader(f3);
        int ch2, v2 = 0;
        System.out.println();
        System.out.println();
        System.out.println("////    THE CONTENTS IN THE FILE prime.txt");
        System.out.println("******************************************");
        while ((ch2 = rf2.read()) != -1) {
            r2[v2] = (int) ch2;
            System.out.print(" " + r2[v2] + ", ");
            v2 = v2 + 1;
        }
        System.out.println();
        int ch3, v3 = 0;
        System.out.println();
        System.out.println();
        System.out.println("////    THE CONTENTS IN THE FILE composite.txt");
        System.out.println("**********************************************");
        while ((ch3 = rf3.read()) != -1) {
            r3[v3] = (int) ch3;
            System.out.print(" " + r3[v3] + ", ");
            v3 = v3 + 1;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("************************************************* ");
        System.out.println("        T   H   A   N   K       Y   O   U        ");
        wf1.close();
        wf2.close();
        wf3.close();
        rf0.close();
        rf1.close();
        rf2.close();
        rf3.close();
    }
}