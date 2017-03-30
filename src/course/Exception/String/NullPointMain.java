package course.Exception.String;

public class NullPointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// try block contains logic
		try{
		StringException se=new StringException("ravikanth");
		String s=new String(se.getName());
		// returns length of string
		System.out.println(s.length());
		// returns string value at 10 index
		// since no 10th string...returns string out of bounds exception
		System.out.println(s.charAt(10));
	}
		// catch block 
		// handles exception and returns a message
		catch(Exception e){
			System.out.println("charAt(10)");
			System.out.println("No character at this index");
		}
	}
}
