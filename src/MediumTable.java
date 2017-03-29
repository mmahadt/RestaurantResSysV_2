import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MediumTable extends Table {
	private String timeSlots[] = { "11:00 am to 12:30 pm",
			"12:30 pm to 2:00 pm", "2:00 pm to 3:30 pm", "3:30 pm to 5:00 pm",
			"5:00 pm to 6:30 pm", "6:30 pm to 8:00 pm", "8:00 pm to 9:30 pm" };

	HashMap<String, Customer> CustomersTable = new HashMap<String, Customer>();

	public MediumTable() {
		for (String timeSlot : timeSlots) {
			CustomersTable.put(timeSlot, null);
		}// Initialize the hashTable initially all the customers are null
			// for each table which means all the slots are available. As soon
			// as a customer books a table, He gets recorded into the hashTable
	}

	@SuppressWarnings("rawtypes")
	public void getAvailableSlots() {

		Iterator<Entry<String, Customer>> it = CustomersTable.entrySet()
				.iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();

			if (pair.getValue().equals(null)) {
				System.out.println(pair.getKey());
			}
			it.remove(); // avoids a ConcurrentModificationException
		}
	}

	@SuppressWarnings("rawtypes")
	public void getBookedSlots() {

		Iterator<Entry<String, Customer>> it = CustomersTable.entrySet()
				.iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();

			if (!pair.getValue().equals(null)) {
				Customer x = (Customer) pair.getValue();
				System.out.println("Customer ID\t" + x.getId());
				System.out.println("Day:\t" + x.getDay());
				System.out.println("Name:\t" + x.getName());
				System.out
						.println("Time Slot booked\t" + x.getTimeSlotBooked());
			}
			it.remove(); // avoids a ConcurrentModificationException
		}
	}

	@Override
	public boolean isAnAppropriateTableFor(int people) {
		if (people <= 4)
			return true;
		else
			return false;
	}

}
