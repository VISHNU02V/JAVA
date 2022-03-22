// create a file and add the number into it ,read the file and if it is prime ,add to prime.txt .If it is composite ,add to composite.txt

import java.util.Scanner;
import java.io.*;

class Filehandling2 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("content.data");
        File f2 = new File("prime.data");
        File f3 = new File("composite.data");
        FileWriter wf1 = new FileWriter(f1);
        System.out.println(" To add the number in to a content file ");
        System.out.print("enter the limit :: ");
        Scanner a = new Scanner(System.in);
        int a1 = a.nextInt();
        for (int i = 0; i < a1; i++) {
            System.out.println();
            System.out.print("enter the number into the file :");
            Scanner b = new Scanner(System.in);
            int b1 = b.nextInt();
            wf1.write(b1);
        }
        FileReader rf1 = new FileReader(f1);
        FileWriter wf2 = new FileWriter(f2);
        FileWriter wf3 = new FileWriter(f3);
        int ch = 0;
        while ((ch = rf1.read()) != -1) {
            System.out.println(ch);
            for (int i = 0; i < a1; i++) {
                int s = 0;
                if (ch == 1) {
                    System.out.println("1 is neither compositive nor prime number");
                } else {
                    for (int j = 1; j < ch; j++) {
                        if (ch % j == 0) {
                            s = s + 1;
                        }
                    }
                    if (s == 1) {
                        wf2.write(ch);
                    } else {
                        wf3.write(ch);
                    }
                }
            }
        }
        if (f2 != null) {
            System.out.println("Successfully written in to the prime number file");
        }
        if (f3 != null) {
            System.out.println("Successfully written in to the composite number file");
        }
        wf1.close();
        wf2.close();
        wf3.close();
        rf1.close();
        a.close();
    }
}