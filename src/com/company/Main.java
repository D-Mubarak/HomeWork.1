package com.company;

public class Main {

    private static Object String;

    public static void main(String[] args) {
        String str;
        int NUM = 26;
        String word = " Градусов на улице";
        str = (NUM + word);
        System.out.print(NUM + ",");
        System.out.print(word + ",");
        System.out.println(str );

        if(NUM >= 1){
            System.out.println(" Вы сохранили положительное число");
        }

        if (NUM <=-1){
            System.out.println("Вы сохранили отрицательное число");

        }
        if (NUM == 0){
            System.out.println("Вы сохранили нуль");
        }
    }
}
