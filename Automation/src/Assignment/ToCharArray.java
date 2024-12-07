package Assignment;

public class ToCharArray {
	
	public static void main(String[] args) {
		
		String s = "hello";
		char c[] = s.toCharArray();
		String s1 = "";
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s1.indexOf(c[i]));
		}
		System.out.println(s1);
	}

}
