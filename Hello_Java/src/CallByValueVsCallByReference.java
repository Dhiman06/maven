
public class CallByValueVsCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueVsCallByReference obj = new CallByValueVsCallByReference();
		int x=10;
		int y=20;
		int h=obj.test(x,y);
		System.out.println(h);
		obj.p=50;
		obj.q=60;

		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);

	} 
	//call by value or pass by value
	public int test(int a, int b){
		 a=40;
		 b=30;
		int c=a+b;
		return c;
	}
	
	public void swap(CallByValueVsCallByReference t){
		int temp =t.p;
		t.p=t.q;
		t.q=temp;
	}

}
