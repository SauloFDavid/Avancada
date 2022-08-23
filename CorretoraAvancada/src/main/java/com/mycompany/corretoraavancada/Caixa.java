/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corretoraavancada;
import java.util.concurrent.Semaphore;
/**
 *
 * @author saulo
 */
public class Caixa {
    private OP op ;
    private Corretora corretora;
    private Semaphore s = new Semaphore(1);
    private int cx;
    
    public Caixa(Corretora corretora,int cx){
        this.corretora = corretora;
        this.cx = cx;
    }
    public Corretora getCorretora() {
		return corretora;
	}
    public void setOP(OP op){
        try {
		s.acquire();
		this.op = op;
		setDados();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    public void setDados(){
        
    }
    
}
