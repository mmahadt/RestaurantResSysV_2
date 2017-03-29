public class ExLargeTable extends Table {
	
	private String booking;
	
	public String getBooking(){
		return booking;
	} 
	
	//Time slot is to be selected by the customer himself
	@Override
	public boolean isAnAppropriateTableFor(int people) {
		if (people <= 12)
			return true;
		else
			return false;
	}

}
