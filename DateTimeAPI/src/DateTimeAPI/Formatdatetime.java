package DateTimeAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatdatetime {

	public static void main(String[] args) {
		LocalDateTime ltd1=LocalDateTime.now();
		System.out.println("Before Formatting "+ltd1);
		DateTimeFormatter myobj=DateTimeFormatter.ofPattern("dd-mm-yy hh-mm");
		 
		String formattedDate=ltd1.format(myobj);
		System.out.println("Formatted date "+formattedDate);
		

	}

}
