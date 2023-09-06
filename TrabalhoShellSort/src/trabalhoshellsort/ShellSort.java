/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoshellsort;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ShellSort {
    public static long compara = 0, deslocamento = 0;

    public static void shellSort(int array[]) {
        int n = array.length;
        // Inicializa o valor de h de acordo com a sequência de Knuth
        int h = 1;
        while (h <= n / 3) {
            h = h * 3 + 1;
        }
        // Começa a ordenação com o maior valor de h e diminui gradualmente
        while (h > 0) {
            for (int i = h; i < n; i++) {
                insertShell(array, i, h);
            }
            // Diminui o valor de h de acordo com a sequência de Knuth
            h = (h - 1) / 3;
        }
    }
    
    public static void shellSortComentado(int array[]) {
        int n = array.length;
        int h = 1;
        while (h <= n / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int i = h; i < n; i++) {
                System.out.println("H: "+h);
                insertComentado(array, i, h);
            }
            h = (h - 1) / 3;
        }
    }

    private static void insertShell(int array[], int i, int h) {
        int eleito = array[i];
        int comp = i - h;
        while (comp >= 0 && eleito < array[comp]) {
            compara++;
            array[comp + h] = array[comp]; // Deslocando
            deslocamento++;
            comp -= h;
        }
        compara++; // Conta a comparação de saída
        array[comp + h] = eleito;
    }
    
    private static void insertComentado(int array[], int i, int h){
        Scanner scanner = new Scanner(System.in);
        int eleito = array[i];
        int comp = i - h;
        System.out.println("Eleito: "+eleito);
        scanner.nextLine();
        while (comp >= 0 && eleito < array[comp]) {
            compara++;
            array[comp + h] = array[comp]; // Deslocando
            deslocamento++;
            comp -= h;
        }
        compara++;
        array[comp + h] = eleito;
    }
}
