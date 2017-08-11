
package br.ufjf.dcc171;

import br.ufjf.dcc171.modelo.Pessoa;
import java.util.ArrayList;
import java.util.List;


public class Aula1_5 {
    
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            Pessoa p = new Pessoa();
            p.setNome("Pessoa" + i);
            
            p.setAnoNascimento(1994 + i );
            pessoas.add(p);           
            
        }
        for(Pessoa pessoa : pessoas)
        {
            System.out.println(pessoa);
        
        }
    }
    
}
