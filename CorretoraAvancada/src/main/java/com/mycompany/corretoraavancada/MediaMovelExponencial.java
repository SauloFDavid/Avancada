/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corretoraavancada;

/**
 *
 * @author saulo
 */
public class MediaMovelExponencial {
    private float[] vet;
    private float[] media;
    private int p;
    
    public MediaMovelExponencial(float[] vet, int p) {
            this.vet = vet;
            this.p = p;
            float i = (float)(2/(p + 1));
            
            media = new float[vet.length];
            float cont = 0;
            for(int j = 0; j <= p; j++) {
			cont = vet[j] + cont;
		}
            float antes = 0;
            media[0] = cont/p;
            for(int j=0; i<=vet.length; j++) {
			media[j] = (((vet[j]- antes)*i) + antes);
			antes = media[j];
		}
	}
    public float[] getMedia() {
		return media;
	}
}
