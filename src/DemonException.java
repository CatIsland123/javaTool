class myException extends Exception{
	public myException(String message) {
	       super(message);
	}
}
class myTool{
	public static int parsetInt(String str) throws myException {
		int result=0;
		for(int i=0;i<str.length();i++ ) {
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
			   result=result*10+ch-'0';
			else throw new myException(str);
				
		}
		return result;
	}
}
public class DemonException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		System.out.println(myTool.parsetInt("123a"));
	} catch (myException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

