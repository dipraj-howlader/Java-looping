package BasicLooping;

public class BreakAndContinue {
	public static void main(String[] args) {
		System.out.println("---Break and Continue---\n\n");
		

		for(int i = 0; i<=10; i++) {
			if(i==10) {
			System.out.println("this is dipraj");
				break;
			}
			System.out.println(i);
	
		}
		//EVEN AND ODD collection by Continue statement
		
		for(int y = 0; y<=10; y++) {
			if(y%2 ==0) {
				continue;
			}
			System.out.println(y);
		}
		
	}
}
