package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int countOfPerson = scanner.nextInt();
            int countOfDays = scanner.nextInt();

            Vacation vacation =new Vacation(countOfPerson,countOfDays);
            vacation.calculate();

        }
        catch (InputMismatchException exception){
            System.out.println("Вы ввели неправельно данные .Введите число");
        }
    }
}