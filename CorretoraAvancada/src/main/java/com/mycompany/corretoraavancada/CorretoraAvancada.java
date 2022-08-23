/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.corretoraavancada;
/**
 *
 * @author saulo
 */
public class CorretoraAvancada {

    public static void main(String[] args) {
              
         String caminho = "C:\\Users\\saulo\\Documents\\Avançada\\USDJPY_M5.csv";
         String A1 = "C:\\Users\\saulo\\Documents\\Avançada\\A1.csv";
         String A2 = "C:\\Users\\saulo\\Documents\\Avançada\\A2.csv";
         String A3 = "C:\\Users\\saulo\\Documents\\Avançada\\A3.csv";
         String A4 = "C:\\Users\\saulo\\Documents\\Avançada\\A4.csv";      
         
         Leitura lido = new leitura (caminho);
         double[] val = lido.getValores();
         
         ContasExportar contas = new ContasExortar(val);
         
         Leitura ativo1 = new leitura(A1);
         Ativo primeiro = new Ativo(A1.getValor(),A1.getTempo(),1);
         
         Leitura ativo2 = new leitura(A2);
         Ativo segundo = new Ativo(A2.getValor(),A2.getTempo(),2);
         
         Leitura ativo3 = new leitura(A3);
         Ativo terceiro = new Ativo(A3.getValor(),A3.getTempo(),3);
         
         Leitura ativo4 = new leitura(A4);
         Ativo quartp = new Ativo(A4.getValor(),A4.getTempo(),4);

    }
}
