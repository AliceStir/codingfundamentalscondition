package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = getArray(input);

        System.out.println("Inainte de sort:");
        afisare(array);

        sort(array);

        System.out.println("Dupa sortare:");
        afisare(array);
    }

    private static void afisare(int[] array) {
        for (int i : array)
            System.out.println(i + " ");

    }

    private static void sort(int[] array) {
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                   int aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }

        }


    }

    private static int[] getArray(Scanner input) {
        System.out.println("Introduceti elementele");
        String line = input.nextLine();
        String[] elements = line.split(" ");
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++)
            array[i] = Integer.valueOf(elements[i]);
        return array;
    }
}