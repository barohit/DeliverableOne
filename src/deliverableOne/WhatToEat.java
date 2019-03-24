package deliverableOne;

import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String eventType = "";
		int partySize = 0;
		String mealSuggestion = "";
		String preparationSuggestion = "";
		String result = "";

		System.out.println("What is the event type? You can enter 'casual', 'semi-formal', or 'formal'.");
		eventType += scnr.nextLine();

		// While loop ensures that the users enters an allowed event type.
		while ((!(eventType.equals("casual")) && !(eventType.equals("semi-formal")) && !(eventType.equals("formal")))) {

			System.out.println("Error, invalid entry. Please try again:");
			eventType = scnr.next();
		}

		System.out.println();

		System.out.println("What is the size of your party?");
		partySize = scnr.nextInt();

		// while loop ensures that party size is a positive number
		while (partySize < 1) {

			System.out.println("Error, invalid party size. Please try again:");
			partySize = scnr.nextInt();
		}

		scnr.close();

		if (eventType.equals("casual")) {

			mealSuggestion = "sandwiches";
		}

		else if (eventType.equals("semi-formal")) {

			mealSuggestion = "fried chicken";
		}

		else if (eventType.equals("formal")) {

			mealSuggestion = "chicken parmesean";
		}

		// mealSuggestion assignment ends and preparationSuggestion assignment begins.

		if (partySize == 1) {

			preparationSuggestion = "in the microsave";
		}

		else {

			if (partySize >= 2 && partySize <= 12) {

				preparationSuggestion = "in your kitchen";
			}

			else {

				if (partySize >= 13) {

					preparationSuggestion = "by a caterer";

				}
			}

		}

		result = "Since you are hosting a " + eventType + " event for " + partySize + " participants, you should serve "
				+ mealSuggestion + " prepared " + preparationSuggestion + ".";

		System.out.println(result);

	}

}