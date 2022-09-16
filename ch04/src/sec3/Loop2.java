package sec3;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		int jum[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<jum.length; i++){
			System.out.print((i+1)+"번째 사람 점수 :");
			jum[i] = sc.nextInt();
		}
		int i=0;
		int tot=0;
		while(i<jum.length){
			System.out.println("점수"+(i+1)+" : " +jum[i]);
			tot+=jum[i];
			i++;
		}
		System.out.println(i+"명의 점수의 총합은 "+tot);
	}
}

 