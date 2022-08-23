/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corretoraavancada;

/**
 *
 * @author saulo
 */
public class Corretora {
    private Cliente cli;
    private Ativo a1;
    private Ativo a2;
    private Ativo a3;
    private Ativo a4;
    private int op = 100;
    private Caixa c1,c2,cgeral;
    
    public Corretora(Ativo a1, Ativo a2, Ativo a3, Ativo a4){
        this.a1 = a1; 
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        c1 = new Caixa (this,1);
        c2 = new Caixa (this,2);
        cgeral = new Caixa (this,3);
        
    }
    
}
