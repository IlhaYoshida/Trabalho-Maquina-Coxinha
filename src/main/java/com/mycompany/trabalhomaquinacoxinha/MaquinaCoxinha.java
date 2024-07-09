/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhomaquinacoxinha;

/**
 *
 * @author willi
 */
public class MaquinaCoxinha {
    
    private int estoque;

    public MaquinaCoxinha() {
        estoque = 0;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public void abastecer(int estoque){
        this.estoque = estoque;
    }
    
    public void venderCoxinha(){
        if (estoque > 0){
            estoque--;
        }
    }
    
    public void venderCoxinha(int quantidade){
        if(estoque > quantidade){
            estoque -= quantidade;
        }
    }
    
    public void zerarMaquina(){
        estoque = 0;
    }
    
    
}
