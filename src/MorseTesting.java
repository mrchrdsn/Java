
public class MorseTesting {

	public MorseTesting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1;
		String test2;
		String finalResult;
		
		BaseTwo bt = BaseTwo.getInstance();

		test1 = bt.getBaseTwoValue(20);
		
		test2 = bt.getBaseTwoValue(59);
		
		finalResult = test1 + "\n" + test2;
		System.out.println(finalResult);
	}

}
