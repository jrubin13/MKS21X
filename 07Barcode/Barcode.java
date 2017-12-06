public class Barcode {
    private String data;
    private String[] converter = new String[10];
    
    public Barcode(String nums) {
	data = nums;
	converter[0] = "||:::";
        converter[1] = ":::||";
        converter[2] = "::|:|";
        converter[3] = "::||:";
        converter[4] = ":|::|";
	converter[5] = ":|:|:";
	converter[6] = ":||::";
	converter[7] = "|:::|";
	converter[8] = "|::|:";
	converter[9] = "|:|::";
	if (data.length() != 5) {
	    throw new IllegalArgumentException();
	}
	for (int i = 0; i < data.length(); i++) {
	    if ((data.charAt(i) - 48) > 10 || (data.charAt(i) - 48) < 0) {
		throw new IllegalArgumentException();
	    }
	}
    }
    public String getZip() {
	return data;
    }
    public String getCode() {
	return "|" + numToCode() + "|";
    }
    public boolean equals(Barcode other) {
	if (data.equals(other.data)) {
	    return true;
	}
	return false;
    }
    public int compareTo(Barcode other) {
	return data.compareTo(other.data);
    }
    public String numToCode() {
	String ans = "";
	int value = 0;
	for (int i = 0; i < data.length(); i++) {
	    value = data.charAt(i) - 48;
	    ans += converter[value];
	}
	return ans + converter[getCheck()];
    }
    public int getCheck() {
	int ans = 0;
	for (int i = 0; i < data.length(); i++) {
	    ans += (int)data.charAt(i);
	}
	ans = ans % 10;
	return ans;
    }

    
    public static String toCode(String zip) {
	String[] converter = new String[10];
	converter[0] = "||:::";
        converter[1] = ":::||";
        converter[2] = "::|:|";
        converter[3] = "::||:";
        converter[4] = ":|::|";
	converter[5] = ":|:|:";
	converter[6] = ":||::";
	converter[7] = "|:::|";
	converter[8] = "|::|:";
	converter[9] = "|:|::";
	int check = 0;
	for (int i = 0; i < zip.length(); i++) {
	    check += (int)zip.charAt(i);
	}
	check = check % 10;
	String ans = "";
	int value = 0;
	if (zip.length() != 5) {
	    throw new IllegalArgumentException();
	}
	for (int i = 0; i < zip.length(); i++) {
	    if ((zip.charAt(i) - 48) > 10 || (zip.charAt(i) - 48) < 0) {
		throw new IllegalArgumentException();
	    }
	}
	for (int i = 0; i < zip.length(); i++) {
	    value = zip.charAt(i) - 48;
	    ans += converter[value];
	}
	return "|" + ans + converter[check] + "|";
    }
    
    public static String toZip (String code) {
	if (code.length() != 32) {
	    throw new IllegalArgumentException();
	}
	if (code.charAt(0) != '|' || code.charAt(code.length()-1) != '|') {
	    throw new IllegalArgumentException();
	}
	for (int i = 0; i < code.length(); i++) {
	  if (code.charAt(i) != ':' && code.charAt(i) != '|') {
		throw new IllegalArgumentException();
	  }
	}
	String[] converter = new String[10];
	converter[0] = "||:::";
        converter[1] = ":::||";
        converter[2] = "::|:|";
        converter[3] = "::||:";
        converter[4] = ":|::|";
	converter[5] = ":|:|:";
	converter[6] = ":||::";
	converter[7] = "|:::|";
	converter[8] = "|::|:";
	converter[9] = "|:|::";
	String value = "";
	String ans = "";
	for (int i = 1; i < code.length()-6; i+=5) {
	    value = code.substring(i, i+5);
	    if (value.equals(":::::") || value.equals("|||||")) {
		throw new IllegalArgumentException();
	    }
	    for (int x = 0; x < converter.length; x++) {
		if (value.equals(converter[x])) {
		    ans += x;
		}
	    }
	}
	if (ans.length() != 5) {
	  throw new IllegalArgumentException();
	}
	return ans;
    }
    public String toString() {
	return getCode() + " (" + getZip() + ")";
    }
}
