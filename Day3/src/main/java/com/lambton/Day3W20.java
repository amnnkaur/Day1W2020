package com.lambton;

import java.sql.SQLOutput;

public class Day3W20
{
    public static void main(String[] args) {

        int a[];
        int c[]=new int[5];
        c[0]= 10;
        c[1]= 20;
        System.out.println("C ="+c[1]);

        a = new int [2];
        a[0]=100;
        a[1]=200;
        System.out.println("A ="+a[1]);

        int d[]= new int[]{1,2,3,4,5,6,7,8};
        System.out.println("D ="+d[1]);

        System.out.println("Length is="+d.length);

        for(int i=0; i<d.length; i++){
            System.out.println("Array D ="+d[i]);
        }

        int[] x, y;
        int x1,y1[],q;
        int[][] x2, y2;

        x2= new int[3][3];

        arrayCalculations();
        reverseString();
        stringArray();
        stringProg();



    }
    public static void arrayCalculations()
    {
        int arr1[]= new int[]{23,21,54,65,78,22,75,53};
        int sum = arr1[0];
        int min = arr1[0];
        int max = arr1[0];
        int avg ;

        for(int j = 1; j < arr1.length; j++) {
            System.out.print(arr1[j] +" ");

            if (arr1[j] < min) {
                min = arr1[j];
            }
            if (arr1[j] > max) {
                max = arr1[j];
            }
            sum = sum + arr1[j];


        }
        avg= sum/arr1.length;

        System.out.println("Sum ="+sum);
        System.out.println("Min ="+min);
        System.out.println("Max ="+max);
        System.out.println("Avg ="+avg);

    }

    public static void reverseString()
    {
        int arr2[]= new int[]{1,2,3,4,5,6,7,8,9,10};

        for(int m=arr2.length-1; m>=0; m--)
        {
            System.out.println(arr2[m]);
        }
    }

    public static void stringArray()
    {
        String[] str = new String[]{"Hello World"};
        for(int t=0; t<str.length; t++)
        {
            System.out.println(str[t]);
        }

    }

    public static void stringProg() {
        String[] str3;
        str3 = new String[10];
        str3[0] = "Canada";
        str3[1] = "India";
        str3[2] = "Nepal";
        str3[3] = "Toronto";
        str3[4] = "New York";
        str3[5] = "Mississauga";
        str3[6] = "Scarborough";
        str3[7] = "Brampton";
        str3[8] = "London";
        str3[9] = "Punjab";

        for (int s = 0; s < str3.length; s++) {
            System.out.println(str3[s]);
            System.out.println(revString(str3[s]));
        }

    }


    public static String revString (String str)
    {
        char c [] = str.toCharArray();
        String rev="";
        for (int i = c.length-1; i>=0; i--)
        {
            rev= rev+c[i];
        }
        return rev;
    }

    /*public static String swapString (String str) {
        String temp;
        char names[] = str.toCharArray();
        int len =names.length;
      */


}




