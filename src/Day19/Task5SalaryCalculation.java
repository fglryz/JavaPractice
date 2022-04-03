package Day19;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Task5SalaryCalculation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){

            System.out.println("How much you make an hour?");
            double hourlyRate=scan.nextDouble();
            if(hourlyRate<=0){
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            int weeklyHour= scan.nextInt();
            if(weeklyHour>144&&weeklyHour<=0){
                System.out.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }
            System.out.println("Enter your state tax rate");
            double stateTax=scan.nextDouble();
            if(stateTax<0.0&&stateTax>0.1){
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            double federalTaxRate = 0.26;

             double salaryBeforeTax =hourlyRate*weeklyHour*52; // salary is equal to one week' salary * 52
             stateTax = salaryBeforeTax * stateTax / 100;
             double federalTax = salaryBeforeTax * federalTaxRate / 100;
            double totalTax = stateTax + federalTax;
            double salaryAfterTax = salaryBeforeTax - totalTax;

            System.out.println("Gross pay is: $" + salaryBeforeTax  );
            System.out.println("State tax = $" + stateTax);
            System.out.println("Federal tax = $" + federalTax );
            System.out.println("Total tax = $" +totalTax );
            System.out.println("Net income = $"+salaryAfterTax);

            System.out.println("Would you like to continue?");
            String a= scan.next();
            while( !(a.equals("yes") || a.equals("no")) ){
                System.err.println("Invalid Entry, please re-enter! Would you like to continue?");
                a = scan.next().toLowerCase();
            }
            if(a.equals("no")){
                System.out.println("Thank you for using Cydeo circle calculator app!");
                break;
            }}
        scan.close();

        }



    }

/*
Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate
					 the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the
					program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate
					the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

 */