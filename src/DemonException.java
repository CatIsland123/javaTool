
class myTool{
	public static int parsetInt(String str) {
		int result=0;
		for(int i=0;i<str.length();i++ ) {
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
			   result=result*10+ch-'0';
				
		}
		return result;
	}
}
public class DemonException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(myTool.parsetInt("123"));
	}

}
