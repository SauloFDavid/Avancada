/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corretoraavancada;

import java.io.*;
import jxl.Workbook;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
/**
 *
 * @author saulo
 */
public class ContasExportar {
    private float[] vet;
    
    public ContasExportar (float[] vet){
        this.vet = vet;
        MediaMovelSimples m = new MediaMovelSimples(vet, 5); 
	float[]ms = m.getMedia(); 
        
        MediaMovelExponencial e = new MediaMovelExponencial(vet, 5);
	float[]me = e.getMedia();
        
        MediaMovelSimples m1 = new MediaMovelSimples(vet, 5);
	float[]msc = m1.getMedia();
        
        MediaMovelSimples m2 = new MediaMovelSimples(vet, 10);
	float[]msi = m2.getMedia();
        
        MediaMovelSimples m3 = new MediaMovelSimples(vet, 20);
	float[]msl = m3.getMedia();
        
        MediaMovelExponencial e1 = new MediaMovelExponencial(vet, 5);
	float[]mec = e1.getMedia();
        
        MediaMovelExponencial e2 = new MediaMovelExponencial(vet, 10);
	float[]mei = e2.getMedia();
        
        MediaMovelExponencial e3 = new MediaMovelExponencial(vet, 20);
	float[]mel = e3.getMedia();
        
        DesvioPadrao d = new DesvioPadrao(vet, 5);
	float[]des = d.getDesvio();
        
        try{
            WritableWorkbook planilha = Workbook.createWorkbook(new File("C:\\Users\\saulo\\Documents\\Avançada\\saida.xls"));
            WritableSheet aba = planilha.createSheet("dados",0);
            // Cor de fundo das celulas
            Colour bckcolor = Colour.WHITE;
            WritableCellFormat cellFormat = new WritableCellFormat();
            cellFormat.setBackground(bckcolor);

            // Cor e tipo de fonte
            WritableFont fonte = new WritableFont(WritableFont.ARIAL);
            fonte.setColour(Colour.BLACK);
            cellFormat.setFont(fonte);
            
            for (int i = 0; i <= ms.length; i++) { 
		
		String n = String.valueOf(ms[i]);

		Label label = new Label(0, i, n);
		aba.addCell(label);
            }
            
            for (int i = 0; i <= me.length; i++) { 
		
		String n = String.valueOf(me[i]);

		Label label = new Label(0, i, n);
		aba.addCell(label);
            }
            
            for (int i = 0; i <= msc.length; i++) { 
		
		String n = String.valueOf(msc[i]);

		Label label = new Label(0, i, n);
		aba.addCell(label);
            }
            
            for (int i = 0; i <= msi.length; i++) { 
		
		String n = String.valueOf(msi[i]);

		Label label = new Label(0, i, n);
		aba.addCell(label);
            }
            
            for (int i = 0; i <= msl.length; i++) { 
		
		String n = String.valueOf(msl[i]);

		Label label = new Label(0, i, n);
		aba.addCell(label);
            }
            
            for (int i = 0; i <= msl.length; i++) { 
		
		String n = String.valueOf(msl[i]);

		Label label = new Label(0, i, n);
		aba.addCell(label);
            }
            
            for (int i = 0; i <= mec.length; i++) { 
		
		String n = String.valueOf(mec[i]);

		Label label = new Label(0, i, n);
		aba.addCell(label);
            }
            
            for (int i = 0; i <= mei.length; i++) { 
		
		String n = String.valueOf(mei[i]);

		Label label = new Label(0, i, n);
		aba.addCell(label);
            }
            
            for (int i = 0; i <= mel.length; i++) { 
		
		String n = String.valueOf(mel[i]);

		Label label = new Label(0, i, n);
		aba.addCell(label);
            }
            
            for (int i = 0; i <= des.length; i++) { 
		
		String n = String.valueOf(des[i]);

		Label label = new Label(0, i, n);
		aba.addCell(label);
            }
        } catch (Exception e) {
			//captura o possivel erro
		e.printStackTrace();
	}
    }
    
}
