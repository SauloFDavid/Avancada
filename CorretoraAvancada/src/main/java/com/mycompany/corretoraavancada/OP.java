/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corretoraavancada;

/**
 *
 * @author saulo
 */
public class OP {
    int val;
    String tipo;
    int ativo;
    int cliente;
    float temp;
    
    public OP(int val,String tipo,int ativo,int cliente,float temp){
        this.val = val;
        this.tipo = tipo;
        this.ativo = ativo;
        this.cliente = cliente;
        this.temp = temp;
    }
    public int getValor() {
		return val;
	}
    public String getTipo() {
		return tipo;
	}
    public int getAtivo() {
		return ativo;
	}
    public int getCliente() {
		return cliente;
	}
    public float getTempo() {
		return temp;
	}
    
}
