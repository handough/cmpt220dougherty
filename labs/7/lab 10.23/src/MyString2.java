
public class MyString2 {
	static String s;
	
	public MyString2(String s) {
		MyString2.s = s;
	}
	public int compare(String s) {
		int index = 0;
		if (MyString2.s.length() < s.length())
			index = -1;
		if (s.length() < MyString2.s.length())
			index = 1; 

		for (int i = 0; i < MyString2.s.length(); i++) {
			if (MyString2.s.charAt(i) < s.charAt(i))
				index = -(i + 1);
			if (MyString2.s.charAt(i) > s.charAt(i))
				index = i + 1;
		}
		return index;
	}
	public MyString2 substring(int begin) {
		String b = "";
		for (int i = begin; i < s.length(); i++) {
			b += s.charAt(i) + "";
		}
		return new MyString2(b);
	}
	public MyString2 toUpperCase() {
		String n = "";
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				n += String.valueOf((char)(s.charAt(i) - 32));
			else
				n += String.valueOf(s.charAt(i));
		}
		return new MyString2(n);
	}
	public char[] toChars() {
		char[] chars = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			chars[i] = s.charAt(i);
		}
		return chars;
	}
	public static MyString2 valueOf(boolean b) {
		return (b ? new MyString2("true") : new MyString2("false"));
	}
}
