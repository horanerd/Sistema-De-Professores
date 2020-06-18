/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class Aluno extends Pessoa{
    
    private int ra;
    private List<Telefone> telefone;
    private Endereco endereco;
    
    
    /** 
     
     @param Endereco = endereço
     
     
     
     */
    public Aluno(int ra, List<Telefone> telefone, Endereco endereco, String nome, String rg, String cpf, Date dtNasc) {
        super(nome, rg, cpf, dtNasc);
        this.ra = ra;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getRa() {
        return ra;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + super.getNome() + ",  telefone=" + telefone + ", endereco=" + endereco + ", data=" + super.getCpf() + '}';
    }
    
    
    
}
