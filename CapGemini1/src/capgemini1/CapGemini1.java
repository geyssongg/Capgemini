/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capgemini1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author geyss
 */


public class CapGemini1 {
    
    //Método de seleção para ordenar o vetor
    public static void insertionSort(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++){
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--){
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Boleano para controlar a captura do tamanho do vetor
        boolean cont = true;
        //Tamanho do vetor
        int n = 0 ;
        //Loop para pegar o tamanho do vetor
        while (cont){
            //Usando um bloco try para capturar a exceção do valor digitado n ser um inteiro
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.print("Digite o tamanho do vetor\n");
                n = teclado.nextInt();
                //Verificando se o número digitado é um inteiro, caso seja, sai do loop usando o controle da variavel cont
                if (n % 2 == 0){
                    System.out.print("O valor informado não é um num impar\n");
                }
                else {
                    cont = false;
                }
            }
            //Caso o valor informado não seja um inteiro
            catch (InputMismatchException  e){
                System.out.print("O valor informado não é um número\n");
            }
        }        
        //Inicializando o vetor com tamanho N
        int vetor[];
        vetor = new int [n];
        //Percorrendo o vetor para preencher
        for (int i = 0 ; i < n ; i++){
            
            //Tratando a exceção de caso o valor informado não seja um inteiro
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.print("Valor da posição " +i +": ");
                vetor[i] = teclado.nextInt();
            }
            catch (InputMismatchException  e){
                System.out.print("O valor informado não é um número\n");
            }
        }
        
        //Ordenando o vetor
        insertionSort(vetor);
        //Informando o valor que está no vetor na posição N/2 (mediana)
        System.out.println(" " + vetor[n/2]);
        
    }
}
