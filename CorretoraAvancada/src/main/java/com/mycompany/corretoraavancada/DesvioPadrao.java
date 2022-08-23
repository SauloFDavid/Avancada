/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corretoraavancada;

/**
 *
 * @author saulo
 */
public class DesvioPadrao {
    
    private int p;
    private float[] vet;
    private float[] desvio;
    private float[] medias;
    private MediaMovelSimples media;
    
    public DesvioPadrao(float[] vet, int p) {
	 this.vet = vet;
	 this.p = p;
	 media = new MediaMovelSimples(vet,p);
	 medias = media.getMedia();
	
         desvio = new float[vet.length];
         for(int i = 0; i<vet.length; i++) {
			float cont = 0;
			for(int j = 0; j<p; j++) {
				cont = (float) (cont + Math.pow((vet[i+j] - medias[i]),2));
			}
			desvio[i] = (float) Math.sqrt((cont/p));
		}
	} 
    public float[] getDesvio() {
		return desvio;
	}
}
