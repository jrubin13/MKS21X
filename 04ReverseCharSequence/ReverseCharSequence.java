public class ReverseCharSequence implements CharSequence{
    private String str = "";
    public ReverseCharSequence(String a) {
	for (int i = a.length()-1; i >= 0; i--) {
	    str += a.charAt(i);
	}
    }
    public char charAt(int index) {
	for (int i = 0; i < str.length(); i++) {
	    if (index == i) {
		return str.charAt(i);
	    }
	}
	return str.charAt(0);
    }
    
    public int length() {
	int len = 0;
	int i = 0;
	String s = "";
	while (!(s.equals(str)))  {
	    len += 1;
	    s += str.charAt(i);
	    i += 1;
	}
	return len;
    }
    
    public String subSequence(int start, int end) {
	String ans = "";
	for (int i = start; i <= end; i++) {
	    if (i >= str.length()) {
		return ans;
	    }
	    ans += str.charAt(i);
	}
	return ans;
    }
    public static void main(String[] args) {
	ReverseCharSequence ans = new ReverseCharSequence("ymerej");
	System.out.println(ans.length());
	System.out.println(ans.charAt(3));
	System.out.println(ans.subSequence(0,8));
    }
}
