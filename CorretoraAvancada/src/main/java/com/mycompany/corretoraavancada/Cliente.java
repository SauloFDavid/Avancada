/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corretoraavancada;

/**
 *
 * @author saulo
 */
public class Cliente {
    private float saldo;
    private Ativo at;
    private Corretora cor;
    
    public Cliente(float saldo, Corretora cor) {
		this.saldo = saldo;
		this.cor = cor;
                
	}
    public float getSaldo() {
		return saldo;
	}
    public Corretora getCorretora() {
		return cor;
	}
    
    public void comprar(Ativo at) {
		
	}
    public void vender(Ativo at) {
		
	}
}
        
    

