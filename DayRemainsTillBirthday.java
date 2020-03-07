import java.time.LocalDate;
import java.util.Scanner;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class DayRemainsTillBirthday {

	public static void main(String[] args) {
		try {
			LocalDate dateToday = LocalDate.now();
			LocalDate lastDateFebruary;
			int thisYear = dateToday.getYear();
			 
			lastDateFebruary = LocalDate.of(thisYear,02,28);
		
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Your This Year's Birth Day in 'YYYY-MM-DD' format: ");
		
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String getBirthday = new String(scan.nextLine());
		
			Date birthday = formatter.parse(getBirthday);
		
			LocalDate dateBirthday = birthday.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			
			System.out.println("Today's Date: " + dateToday);
			System.out.println("Birthday This Year is On: " + dateBirthday);
			if(dateToday.isEqual(dateBirthday)) {
				System.out.println("Today is Your Birthday. Happy Birthday From Java. ");
			}
			else if(dateToday.isBefore(dateBirthday)) {
				System.out.println("Your Birthday is Yet To Come. Time Remaining For Your Birthday to come is: ");
				Period timeRemaining = Period.between(dateToday, dateBirthday);
				System.out.println(timeRemaining.getYears() + "Years");
				System.out.println(timeRemaining.getMonths() + "Months");
				System.out.println(timeRemaining.getDays() + "Days");
			}
			else if(dateToday.isAfter(dateBirthday)) {
				if(dateToday.isLeapYear()) {
					LocalDate lastDateFebruary2 = lastDateFebruary.plusDays(1);
					LocalDate dateBirthday2 = dateBirthday.plusYears(4);
					if(lastDateFebruary2.isEqual(dateBirthday)) {
						System.out.println("You Have already celebrateed you Birthday This Year. Sorry to say but Your Birthday will Come Again After: ");
						Period timeRemaining = Period.between(dateToday, dateBirthday2);
						System.out.println(timeRemaining.getYears() + "Years");
						System.out.println(timeRemaining.getMonths() + "Months");
						System.out.println(timeRemaining.getDays() + "Days");
					}
					else {
						System.out.println("You Have already celebrated your Birthday This Year. It'll Come Again After: ");
						LocalDate dateBirthday21 = dateBirthday.plusYears(1);
						Period timeRemaining = Period.between(dateToday, dateBirthday21);
						System.out.println(timeRemaining.getYears() + "Years");
						System.out.println(timeRemaining.getMonths() + "Months");
						System.out.println(timeRemaining.getDays() + "Days");
					}
				}
				else {
					System.out.println("You Have already celebrated your Birthday This Year. It'll Come Again After: ");
					LocalDate dateBirthday2 = dateBirthday.plusYears(1);
					Period timeRemaining = Period.between(dateToday, dateBirthday2);
					System.out.println(timeRemaining.getYears() + "Years");
					System.out.println(timeRemaining.getMonths() + "Months");
					System.out.println(timeRemaining.getDays() + "Days");
				}
		
			}
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
	}

}
