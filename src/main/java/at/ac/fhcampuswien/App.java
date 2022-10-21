package at.ac.fhcampuswien;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Random;
import java.util.Scanner;

public class App {


    public static void oneMonthCalendar(int numberOfDaysOfMonth, int startDayOfMonth) {
        int number = 1;
        int week = 1;
        while (number <= numberOfDaysOfMonth) {
            for (int i = 1; i <= 7; i++) {
                if (i < startDayOfMonth && week == 1) {
                    System.out.print("   ");
                } else if ((i >= startDayOfMonth || week > 1) && number <= numberOfDaysOfMonth) {
                    System.out.print(String.format("%2s", number) + " ");
                    number = number + 1;

                }

            }
            System.out.println();
            week = week + 1;

        }
    }

    public static boolean swapArrays(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; array1.length > i; i++) {
                int temp = array2[i];
                array2[i] = array1[i];
                array1[i] = temp;


            }


            return true;

        } else {
            return false;
        }


    }

    public static String camelCase(String input) {
        char[] characterList = input.toCharArray();
        char[] newCharacter = new char[characterList.length];
        int newListIndex = 0;
        for (int i = 0; i < characterList.length; i++) {
            if (characterList[i] >= 65 && characterList[i] <= 90) {
                characterList[i] = (char) (characterList[i] + 32);
            }
        }

        for (int i = 0; i < characterList.length; i++) {
            if (!(characterList[i] == '.' || characterList[i] == ',' || characterList[i] == '\'' || characterList[i] == '?' || characterList[i] == ' ' || characterList[i] == '!')) {
                if (i > 0) {

                    if (characterList[i] >= 97 && characterList[i] <= 122 && characterList[i - 1] == ' ') {
                        newCharacter[newListIndex] = (char) (characterList[i] - 32);
                    } else {
                        newCharacter[newListIndex] = characterList[i];
                    }
                } else {
                    if (characterList[i] >= 97 && characterList[i] <= 122) {
                        newCharacter[newListIndex] = (char) (characterList[i] - 32);
                    } else {
                        newCharacter[newListIndex] = characterList[i];
                    }
                }
                newListIndex++;
            }
        }
        StringBuilder builder = new StringBuilder(newListIndex + 1);
        for (int i = 0; i < newListIndex; i++) {
            builder.append(newCharacter[i]);
        }
        String x = builder.toString();
        System.out.println(x);
        return x;

    }

    public static int checkDigit(int[] digits) {


        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            int weight = i + 2;

            sum += digits[i] * weight;
        }


        int Modulo = (sum % 11);
        int Pru = (11 - Modulo);
        if (Pru == 10) {
            return 0;
        } else if (Pru == 11) {
            return 5;
        } else
            return Pru;

    }


    public static void guessingGame(int number) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Guess number " + (i + 1) + ": ");
            int a = scan.nextInt();

            if (a == number) {
                System.out.println("You won wisenheimer!");
                break;
            } else if (a > number) {
                if (i < 9)
                    System.out.println("The number AI picked is lower than your guess.");
                else
                    System.out.println("You lost! Have you ever heard of divide & conquer?");
            } else {
                if (i < 9)
                    System.out.println("The number AI picked is higher than your guess.");
                else
                    System.out.println("You lost!Have you ever heard of divide & conquer ?");
            }
        }
    }

    public static int randomNumberBetweenOneAndHundred() {
        Random rand = new Random();
        int number = rand.nextInt(100)+1;
        return number;
    }

    public static long[] lcg(long in) {

        long[] out = new long[10];

        long c = 12345L;
        long a = 1103515245L;
        long m = 2147483648L;


        for
        (int i = 0; i < 10; i++) {
            in = (a * in + c) % m;
            out[i] = in;
        }
        return out;
    }
}