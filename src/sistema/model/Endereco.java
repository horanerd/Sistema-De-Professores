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
public class Endereco {
    private Tipo tipo;
    private String logadouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;

    public Endereco(Tipo tipo, String logadouro, int numero, String complemento, String bairro, String cidade, String cep, String uf) {
        this.tipo = tipo;
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
    }

    public Endereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getUf() {
        return uf;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" + "tipo=" + tipo + ", logadouro=" + logadouro + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", uf=" + uf + '}';
    }
    
    
    
}
