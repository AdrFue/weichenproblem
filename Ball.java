package fachreferat;

class Ball {
	
	// Variablen: Weichen, Start-/Zwischensummen, Ausgänge
	private boolean b_w1, b_w2, b_w3, b_w4;
	private int i_pos1, i_pos2, i_pos3, i_pos4, i_pos5;
	private int i_anzahl, i_anzLinks, i_anzRechts;

	// Setter
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

	// Main-Methode
	public void berrechneAusgaenge(int i_anzahlBaelle) {
		
		i_anzahl = i_anzahlBaelle;
		i_anzLinks = i_anzRechts = 0;
		i_pos1 = i_pos2 = i_pos3 = i_pos4 = i_pos5 = 0;

		// Alorightmus für Ball
		for (int i = 0; i < i_anzahl; i++) {
			if (b_w1) {
				i_pos2++;
				if (b_w3) {
					i_pos5++;
					i_anzRechts++;
				} else {
					i_pos4++;
					if (b_w4) {
						i_anzRechts++;
					} else {
						i_anzLinks++;
					}
					b_w4 = !b_w4;
				}
				b_w3 = !b_w3;
			} else {
				i_pos1++;
				if (b_w2) {
					i_pos4++;
					if (b_w4) {
						i_anzRechts++;
					} else {
						i_anzLinks++;
					}
					b_w4 = !b_w4;
				} else {
					i_pos3++;
					i_anzLinks++;
				}
				b_w2 = !b_w2;
			}
			b_w1 = !b_w1;
		}	
	}
	
	// Getter: Ballanzahl, Zwischensummen, Ausgänge
	public int getI_anzahl() {
		return i_anzahl;
	}

	public int getI_pos1() {
		return i_pos1;
	}
	public int getI_pos2() {
		return i_pos2;
	}
	public int getI_pos3() {
		return i_pos3;
	}
	public int getI_pos4() {
		return i_pos4;
	}
	public int getI_pos5() {
		return i_pos5;
	}
	
	public int getI_anzLinks() {
		return i_anzLinks;
	}
	public int getI_anzRechts() {
		return i_anzRechts;
	}
}
