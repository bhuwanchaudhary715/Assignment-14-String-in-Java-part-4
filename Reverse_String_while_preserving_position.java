package Assignment_Of_Mutable_String_in_Java;

import java.util.Scanner;

public class Reverse_String_while_preserving_position {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a sentence: ");
            String s1 = scanner.nextLine();

            String[] arrs1 = s1.split(" ");

            StringBuffer s2 = new StringBuffer();

            for (int i = 0; i < arrs1.length; i++) {

                String s3 = arrs1[i];

                StringBuffer s4 = new StringBuffer(s3).reverse();

                s2.append(s4).append(" ");
            }

            System.out.println("Reversed sentence: " + s2.toString().trim());
        }
    }



