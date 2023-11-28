package Evaluation;

import java.util.Scanner;
import java.lang.String;

public class logicalString {

    public static String concatenation(String[] arr){
        String str = "";
        for (int i=0 ;i<arr.length;i++){
            str += arr[i];
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The the number of strings to want to conacatenate:");
        int n= sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the string ");
            str[i] = sc.next();
        }
        String res = concatenation(str);
        System.out.println("\nThe result after concatenation :"+res);
        sc.close();
    }
    
}
