package br.ufjf.dcc171;

import java.util.Scanner;

public class Aula1_3 {

    public static void main(String[] args) {
        String cliente;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        //nome = entrada.next();//next-pegar a primeira string da ordem 
        cliente = entrada.nextLine();
        System.out.println("Olá " + cliente + "!");
        
    }
}
