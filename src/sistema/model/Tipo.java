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

    
    public enum Tipo {
    RESIDENCIAL(1), COMERCIAL(2), RECADOS(3);
    
    private final int value;
 private Tipo(int value) {
        this.value = value;
    }
  public int getValue() {
        return value;
    }
        
    
    
       
}
