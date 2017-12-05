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
	    throw new IllegalArgumentException;
	}
	for (int i = 0; i < data.lenth(); i++) {
	    if ((data.charAt(i) - 48) > 10 || (data.charAt(i) - 48) < 0) {
		throw new IllegalArgumentException;
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
	String ans = "";
	int value = 0;
	for (int i = 0; i < zip.length(); i++) {
	    value = zip.charAt(i) - 48;
	    ans += converter[value];
	}
	return ans;
    }
    public String toZip (String code) {

    }
    public String toString() {
	return getCode() + " (" + getZip() + ")";
    }
}
