public class Day {
	int date;
	static int dayCount = 0;

	public Day() {
		if (dayCount < 31) {
			++dayCount;
			date = dayCount;// each day gets a value between 1 and 30 inclusive
		} else {
			dayCount = 0;
		}
	}

	SmallTable[] smallTables = new SmallTable[4];
	MediumTable[] medTables = new MediumTable[8];
	LargeTable[] largeTables = new LargeTable[3];
	ExLargeTable xLargeTable = new ExLargeTable();

	public void getBookings() {
		for (SmallTable st : smallTables) {
			st.getBookedSlots();
		}
		for (MediumTable st : medTables) {
			st.getBookedSlots();
		}
		for (LargeTable st : largeTables) {
			st.getBookedSlots();
		}
		System.out.print(xLargeTable.getBooking());
	}
}
