package com.java.checker;

import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        int idNum;
        String name;
        System.out.println("Enter the Id Number: ");
        Scanner sc = new Scanner(System.in);
        idNum = sc.nextInt();

        System.out.println("Enter the Name: ");
        Scanner ne = new Scanner(System.in);
        name = ne.nextLine();
        System.out.println("Hii "+name+" And Your Id Number is "+idNum);

        if(idNum < 1100){
            System.out.println("Your not from this country...Who the Hell Are you,,,");
        } else {
            System.out.println("Your From this Country... The Country Welomes you,,,");
        }



    }
}
