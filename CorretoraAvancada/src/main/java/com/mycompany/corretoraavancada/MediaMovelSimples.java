/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corretoraavancada;

/**
 *
 * @author saulo
 */
public class MediaMovelSimples {
    private float[] vet;
    private float[] media;
    private int p;
    
    public MediaMovelSimples(float[] vet,int p){
        this.vet = vet;
        this.p = p;
        media = new float[vet.length];
        for(int i=0; i<vet.length; i++) {
            float cont = 0;
            for(int j = 0; j<p; j++){
                cont = cont + vet[i+j];
            }
            media[i] = cont/p;
        }
    }
    public float[] getMedia(){
        return media;
    }
}
