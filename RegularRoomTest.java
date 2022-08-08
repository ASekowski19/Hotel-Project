package chap5;

public class RegularRoomTest {

	public static void main(String[] args) {
		testGetCost();

	}
	private static void testGetCost() {
		System.out.println("\n-->testGetCost()");
		RegularRoom rr = new RegularRoom(401, 4, 6);
		double expected = 960.00;
		System.out.println(String.format("Expected Grand Total: $%,.2f", expected));
		System.out.println(String.format("  Actual Grand Total: $%,.2f", rr.getCost()));
	}


}
