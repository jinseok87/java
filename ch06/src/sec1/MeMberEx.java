package sec1;

public class MeMberEx {

	public static void main(String[] args) {
		// 클래스명 인스턴스명 = new 생성자함수 ();
		Member mem1 = new Member();
		mem1.setId("jin");
		mem1.setPassword("1234");
		mem1.setName("jinseok");
		System.out.println("mem1_ID:" + mem1.getId());
		System.out.println("mem1_Password :" + mem1.getPassword());
		System.out.println("mem1_ name:" + mem1.getName());

		Member mem2 = new Member();
		mem2.setId("seok");
		mem2.setPassword("4567");
		System.out.println("mem2 id : " + mem2.getId());
		System.out.println("mem2 pw : " + mem2.getPassword());

		Member mem3 = new Member("jjs", "jin87", "진석", "김포");

		System.out.println(mem3.getId() + mem3.getPassword() + mem3.getName());

		MemberContoller mc = new MemberContoller();
		mc.join("jin", "jin87", "정진석");
		mc.info();
		mc.login("jin", "jin87");
		mc.info();

	}

}