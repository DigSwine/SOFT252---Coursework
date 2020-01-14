# SOFT252---Coursework
This document was edited with WordPad.

SOFT252 - Coursework, Due 9th Jan 2020.
Saved on Github - DigSwine 
HTML = https://github.com/DigSwine/SOFT252---Coursework

This project was made using: Apache NetBeans  - use of NetBeans IDE will prevent the debugger from working. 


If there is NO Data.txt file present, then run the system and check again - The system will create the text file and add defult values.


Usernames 		Passwords		UserType

KBrook		12345			Doctor
DValintine		12345			Doctor
BRoss			12345			Doctor
DCharger		123456		Patient
KLittle		1212			Patient
LWalker		123123		Patient
KSouthbank		0909			Admin
SBeonce		9090			Secretary

JDick			123			Patient - Allowed to join by 							     secratery

ADeago		123423		Patient - Denyed removal by 								secratery


Appointments
Last Appointment Data - 05/01/2020:
	
The Appointments run off a real time clock, so create and accept an appointment using a secratery, to be able to view an appointment, or log into BRoss and go the 5th January 2020 using the buttons.

Appointments can ONLY by made for the current year.



Issues that need to be fixed -

No "," can be added in doctors notes as the seprator for the read in lines is ", ". Fixable by using a converter function to change the comma to a hiphon for saving and reverse this for the read in.

Users do NOT have a 4 digit ID number, but have a 1 digit ID number based on an ArrayList. Fixiable by adding a 4 digit ID number into the file and having a read in for it, and have it save as an int - this was done for the saving of reviews and feedback.

Most things get saved as an int, when starting i did not understand java that well, so when it cam to reading in a file, i did not know that Integer.valueOf(String) existed and though i would change this when i figured this out, however it was almost two months into the project when this was noticed, and only 4 days before the hand in date, this has been left but can easily be fixed, as seen in the doctor read in.





