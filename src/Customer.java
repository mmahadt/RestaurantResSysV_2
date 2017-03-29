/*
This is customer class. It holds all the data about one customer 
who has booked a table
 */
public class Customer {
	
	int id;// autoIncrement Primary Key
	String name;
	int day;
	private static int nthCustomer = 0;
	String timeSlotBooked;
	int numOfPeople;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getTimeSlotBooked() {
		return timeSlotBooked;
	}

	public void setTimeSlotBooked(String timeSlotBooked) {
		this.timeSlotBooked = timeSlotBooked;
	}

	public int getNumOfPeople() {
		return numOfPeople;
	}

	public void setNumOfPeople(int numOfPeople) {
		this.numOfPeople = numOfPeople;
	}

	public int getId() {
		return id;
	}

	public Customer() {
		++nthCustomer;
		id = nthCustomer;
	}
	
}
