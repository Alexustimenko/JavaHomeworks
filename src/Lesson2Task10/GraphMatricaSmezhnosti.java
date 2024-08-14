package Lesson2Task10;

import java.util.Scanner;
import java.util.InputMismatchException;
public class GraphMatricaSmezhnosti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vert=-1;
        while (vert <= 0) {
            System.out.println("Введите количество вершин графа (положительное целое число):");
            try {
                vert = input.nextInt();
                if (vert <= 0) {
                    System.out.println("Количество вершин должно быть положительным числом.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Введите целое положительное число.");
                input.next(); // Очистка некорректного ввода
            }
        }
        int[][] matrixSm = new int[vert][vert];
        System.out.println("Введите количество ребер:");
        int edges = -1;
        while (edges < 0) {
            try {
                edges = input.nextInt();
                if (edges < 0) {
                    System.out.println("Количество ребер не может быть отрицательным.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Введите целое число.");
                input.next(); // Очистка некорректного ввода
            }
        }

        System.out.println("Введите список ребер (пара вершин для каждого ребра):");
        for (int i = 0; i < edges; i++) {
            int u = -1, v = -1;
            while (u < 0 || u >= vert || v < 0 || v >= vert) {
                try {
                    System.out.println("Ребро " + (i + 1) + ": введите вершины (u v):");
                    u = input.nextInt();
                    v = input.nextInt();
                    if (u < 0 || u >= vert || v < 0 || v >= vert) {
                        System.out.println("Номера вершин должны быть в диапазоне от 0 до " + (vert - 1) + ".");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Некорректный ввод. Введите целые числа.");
                    input.next(); // Очистка некорректного ввода
                }
            }
            matrixSm[u][v]=1;
            matrixSm[v][u]=1;
        }
        System.out.println("Матрица смежности:");
        for(int[] r:matrixSm)
        {
            for (int i:r)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
