
public class PractiseStrings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="madam";
		//String s=new String("madam");
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("d"));
	//palindrome
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
		t = t+ s.charAt(i);
		System.out.println(t.length());	
		}
		
	if(s==t)
	{
		System.out.println("yes");
	}
}

}
