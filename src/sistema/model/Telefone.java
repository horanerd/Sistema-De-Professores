/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.model;

/**
 *
 * @author Guilherme
 */
public class Telefone {
    private String numero;
    private Tipo tipo;
    
    public Telefone (String numero, Tipo tipo){
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Telefone{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }
    
    
    
}
