
package br.ufjf.dcc171;

import br.ufjf.dcc171.modelo.Pessoa;
import java.util.Scanner;

public class Auola1_4 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        p1.setNome(entrada.nextLine());
        System.out.println("Digite um ano de Nascimento: ");
        p1.setAnoNascimento(entrada.nextInt());
        System.out.println(p1);
        
        
    }
}
