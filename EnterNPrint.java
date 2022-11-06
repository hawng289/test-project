package hw1_20001913_ngothithuhang;


import java.util.Scanner;

public class EnterNPrint {

	public static void main(String[] args) {
		Scanner inner = new Scanner(System.in);
		try {
			System.out.println("Enter the byte value: ");
			byte byteValue = (byte) Byte.parseByte(inner.nextLine());
			System.out.println(byteValue + " is a Byte Value");

		} catch (NumberFormatException e) {
			System.out.println("You entered the wrong data type");
		}

		try {
			System.out.println("Enter the short value: ");
			short shortValue = Short.parseShort(inner.nextLine());
			System.out.println(shortValue + " is a Short Value");

		} catch (NumberFormatException e) {
			System.out.println("You entered the wrong data type");
		}

		try {
			System.out.println("Enter the int value: ");
			int intValue = Integer.parseInt(inner.nextLine());
			System.out.println(intValue + " is a Integer Value");
		} catch (NumberFormatException e) {
			System.out.println("You entered the wrong data type");
		}

		try {
			System.out.println("Enter the long value: ");
			long longValue = Long.parseLong(inner.nextLine());
			System.out.println(longValue + " is a Long Value");
		} catch (NumberFormatException e) {
			System.out.println("You entered the wrong data type");
		}

		try {
			System.out.println("Enter the float value: ");
			float floatValue = Float.parseFloat(inner.nextLine());
			System.out.println(floatValue + " is a Float Value");
		} catch (NumberFormatException e) {
			System.out.println("You entered the wrong data type");
		}

		try {
			System.out.println("Enter the double value: ");
			double doubleValue = Double.parseDouble(inner.nextLine());
			System.out.println(doubleValue + " is a Double Value");
		} catch (NumberFormatException e) {
			System.out.println("You entered the wrong data type");
		}

		try {
			System.out.println("Enter the boolean value: ");
			boolean booleanValue = Boolean.parseBoolean(inner.nextLine());
			System.out.println(booleanValue + " is a Boolean Value");
		} catch (NumberFormatException e) {
			System.out.println("You entered the wrong data type");
		}

		try {
			System.out.println("Enter the char value: ");
			char charValue = inner.nextLine().charAt(0);
			System.out.println(charValue + " is a Char Value");
		} catch (NumberFormatException e) {
			System.out.println("You entered the wrong data type");
		}
		
		inner.close();

	}
}