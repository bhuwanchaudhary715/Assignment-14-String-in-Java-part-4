package Assignment_Of_Mutable_String_in_Java;

import java.util.Scanner;

public class Reverse_a_String {

    public static void main(String[] args) {


          Scanner sc=new Scanner(System.in);

          System.out.println("Enter the value of String:");
          String s2=sc.nextLine();

          StringBuffer s1=new StringBuffer(s2) ;
          s1.reverse();

          System.out.println(s1);

    }
}
