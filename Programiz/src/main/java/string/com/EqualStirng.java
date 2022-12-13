package string.com;

public class EqualStirng {
	public static void main(String[] args) {
		
	
	String s1="Ram";
	String s2="Ram";
	String s3="Sham";
	String s4=new String("Ram");
	String s5=s1;
	
	System.out.println("Print == Operator:");
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1==s4);
	
	System.out.println("Print .equal Method:");
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
	System.out.println(s1.equals(s5));
		}

}
