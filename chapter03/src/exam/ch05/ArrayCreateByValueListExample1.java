package exam.ch05;

public class ArrayCreateByValueListExample1 {
public static void main(String[] args) {
	int[] scores = {83,90,87};
	
	System.out.println(scores[0]);
	System.out.println(scores[1]);
	System.out.println(scores[2]);
	System.out.println(scores.length);
	for(int i=0; i<scores.length; i++) {
//		sum += scores[i];
		System.out.println(scores[i]);
	}
		
			
}
}