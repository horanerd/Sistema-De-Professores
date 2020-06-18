/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import sistema.model.Aluno;
import sistema.model.Telefone;
import sistema.model.Endereco;
import sistema.model.Tipo;




/**
 *
 * @author Guilherme
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("teste");
        
        Telefone telefone = new Telefone("1197802", Tipo.RECADOS);
        System.out.println(telefone);
        List<Telefone> tels = new ArrayList<>();
        
        tels.add(telefone);
        
        Endereco end = new Endereco(Tipo.RESIDENCIAL, "Rua a",173, null, "vila brasil", "são paulo",  "01211-111", "sp");
        
        Date data = new Date(1996, 10, 14);
        
        Aluno aluno = new Aluno(132321, tels, end, "guilherme", "2222", "3322", data );
        
        System.out.println(aluno);
    }
    
}
