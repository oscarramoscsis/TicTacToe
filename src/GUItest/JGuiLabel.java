package GUItest;

import javax.swing.JLabel;

public class JGuiLabel extends JLabel {
	private int MX;
	private int MY;

//	private int IX;
//	private int IY;

	public JGuiLabel(int MX, int MY, int IX, int IY) {
		super();
		this.MX = MX;
		this.MY = MY;
//		this.IX = IX;
//		this.IY = IY;
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

	public int getMajorX() {
		int returnVal = 0;

		switch (MX) {
			case 0:
				returnVal= 1;
			break;
			case 1:
				returnVal= 1;
			break;
			case 2:
				returnVal= 1;
			break;
			case 3:
				returnVal= 2;
			break;
			case 4:
				returnVal= 2;
			break;
			case 5:
				returnVal= 2;
			break;
			case 6:
				returnVal= 3;
			break;
			case 7:
				returnVal=  3;
			break;
			case 8:
				returnVal= 3;
			break;
		}
		return returnVal;
	}

	public int getMajorY() {
		int returnVal = 0;

		switch (MX) {
			case 0:
				returnVal= 1;
				break;
			case 1:
				returnVal= 2;
				break;
			case 2:
				returnVal= 3;
				break;
			case 3:
				returnVal= 1;
				break;
			case 4:
				returnVal= 2;
				break;
			case 5:
				returnVal= 3;
				break;
			case 6:
				returnVal= 1;
				break;
			case 7:
				returnVal=  2;
				break;
			case 8:
				returnVal= 3;
				break;
		}
		return returnVal;
	}

	public int getInnerX() {
		int returnVal = 0;

		switch (MY) {
			case 0:
				returnVal= 1;
				break;
			case 1:
				returnVal= 1;
				break;
			case 2:
				returnVal= 1;
				break;
			case 3:
				returnVal= 2;
				break;
			case 4:
				returnVal= 2;
				break;
			case 5:
				returnVal= 2;
				break;
			case 6:
				returnVal= 3;
				break;
			case 7:
				returnVal=  3;
				break;
			case 8:
				returnVal= 3;
				break;
		}
		return returnVal;
	}

	public int getInnerY() {
		int returnVal = 0;

		switch (MY) {
			case 0:
				returnVal= 1;
				break;
			case 1:
				returnVal= 2;
				break;
			case 2:
				returnVal= 3;
				break;
			case 3:
				returnVal= 1;
				break;
			case 4:
				returnVal= 2;
				break;
			case 5:
				returnVal= 3;
				break;
			case 6:
				returnVal= 1;
				break;
			case 7:
				returnVal=  2;
				break;
			case 8:
				returnVal= 3;
				break;
		}
		return returnVal;
	}

		//
//	public int getIX() {
//		return IX;
//	}
//
//	public void setIX(int IX) {
//		this.IX = IX;
//	}
//
//	public int getIY() {
//		return IY;
//	}
//
//	public void setIY(int IY) {
//		this.IY = IY;
//
}
