package br.com.util;

import java.util.Random;

public class RandomUtil {

    public static void main(String[] args) {
//instância um objeto da classe Random usando o construtor básico 
        Random gerador = new Random();
//imprime sequência de 10 números inteiros aleatórios entre 0 e 25 
        for (int i = 0; i < 10; i++) {
            //System.out.println(gerador.nextInt(26));
        }
        
        gerarNumeroAleatorio();
    }

//Leia mais em: Números Aleatórios em Java – A Classe java.util.Random http://www.devmedia.com.br/numeros-aleatorios-em-java-a-classe-java-util-random/26355#ixzz3CCWFZjHJ


    
    public static void gerarNumeroAleatorio(){

        int numero;
        int[] num = new int[6];
        Random r = new Random();

        boolean repetido = false;
        
        for(int i=0; i<num.length; i++){
            
             numero = r.nextInt(6) + 1;
            
             for(int j=0; j<num.length; j++){
                 
                 
                 if (numero == num[j] && j != i) {
                     //numero = r.nextInt(6) + 1;
                 } else {
                     num[i] = numero;
                 }
             }
        }
        //Apresentar na tela o resultado
        for(int i=0; i<num.length; i++){
             System.out.print(num[i]+" | ");
        }
    }
    
    public static void gerarNumeroAleatorio(int qtd){

        int numero;
        int[] num = new int[6];
        Random r = new Random();

        boolean repetido = false;
        
        for(int i=0; i<num.length; i++){
            
             numero = r.nextInt(6) + 1;
            
             for(int j=0; j<num.length; j++){
                 
                 
                 if (numero == num[j] && j != i) {
                     //numero = r.nextInt(6) + 1;
                 } else {
                     num[i] = numero;
                 }
             }
        }
        //Apresentar na tela o resultado
        for(int i=0; i<num.length; i++){
             System.out.print(num[i]+" | ");
        }
    }

}
