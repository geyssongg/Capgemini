/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capgemini2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author geyss
 */




public class CapGemini2 {
    
    //Método que conta os pares de valores com a diferença X informada
    public static int contaPares (int[] vetor, int diferenca){
        int pares = 0;
        for (int i = 0 ; i < vetor.length ; i++){
            for (int j = 0 ; j < vetor.length ; j++){
                if (vetor[j] - vetor[i] == diferenca){
                    pares++;
                }
            }
        }
        return pares;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Leitura do tamanho do vetor
        int n = 0;
        while (true){
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.print("Digite o tamanho do vetor\n");
                n = teclado.nextInt();
                break;
            }
            catch (InputMismatchException e){
                System.out.print("O valor informado não é um número inteiro\n");   
                
            }
        }
        
        //Criando um vetor do tamanho N
        int vetor[];
        vetor = new int [n];
        
        //Lendo os valores do vetor N
        for (int i = 0 ; i < n ; i++){
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.print("Valor da posição " +i +": ");
                vetor[i] = teclado.nextInt();
            }
            //Tratando caso o valor informado n seja um inteiro
            catch (InputMismatchException  e){
                System.out.print("O valor informado não é um número inteiro\n");
                
            }
        }        
        System.out.println("Digite o valor de X: ");
        int x;
        
        //Lendo o númeor da diferença 
        while(true){
            try{
                Scanner teclado = new Scanner(System.in);
                x = teclado.nextInt();
                break;
            }
            //Tratando caso o valor informado n seja um inteiro
            catch (InputMismatchException  e){
                System.out.print("O valor informado não é um inteiro\n");
            }
        }
        //Chamando o método contaPares que conta os pares do vetor com a diferença X entre si
        int paresDiferenca = contaPares(vetor,x);
        System.out.println("Pares com a diferença X é de :" + paresDiferenca);
        
    }
    
}
