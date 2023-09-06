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
public class Main {
    static int menuEntrada() {
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("\nMenu dados do Vetor ");
        System.out.println("1- Gerar dados");
        System.out.println("2- Entrar com dados");
        op = scanner.nextInt();
        return op;
    }
    
    static int menuMetodo() {
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("\nMenu Busca/Sort");
        System.out.println("1- Shell Sort");
        System.out.println("2- Insertion Sort");
        System.out.println("3- Compara metodos");
        System.out.println("0- Sair");
        op = scanner.nextInt();
        return op;
    }
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random rand = new Random();
       int tamanho, op;
       long tempoInicial,tempoFinal;
       long tempoInicial1,tempoFinal1;
       
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
       int[] vetor1 = vetor.clone();
       int[] vetor2 = vetor.clone();
       int[] vetor3 = vetor.clone();
       System.out.println("\nVetor Original");
       printArray(vetor);//mostrar o vetor
       do{
       op = menuMetodo();
       switch(op){
            case 0: 
                    break;
                    
            case 1: //Shell Sort
                    System.out.println("\nShell sort");
                    ShellSort.shellSortComentado(vetor);
                    System.out.println("Comparacoes: "+ShellSort.compara);
                    System.out.println("Deslocamentos: "+ShellSort.deslocamento);
                    System.out.println("\nVetor Ordenado pelo ShellSort ");
                    printArray(vetor);//mostrar
                    break;
                    
            case 2:  //Insertion Sort
                    System.out.println("\nInsertion sort");
                    tempoInicial1 = System.currentTimeMillis();
                    InsertionSort.iSort(vetor1);
                    tempoFinal1 = System.currentTimeMillis();
                    System.out.println("Comparacoes: "+InsertionSort.compara);
                    System.out.println("Deslocamentos: "+InsertionSort.deslocamento);
                    System.out.println("Tempo: "+(tempoFinal1-tempoInicial1));
                    System.out.println("\nVetor Ordenado pelo InsertionSort ");
                    printArray(vetor1);//mostrar
                    break;
                    
            case 3:  //Compara método
                //Shell Sort
                    System.out.println("\nShell sort");
                    tempoInicial = System.currentTimeMillis();
                    ShellSort.shellSort(vetor2);
                    tempoFinal = System.currentTimeMillis();
                    System.out.println("Comparacoes: "+ShellSort.compara);
                    System.out.println("Deslocamentos: "+ShellSort.deslocamento);
                    System.out.println("Tempo: "+(tempoFinal-tempoInicial));
                    
                     //Insertion Sort
                    System.out.println("\nInsertion sort");
                    tempoInicial1 = System.currentTimeMillis();
                    InsertionSort.iSort(vetor3);
                    tempoFinal1 = System.currentTimeMillis();
                    System.out.println("Comparacoes: "+InsertionSort.compara);
                    System.out.println("Deslocamentos: "+InsertionSort.deslocamento);
                    System.out.println("Tempo: "+(tempoFinal1-tempoInicial1));
                    break;
       }
       }while(op!=0);
    }
    
    public static void printArray(int array[]){
         for(int i=0; i<array.length; i++){
             System.out.print(array[i]+"|");
         }
         System.out.println("\n");
    }
    
     public static void printIntervalo(int array[], int ini , int fim){
         for(int i=ini ; i<=fim; i++){
             System.out.print(array[i]+"|");
         }
         System.out.println("\n");
    }
}
