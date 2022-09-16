package sec4;

public class ex4 {

	public static void main(String[] args) {
		
		boolean run = true;
		while(run){
			int num1 = (int) (Math.random()*6)+1;
			int num2 = (int) (Math.random()*6)+1;
			if((num1+num2)==5){
				run = false;
			}
			System.out.println("("+num1+","+num2+")");
		}
	}

}
