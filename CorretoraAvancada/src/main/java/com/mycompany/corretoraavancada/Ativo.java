/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corretoraavancada;

/**
 *
 * @author saulo
 */
public class Ativo {
    private float[] fecha;
    private float[] tempo;
    private int a;
 
    public Ativo(float[] f, float[] t, int a ) {
		fecha = f;
		tempo = t;
		this.a = a;
	}
    public float[] getFechamento() {
		return fecha;
	}
    public float[] getTempo() {
		return tempo;
	}
    public int getAtivo() {
		return a;
	}
}
