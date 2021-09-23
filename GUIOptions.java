package fachreferat;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Hashtable;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

class GUIOptions extends JPanel {
	
	// Instanzvariablen: Elemente
	private JSlider sl_anzBaelle = new JSlider();

	private JCheckBox cb_w1 = new JCheckBox("Weiche 1");
	private JCheckBox cb_w2 = new JCheckBox("Weiche 2");
	private JCheckBox cb_w3 = new JCheckBox("Weiche 3");
	private JCheckBox cb_w4 = new JCheckBox("Weiche 4");
	
	private JButton btn_start = new JButton("Start");

	// Methoden
	public void create() {
		
		// Panel Einstellungen
		this.setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));	
		this.setBackground(Color.WHITE);		
		this.setBorder(BorderFactory.createTitledBorder("Optionen"));
		
		// Slider
		sl_anzBaelle.setBackground(Color.WHITE);
		Dimension d = sl_anzBaelle.getPreferredSize();
		sl_anzBaelle.setPreferredSize(new Dimension(d.width-60,d.height));
		sl_anzBaelle.setValue(1);
		sl_anzBaelle.setMaximum(100);
		sl_anzBaelle.setMinimum(0);
		sl_anzBaelle.setMinorTickSpacing(25);
		sl_anzBaelle.setMajorTickSpacing(25);
		sl_anzBaelle.setPaintTicks(true);
		sl_anzBaelle.setPaintLabels(true);
		
		// Zahlen unter Slider
		Hashtable<Integer, JLabel> position = new Hashtable<Integer, JLabel>();
		position.put(0, new JLabel("0"));
		position.put(25, new JLabel("25"));
		position.put(50, new JLabel("50"));
		position.put(75, new JLabel("75"));
		position.put(100, new JLabel("100"));
		sl_anzBaelle.setLabelTable(position);
		
		this.add(sl_anzBaelle);

		// weitere grafische ELemente
		cb_w1.setBackground(Color.WHITE);
		this.add(cb_w1);
		
		cb_w2.setBackground(Color.WHITE);
		this.add(cb_w2);
		
		cb_w3.setBackground(Color.WHITE);
		this.add(cb_w3);
		
		cb_w4.setBackground(Color.WHITE);
		this.add(cb_w4);

		this.add(btn_start);
	}

	// Getter: Slider, Checkboxen, Button
	public int getSl_anzBaelle() {
		return sl_anzBaelle.getValue();
	}
	
	public JCheckBox getCb_w1() {
		return cb_w1;
	}
	public JCheckBox getCb_w2() {
		return cb_w2;
	}
	public JCheckBox getCb_w3() {
		return cb_w3;
	}
	public JCheckBox getCb_w4() {
		return cb_w4;
	}

	public JButton getBtn_start() {
		return btn_start;
	}
}
