package ru.idea.converter;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        {
            int choice, weight, distance;
            double amount;
            double Граммы, Килограммы, Метры, Миль, Ярды, Футы;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Выберите, что переводить: 1: масса, 2: расстояние ");
            System.out.println("Ваш выбор: ");

            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Выберите единицу измерения: 1 - грамм, 2 - кг");
                weight = scanner.nextInt();
                System.out.println("Какую сумму хотите конвертировать?");
                amount = scanner.nextFloat();
                switch (weight)
                {
                    case 1: // граммы
                        System.out.println(amount + " Грамм ");
                        Килограммы = amount / 1000;
                        System.out.println(amount + " Грамм = " + Килограммы + " Килограмм ");
                        break;
                    case 2: // кг
                        System.out.println(amount + " Килограмм ");
                        Граммы = amount * 1000;
                        System.out.println(amount + " Килограмм = " + Граммы + " Грамм ");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            } else if (choice == 2) {
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                distance = scanner.nextInt();
                System.out.println("Какую сумму хотите конвертировать?");
                amount = scanner.nextFloat();
                switch (distance)
                {
                    case 1: // метры
                        System.out.println(amount + " Метр(ов)");
                        Миль = amount * 0.00062;
                        System.out.println(amount + " Метр(ов) = " + Миль + " Миль");
                        Ярды = amount * 1.09;
                        System.out.println(amount + " Метр(ов) = " + Ярды + " Ярд");
                        Футы = amount * 3.28;
                        System.out.println(amount + " Метр(ов) = " + Футы + " Футы");
                        break;
                    case 2: // мили
                        System.out.println(amount + " Миль");
                        Метры = amount * 1609.34;
                        System.out.println(amount + " Миль = " + Метры + " Метров");
                        Ярды = amount * 1760;
                        System.out.println(amount + " Миль = " + Ярды + " Ярд");
                        Футы = amount * 5280;
                        System.out.println(amount + " Миль = " + Футы + " Футы");
                        break;
                    case 3: // ярд
                        System.out.println(amount + " Ярды");
                        Метры = amount * 0.91;
                        System.out.println(amount + " Ярды = " + Метры + " Метров");
                        Миль = amount * 0.00057;
                        System.out.println(amount + " Ярды = " + Миль + " Миль");
                        Футы = amount * 3;
                        System.out.println(amount + " Ярды = " + Футы + " Футы");
                        break;
                    case 4: // Футы
                        System.out.println(amount + " Футы");
                        Метры = amount * 0.3;
                        System.out.println(amount + " Футы = " + Метры + " Метров");
                        Миль = amount * 0.00019;
                        System.out.println(amount + " Футы = " + Миль + " Миль");
                        Ярды = amount * 0.33;
                        System.out.println(amount + " Футы = " + Ярды + " Ярды");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            } else {
                System.out.println("Введено неверное значение");
                return;
            }
        }
    }
}
