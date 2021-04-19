import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {100,20,30,40,25,70};
		System.out.println(i[1]);
		System.out.println(i.length);
		for(int j=0;j<i.length;j++)
			System.out.println(i[j]);
		Arrays.sort(i);
			
			System.out.println(Arrays.toString(i));

	}

}
