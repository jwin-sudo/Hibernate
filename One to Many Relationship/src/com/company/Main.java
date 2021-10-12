package com.company;

import java.util.Scanner;
import java.util. *;
public class Main {

    public static void main(String[] args) {
	// write your code here



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of events in CSV format");
        String typeOfEvent = sc.nextLine();

        String[] arrOfStr = typeOfEvent.split(",");

        System.out.println("enter the number of Events");
        int numberOfEvents = sc.nextInt();

        List<String> newListObject = new ArrayList<String>();

        for(int i = 0; i<numberOfEvents;i++) {
            System.out.println("Enter the Event " + (i+=1) + " Details");
            String eventDetails = sc.nextLine();
            String[] arrOfEventDetails = eventDetails.split(",");
            //newListObject.addAll(Arrays.asList(arrOfEventDetails));

            Event event = new Event(arrOfEventDetails[0], arrOfEventDetails[1], arrOfEventDetails[2], arrOfEventDetails[3]);
            ArrayList<Event> arr = new ArrayList<>();
            EventType eventType = new EventType(arrOfEventDetails[0], arr);

            ArrayList<EventType> arr2 = new ArrayList<>();

            EventTypeBO eventTypeBO = new EventTypeBO();

            System.out.println("Event Type:" + arrOfStr[i]);



        }

    }
}
