/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capgemini3;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author geyss
 */
public class CapGemini3 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Lendo a frase a ser criptografada
        System.out.print("Digite a frase a ser criptografada: ");
        String frase = teclado.nextLine();
        //Retirando os espaços em branco da frase
        String fraseSemEspaco = frase.replace(" ", "");
        //Obtendo a raiz quadrada que define a quantidade de colunas da matriz que irá criptografar a mensagem
        float raizQuadradaFrase = (float) sqrt(fraseSemEspaco.length());
        int raizArredondada = (int) Math.ceil(raizQuadradaFrase);
        
        //Criando a array do tamanho da raiz, arredondado para cima
        String arraySenha[][]; 
        arraySenha = new String [raizArredondada][raizArredondada];
        
        /* Preenchendo a matriz com as letra da frase, utilizando a variavel aux para contar em qual
        letra da palavra o algoritmo está*/
        int aux = 0;
        for (int i = 0 ; i < raizArredondada ; i++){
            for ( int j = 0 ; j < raizArredondada ; j++){
                //Caso a palavra ainda tenha letras a serem colocadas na matriz
                if (aux < fraseSemEspaco.length()){
                    arraySenha[i][j] = ""+fraseSemEspaco.charAt(aux);
                    aux++;
                }
                //Caso contrário, colocando um espaço vazio no elemento da matriz
                else{
                    arraySenha[i][j] = "";
                }
            }
        }
        
        //Criando a string criptografada 
        String senhaCripto = "";       
        
        //A string é formada pelas colunas da matriz, logo percorremos a matriz, concatenando as linhas, e pulando um espaço
        //quando a coluna acaba
        
        //Percorrendo a matriz por coluna por coluna
        for (int i = 0 ; i < raizArredondada ; i++){
            for ( int j = 0 ; j < raizArredondada ; j++){
                senhaCripto += (arraySenha[j][i]+"");
            }
            senhaCripto += " ";
        }
        
        System.out.println("Senha criptografada: "+ senhaCripto);
    }
    
}
