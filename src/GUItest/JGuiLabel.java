package GUItest;

import javax.swing.JLabel;

public class JGuiLabel extends JLabel {
	private int MX;
	private int MY;
	private int IX;
	private int IY;

	public JGuiLabel(int MX, int MY, int IX, int IY) {
		super();
		this.MX = MX;
		this.MY = MY;
		this.IX = IX;
		this.IY = IY;
	}

	public JGuiLabel(){
		super();
	}

	public int getMX() {
		return MX;
	}

	public void setMX(int MX) {
		this.MX = MX;
	}

	public int getMY() {
		return MY;
	}

	public void setMY(int MY) {
		this.MY = MY;
	}

	public int getIX() {
		return IX;
	}

	public void setIX(int IX) {
		this.IX = IX;
	}

	public int getIY() {
		return IY;
	}

	public void setIY(int IY) {
		this.IY = IY;
	}
}
