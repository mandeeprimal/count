/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.volcon;
import java.util.Scanner;

/**
 *
 * @author itcomputer
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         {
 Scanner a=new Scanner(System.in);
System.out.println("enetr the string");
String str=a.nextLine();
int count=0;
int num=0;
for (int i = 0; i < str.length(); i++)
 {
  char c = str.charAt(i);
  if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
  {
  count++;
  }
   else
   {
    num++;
}
  }
  System.out.println("There are" + " " + count + " " + "vowels and"+num+"  consonant");
}
}
}
       
    

