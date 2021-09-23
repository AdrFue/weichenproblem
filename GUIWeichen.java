package fachreferat;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

class GUIWeichen extends JPanel {
	
	// Variablen: Weichen, Breite, X-Position, Zahlenwerte
	private boolean b_w1, b_w2, b_w3, b_w4;

	private int i_width;
	private int i_x;

	private String s_pos0 = "0";
	private String s_pos1 = "0";
	private String s_pos2 = "0";
	private String s_pos3 = "0";
	private String s_pos4 = "0";
	private String s_pos5 = "0";
	private String s_anzLinks = "0";
	private String s_anzRechts = "0";
		
	// Konstruktor
	public GUIWeichen(int i_width) { 
		this.i_width = i_width;
	}
	
	// Main-Methode
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Einstellungen
		this.setBackground(Color.WHITE);
		g.setColor(Color.BLACK);
		this.setBorder(BorderFactory.createTitledBorder("Weichenproblem"));
		
		// Variabeln für die Weichenkonstruktion
		int i_weichenPos;
		i_x = i_width/2;
		
		// Rahmen
	    g.drawLine(i_x-15, 50, i_x-15, 110);
	    g.drawLine(i_x-15, 110, i_x-75, 170);
	    g.drawLine(i_x-75, 170, i_x-75, 230);
	    g.drawLine(i_x-75, 230, i_x-135, 290);
	    g.drawLine(i_x-135, 290, i_x-135, 350);
	    g.drawLine(i_x-135, 350, i_x-75, 410);
	    g.drawLine(i_x-75, 410, i_x-75, 470);
	    
	    g.drawLine(i_x+15, 50, i_x+15, 110);
	    g.drawLine(i_x+15, 110, i_x+75, 170);
	    g.drawLine(i_x+75, 170, i_x+75, 230);
	    g.drawLine(i_x+75, 230, i_x+135, 290);
	    g.drawLine(i_x+135, 290, i_x+135, 350);
	    g.drawLine(i_x+135, 350, i_x+75, 410);
	    g.drawLine(i_x+75, 410, i_x+75, 470);
	    
		// Sechsecke
		g.drawLine(i_x, 135, i_x-45, 180);
		g.drawLine(i_x, 135, i_x+45, 180);
		g.drawLine(i_x-45, 180, i_x-45, 230);
		g.drawLine(i_x+45, 180, i_x+45, 230);
		g.drawLine(i_x-45, 230, i_x, 275);
		g.drawLine(i_x+45, 230, i_x, 275);
		
		g.drawLine(i_x-60, 255, i_x-105, 300);
		g.drawLine(i_x-60, 255, i_x-15, 300);
		g.drawLine(i_x-105, 300, i_x-105, 340);
		g.drawLine(i_x-15, 300, i_x-15, 340);
		g.drawLine(i_x-105, 340, i_x-60, 385);
		g.drawLine(i_x-15, 340, i_x-60, 385);
		
		g.drawLine(i_x+60, 255, i_x+105, 300);
		g.drawLine(i_x+60, 255, i_x+15, 300);
		g.drawLine(i_x+105, 300, i_x+105, 340);
		g.drawLine(i_x+15, 300, i_x+15, 340);
		g.drawLine(i_x+105, 340, i_x+60, 385);
		g.drawLine(i_x+15, 340, i_x+60, 385);
		
		g.drawLine(i_x, 365, i_x-45, 410);
		g.drawLine(i_x, 365, i_x+45, 410);
		g.drawLine(i_x-45, 410, i_x-45, 470);
		g.drawLine(i_x+45, 410, i_x+45, 470);
		
		// Weichen
		g.setColor(Color.MAGENTA);	
		i_weichenPos = (this.b_w1) ? 285 : 315; 
		g.drawLine(i_weichenPos, 110, i_x, 135);
		i_weichenPos = (this.b_w2) ? 225 : 255; 
		g.drawLine(i_weichenPos, 230, i_x-60, 255);
		i_weichenPos = (this.b_w3) ? 345 : 375; 
		g.drawLine(i_weichenPos, 230, i_x+60, 255);
		i_weichenPos = (this.b_w4) ? 285 : 315;  
		g.drawLine(i_weichenPos, 340, i_x, 365);

		// Ergebniszahlen
		g.setColor(Color.BLACK);	
		g.drawString(s_pos0, i_x-5, 100);
		g.drawString(s_pos1, i_x-65, 210);
		g.drawString(s_pos2, i_x+55, 210);
		g.drawString(s_pos3, i_x-125, 330);
		g.drawString(s_pos4, i_x-5, 330);
		g.drawString(s_pos5, i_x+115, 330);
		g.drawString(s_anzLinks, i_x-65, 460);
		g.drawString(s_anzRechts, i_x+55, 460);
	}
	
	// Setter: Weichen, Zwischensummen, Ausgänge
	public void setB_w1(boolean b_w1) {
		this.b_w1 = b_w1;
	}	
	public void setB_w2(boolean b_w2) {
		this.b_w2 = b_w2;
	}	
	public void setB_w3(boolean b_w3) {
		this.b_w3 = b_w3;
	}	
	public void setB_w4(boolean b_w4) {
		this.b_w4 = b_w4;
	}	

	public void setS_pos0(String s_pos0) {
		this.s_pos0 = s_pos0;
	}
	public void setS_pos1(String s_pos1) {
		this.s_pos1 = s_pos1;
	}
	public void setS_pos2(String s_pos2) {
		this.s_pos2 = s_pos2;
	}
	public void setS_pos3(String s_pos3) {
		this.s_pos3 = s_pos3;
	}
	public void setS_pos4(String s_pos4) {
		this.s_pos4 = s_pos4;
	}
	public void setS_pos5(String s_pos5) {
		this.s_pos5 = s_pos5;
	}

	public void setS_anzLinks(String s_anzLinks) {
		this.s_anzLinks = s_anzLinks;
	}
	public void setS_anzRechts(String s_anzRechts) {
		this.s_anzRechts = s_anzRechts;
	}
}
