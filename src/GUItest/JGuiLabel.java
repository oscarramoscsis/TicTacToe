package GUItest;

import javax.swing.JLabel;

public class JGuiLabel extends JLabel {
	private int majorPos;
	private int innerPos;
//	private int IX;
//	private int IY;

//	public JGuiLabel(int MX, int MY, int IX, int IY) {
//		super();
//		this.MX = MX;
//		this.MY = MY;
////		this.IX = IX;
////		this.IY = IY;
//	}

	public JGuiLabel(){
		super();
	}

	public JGuiLabel(int majorPos, int innerPos) {
		this.majorPos = majorPos;
		this.innerPos = innerPos;
	}

	public int getMajorPos() {
		return majorPos;
	}

	public void setMajorPos(int majorPos) {
		this.majorPos = majorPos;
	}

	public int getInnerPos() {
		return innerPos;
	}

	public void setInnerPos(int innerPos) {
		this.innerPos = innerPos;
	}
}
