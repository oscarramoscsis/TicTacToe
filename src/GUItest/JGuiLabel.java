package GUItest;

import javax.swing.JLabel;

public class JGuiLabel extends JLabel {
	private int mx;
	private int my;

//	private int IX;
//	private int IY;

	public JGuiLabel(int mx, int my, int ix, int iy) {
		super();
		this.mx = mx;
		this.my = my;
//		this.IX = IX;
//		this.IY = IY;
	}

	public JGuiLabel(){
		super();
	}


	public JGuiLabel(int mx, int my) {
		super();
		this.mx = mx;
		this.my = my;
	}

	public int getMX() {
		return mx;
	}

	public void setMX(int MX) {
		this.mx = MX;
	}

	public int getMY() {
		return my;
	}

	public void setMY(int MY) {
		this.my = my;
	}

	public int getMajorX() {
		int returnVal = 0;

		switch (mx) {
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

		switch (mx) {
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

		switch (my) {
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

		switch (my) {
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


	public int converterForMajorPos(int mx, int my)
	{
		int majorNumber = 0;


		if(mx == 1 && my == 1)
		{
			majorNumber = 1;
		}

		else if (mx == 1 && my == 2)
		{
		majorNumber = 2;
		}

		else if(mx == 1 && my == 3)
		{
			majorNumber = 3;
		}

		else if(mx == 2 && my == 1)
		{
			majorNumber = 4;
		}


		else if(mx == 2 && my == 2)
		{
			majorNumber = 5;
		}

		else if(mx == 2 && my == 3)
		{
			majorNumber = 6;
		}


		else if(mx == 3 && my == 1)
		{
			majorNumber = 7;
		}

		else if(mx == 3 && my == 2)
		{
			majorNumber = 8;
		}


		else if(mx == 3 && my == 3)
		{
			majorNumber = 9;
		}

		return majorNumber;
	}


	public int converterFromMinorPosToMajorPos(int ix, int iy)
	{
		int majorNumber = 0;


		if(ix == 1 && iy == 1)
		{
			majorNumber = 1;
		}

		else if (ix == 1 && iy == 2)
		{
			majorNumber = 2;
		}

		else if(ix == 1 && iy == 3)
		{
			majorNumber = 3;
		}

		else if(ix == 2 && iy == 1)
		{
			majorNumber = 4;
		}


		else if(ix == 2 && iy == 2)
		{
			majorNumber = 5;
		}

		else if(ix == 2 && iy == 3)
		{
			majorNumber = 6;
		}


		else if(ix == 3 && iy == 1)
		{
			majorNumber = 7;
		}

		else if(ix == 3 && iy == 2)
		{
			majorNumber = 8;
		}


		else if(ix == 3 && iy == 3)
		{
			majorNumber = 9;
		}

		return majorNumber;
	}

}

//TEST COMMENT
//TEST COMMENT 2


