package perScholasPackage;

/*
2. Write a program to implement String to Date conversion.
There are a lot of resources available on google
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringToDateFormating {
	public static void main(String args[]) {

		try {
			System.out.println(TimeStampConverter("08/16/2018"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public static String TimeStampConverter(String inputTimeStamp) throws ParseException {
		final String inputFormat = "MM/dd/yyyy";
		final String outputFormat = "EEE MMM dd HH:mm:ss z yyyy";
		return new SimpleDateFormat(outputFormat).format(new SimpleDateFormat(inputFormat).parse(inputTimeStamp));
	}

}
