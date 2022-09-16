package sec3;

public class Loop1 {

	public static void main(String[] args) {
//                1	         2      3	
//		for(반복변수 선언 및 초기화; 조건식; 증감식){
//			반복할 실행문;  4
//		 1 > 2 >4 >3 >2 > 4 실행하다가 3> 2 > 4 를 조건이 만족하는 동안 반복 수행 
//		}
//		반복변수가 부여된 초기값으로 시작하여 증감식에 따라 증감이 되다가 조건식이 만족하지 않으면, 더 이상 실행하지 않는다.
		int date [] = {90,80,70};
		int tot=0;
		
		for(int a=0; a<date.length; a++){
			System.out.println(a+"번째 사람의 점수 : " + date[a]);
			tot =tot+date[a];
		}
		double avg = (float) tot/ date.length;
		System.out.println("전체총점 : "+tot+", 전체평균 :"+avg);
	}

}
