
public class WrapperClassConcept {

	public static void main(String[] args) {
		String s="100";
		System.out.println(s+20);
		int l= Integer.parseInt(s);
		System.out.println(l+20);
		WrapperClassConcept sum = new WrapperClassConcept();
		System.out.println(sum.test());
		
		int j=200;
		String h=String.valueOf(j);
		System.out.println(h+20);
		
		String k = "100A";
		int a = Integer.parseInt(k);
		System.out.println(a);
	}
	public int test(){
		int x=10;
		int y=20;
		int s=x+y;
		return s;
	}

}
