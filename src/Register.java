public class Register {
	Day[] month = new Day[30];
	
	public void printMonthlyReport(){
		for(Day day:month){
			day.getBookings();
		}
	}
	
	public static void main(String[] args){
		System.out.println("***\tWelcome to Restaurant Reservation System\t***");
		System.out.println("For how many people you want to reserve a table for");
		System.out.println("Which date do you want to make a reservation for");
		System.out.println("Following are the available slots for the desired day");
		System.out.println("Please enter your name so that we can confirm "
				+ "your reservation on the desired day");
		System.out.println("Congratulations your table has been reserved");
		System.out.println("Details of the table are as under");
		System.out.println("Click here to print a monthly schedule for all customers");
	}
}
