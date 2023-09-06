/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoshellsort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class JavaSortShell {
    static int menuEntrada(){
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("1- Gerar dados");
        System.out.println("2- Entrar com dados");
        op = scanner.nextInt();
        return op;
    }
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random rand = new Random();
       int tamanho, op;
       System.out.println("Tamanho do vetor:");
       tamanho = scanner.nextInt();
       int[] vetor = new int[tamanho];
       op = menuEntrada();
       switch(op){
           case 1:  for(int i=0; i<vetor.length; i++)
                        vetor[i] = rand.nextInt(100);
           break; 
           case 2:  System.out.println("Dados vetor:");
                    for(int i=0; i<vetor.length; i++)
                        vetor[i] = scanner.nextInt();
           break; 
       }
       
        printArray(vetor);//mostrar o vetor
        ShellSort.shellSortComentado(vetor);
        System.out.println("Vetor ordenado");
        printArray(vetor);//mostrar ordenado
    }
    
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
