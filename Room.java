package chap5;

public abstract class Room implements Billable{
	protected int number;
	protected int numGuests;
	protected int numNights; 
	
	public Room(int number, int numGuests, int numNights) {
		this.number = number;
		this.numGuests = numGuests;
		this.numNights = numNights;
	}
	
	public Room(int number) {
		this(number, 1, 1);
	}
	
	public int getNumber() {
		return number;
	}
	public int getNumGuests() {
		return numGuests;
	}
	public int getNumNights() {
		return numNights;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Room) {
			Room r = (Room)o;
			return this.number == r.number;
		}
		return false;
	}
	public void setNumGuests(int numGuests) {
		this.numGuests = numGuests;
	}
	public void setNumNights(int numNights) {
		this.numNights = numNights;
	}
	
	public int compareTo(Room room) {
		return this.number = room.number;
	}
	
	public abstract double getCost();
	
	@Override
	public String getReceipt() {
		return String.format("Room num=%d, cost=$%.2f", number, getCost());
	}
}
