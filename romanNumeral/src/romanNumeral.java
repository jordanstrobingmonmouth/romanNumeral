import javax.swing.JOptionPane;

public class romanNumeral {
	
	public static void main(String []args) {
	
		String input = JOptionPane.showInputDialog("Enter a number up to 3999");
		JOptionPane.showMessageDialog(null, "The number you entered is " + input);
		
		int number = Integer.parseInt(input);
		
		int thousand = 0;
		
		int hundred = 0;
		
		int ten = 0;
		
		int one = 0;
		
		String roman = "";
		
		if (number >= 1000) {
			thousand = (number / 1000)%10;
			if (thousand == 3) {
				roman = roman + "MMM";
			}
			else if (thousand == 2) {
				roman = roman + "MM";
			}
			else if (thousand == 1) {
				roman = roman + "M";
			}
		
		}
		
		if (number >= 100) {
			hundred = (number / 100)%10;
			if (hundred == 9) {
				roman = roman + "CM";
			}
			else if (hundred == 8) {
				roman = roman + "DCCC";
			}
			else if (hundred == 7) {
				roman = roman + "DCC";
			}
			else if (hundred == 6) {
				roman = roman + "DC";
			}
			else if (hundred == 5) {
				roman = roman + "D";
			}
			else if (hundred == 4) {
				roman = roman + "CD";
			}
			else if (hundred == 3) {
				roman = roman + "CCC";
			}
			else if (hundred == 2) {
				roman = roman + "CC";
			}
			else if (hundred == 1) {
				roman = roman + "C";
			}
		}
		
		if (number >= 10) {
			ten = (number / 10)%10;
			if (ten == 9) {
				roman = roman + "XC";
			}
			else if (ten == 8) {
				roman = roman + "LXXX";
			}
			else if (ten == 7) {
				roman = roman + "LXX";
			}
			else if (ten == 6) {
				roman = roman + "LX";
			}
			else if (ten == 5) {
				roman = roman + "L";
			}
			else if (ten == 4) {
				roman = roman + "XL";
			}
			else if (ten == 3) {
				roman = roman + "XXX";
			}
			else if (ten == 2) {
				roman = roman + "XX";
			}
			else if (ten == 1) {
				roman = roman + "X";
			}
		}

		if (number >= 1) {
			one = (number / 1)%10;
			if (one == 9) {
				roman = roman + "IX";
			}
			else if (one == 8) {
				roman = roman + "VIII";
			}
			else if (one == 7) {
				roman = roman + "VII";
			}
			else if (one == 6) {
				roman = roman + "VI";
			}
			else if (one == 5) {
				roman = roman + "V";
			}
			else if (one == 4) {
				roman = roman + "IV";
			}
			else if (one == 3) {
				roman = roman + "III";
			}
			else if (one == 2) {
				roman = roman + "II";
			}
			else if (one == 1) {
				roman = roman + "I";
			}
		}
		
		
		JOptionPane.showMessageDialog(null, "Your number in Roman Numerals is " + roman);

	}

}
