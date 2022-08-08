package chap5;

public class RegularRoom extends Room {
	private final double rate = 80.0;
	private final double guestCost = 20.0;
	
	public RegularRoom(int number, int numGuests, int numNights) {
		super(number, numGuests, numNights);
	}
	public RegularRoom(int number) {
		this(number, 1, 1);
	}
	
	@Override
	public double getCost() {
		return (rate + guestCost*numGuests) * numNights;
	}
	
	@Override
	public String toString () {
		String msg = String.format("Regular Room: room number=%d, num guests = %d, num nights= %d, cost=$%.2f", number, numGuests, numNights, getCost());
		return msg;
	}
}
