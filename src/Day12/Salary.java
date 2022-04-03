package Day12;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your hourly rate:");
        int hourlyRate= input.nextInt();

        System.out.println("Enter your weekly hours:");
        int weeklyHours=input.nextInt();

        System.out.println("enter your state tax rate:");
        double stateTaxRate= input.nextDouble();

        System.out.println("enter your federal tax rate;");
        double federalTaxRate= input.nextDouble();


        int salaryBeforeTax=hourlyRate*weeklyHours*52;//salary is equalto one week' salary *52
        double stateTax=salaryBeforeTax*stateTaxRate/100;
        double federalTax=salaryBeforeTax*federalTaxRate/100;
        double totalTax=stateTax+federalTax;
        double salaryAfterTax=salaryBeforeTax-totalTax;

        System.out.println("Gross pay is:$ "+salaryBeforeTax);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("Net income is:$"+salaryAfterTax);

    }
}
/*
3. SalaryCalculator:
3.1 Ask the user to enter his/her hourlyRate
3.2 Ask the user how many hours he/she works in a week
3.3 Ask the user to enter state tax (in percentage)
3.4 Ask the user to enter federal tax (in percentage)
3.5 Calculate the:
3.4.1 salary
3.4.2 stateTax
3.4.3 federalTax
3.4.4 totalTax
3.4.5 netIncome
 */
