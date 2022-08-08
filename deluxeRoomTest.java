package chap5;

public class deluxeRoomTest {

	public static void main(String[] args) {
		
		testGetCost_WithPets_OneGuest();
		testGetCost_WithPets_MoreThanOneGuest();
		testGetCost_WithoutPets_OneGuest();
		testGetCost_WithoutPets_MoreThanOneGuest();
		
	}
	
	
	private static void testGetCost_WithPets_OneGuest() {
		System.out.println("\n-->testGetCost()");
		DeluxeRoom dr = new DeluxeRoom(401, 1, 2, 3);
		double expected = 420.00;
		System.out.println(String.format("Expected Grand Total = $%,.2f", expected));
		System.out.println(String.format("  Actual Grand Total = $%,.2f", dr.getCost()));
	}
	
	private static void testGetCost_WithPets_MoreThanOneGuest() {
		System.out.println("\n-->testGetCost_WithPets_MoreThanOneGuest()");
		DeluxeRoom dr = new DeluxeRoom(401, 3, 3, 3);
		double expected = 660.00;
		System.out.println(String.format("Expected Grand Total = $%,.2f", expected));
		System.out.println(String.format("  Actual Grand Total = $%,.2f", dr.getCost()));
	}
	
	private static void testGetCost_WithoutPets_OneGuest() {
		System.out.println("\n-->testGetCost_WithoutPets()");
		DeluxeRoom dr = new DeluxeRoom(401, 1, 2, 0);
		double expected = 300.00;
		System.out.println(String.format("Expected Grand Total = $%,.2f", expected));
		System.out.println(String.format("  Actual Grand Total = $%,.2f", dr.getCost()));
	}
	
	private static void testGetCost_WithoutPets_MoreThanOneGuest() {
		DeluxeRoom dr = new DeluxeRoom(401, 5, 2, 0);
		double expected = 360.00;
		System.out.println(String.format("Expected Grand Total = $%,.2f", expected));
		System.out.println(String.format("  Actual Grand Total = $%,.2f", dr.getCost()));
	}



}