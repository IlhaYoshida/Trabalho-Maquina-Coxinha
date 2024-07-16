/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhomaquinacoxinha;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author willi
 */
public class TelaController {
    
    MaquinaCoxinha maquina;
    
    @FXML
    private void initialize(){
        maquina = new MaquinaCoxinha();
    }
    
    @FXML 
    private TextField estoqueCoxinhas;
    
    @FXML 
    private TextField abastecerCoxinhas;
    
    @FXML 
    private TextField venderCoxinhas;
    
    @FXML
    private void AtualizaPreco(){
        estoqueCoxinhas.setText(String.valueOf(maquina.getEstoque()));
    }
    
    @FXML
    private void abastecer(){
        int quantidade = Integer.parseInt(abastecerCoxinhas.getText());
        maquina.abastecer(quantidade);
        AtualizaPreco();
    }
    
    @FXML
    private void vender(){
        maquina.venderCoxinha();
        AtualizaPreco();
    }
    
    @FXML
    private void vender2(){
        maquina.venderCoxinha(Integer.parseInt(venderCoxinhas.getText()));
        AtualizaPreco();
    }
    
    @FXML
    private void zerar(){
        maquina.zerarMaquina();
        AtualizaPreco();
    }
    
    
}
