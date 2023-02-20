package Assignment_Of_Mutable_String_in_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_character_Alphabetically {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String s1=sc.nextLine();

        char arrs1[]=s1.toCharArray();

        Arrays.sort(arrs1);

        System.out.println(arrs1);
    }
}
