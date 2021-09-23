package fachreferat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

class Frame implements ActionListener {
	
	// Variablen: Fenstergröße, Weichen
	private int i_width = 600;
	private int i_height = 600;
	
	// Klassen deklarieren
	private JFrame f = new JFrame("Weichen");
	private GUIWeichen gw = new GUIWeichen(i_width);
	private GUIOptions go = new GUIOptions();
	private Ball b = new Ball();

	
	// Main-Methode
	public void start() {

		// Fensteroptionen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setSize(i_width, i_height);
		f.setLocationRelativeTo(null);
		f.setBackground(Color.WHITE);
		f.setLayout(new BorderLayout());
				
		// Grafik mit Weichen
		f.getContentPane().add(gw, BorderLayout.CENTER);

		// Optionen
		f.getContentPane().add(go, BorderLayout.SOUTH);
		
		go.setPreferredSize(new Dimension(600, 80));
		go.create();
		
		// Grafische Elemente einbinden
		go.getCb_w1().addActionListener(this);	
		go.getCb_w2().addActionListener(this);
		go.getCb_w3().addActionListener(this);
		go.getCb_w4().addActionListener(this);
		
		go.getBtn_start().addActionListener(this);
		
		// Fenster anzeigen
		f.setVisible(true);	
	}
	
	// Mausklicks abfragen
	public void actionPerformed(ActionEvent e) {
				
		if (e.getSource() == go.getCb_w1()) {
			gw.setB_w1(go.getCb_w1().isSelected());
		}
		if (e.getSource() == go.getCb_w2()) {
			gw.setB_w2(go.getCb_w2().isSelected());
		}
		if (e.getSource() == go.getCb_w3()) {
			gw.setB_w3(go.getCb_w3().isSelected());
		}
		if (e.getSource() == go.getCb_w4()) {
			gw.setB_w4(go.getCb_w4().isSelected());
		}
		
		// Wenn Start-Button gedrückt wird
		if (e.getSource() == go.getBtn_start()) { 
			
			// Weichen in Ball-Klasse
			b.setB_w1(go.getCb_w1().isSelected());
			b.setB_w2(go.getCb_w2().isSelected());
			b.setB_w3(go.getCb_w3().isSelected());
			b.setB_w4(go.getCb_w4().isSelected());
			
			// Bälle durchlaufen lassen, mit Anzahl ausgewählter Baelle
			b.berrechneAusgaenge(go.getSl_anzBaelle());	
			
			// Werte an den Zwischenstellen grafisch
			gw.setS_pos0(Integer.toString(go.getSl_anzBaelle()));
			gw.setS_pos1(Integer.toString(b.getI_pos1()));
			gw.setS_pos2(Integer.toString(b.getI_pos2()));
			gw.setS_pos3(Integer.toString(b.getI_pos3()));
			gw.setS_pos4(Integer.toString(b.getI_pos4()));
			gw.setS_pos5(Integer.toString(b.getI_pos5()));
			
			// Werte der Ballanzahl links und rechts grafisch
			gw.setS_anzLinks(Integer.toString(b.getI_anzLinks()));
			gw.setS_anzRechts(Integer.toString(b.getI_anzRechts()));		
		}	
	}
}
