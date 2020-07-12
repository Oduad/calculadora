package calcu;

import javax.swing.JOptionPane;

public class Vectors {

	int lengthh;
	double scalar;

	public Vectors(int lengthh) {
		this.lengthh = lengthh;
	}

	public int getLengthh() {
		return lengthh;
	}

	public double getScalar() {
		return scalar;
	}

	public void setLengthh(int lengthh) {
		this.lengthh = lengthh;
	}

	public void setScalar(double scalar) {
		this.scalar = scalar;
	}
	
	/*public double[] getValue(Vectors v) {
		for (int i = 0; i <lengthh; i++) {
			i = v.
		}
		return i;
	}*/
	
	public void fillVector(int lenghtt) {
		String strV1 = "";
		double vector[] = new double[lenghtt];
		for (int i = 0; i < lenghtt; i++) {
			vector[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter the element " + (i + 1) + ": "));
			if (i < lenghtt-1) {
				strV1 += String.valueOf(vector[i] + ", ");
			}
			else {
				strV1 += String.valueOf(vector[i] + " ]");
			}
		}
		showVector(lengthh, strV1);
	}

	public void showVector(int lengthh, String strV1) {
		double vector[] = new double[lengthh];
		JOptionPane.showMessageDialog(null, "The vector entered was: [ " + strV1 + " \n");
		System.out.print("The vector entered was: [ ");
		for (int j = 0; j < lengthh; j++) {
			if (j == lengthh - 1) {
				System.out.print(vector[j] + "]\n");
			} else {
				System.out.print(vector[j] + ", ");
			}
		}
	}
	
	/*public Vectors addVectors(Vectors v1, Vectors v2) {
		double vectorR[] = new double[lengthh];
		for (int i = 0; i < vectorR.length; i++) {
			vectorR[i] = v1[i]+v2[i];
		}
		return vectorR;
	}*/
}
