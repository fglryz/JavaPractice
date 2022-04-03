package Day31;

public class SalaryCalculator {
    public double hourlyRate,federalTaxRate,weeklyHours,stateTaxRate;

    public String toString() {
        return "SalaryCalculatortask{" +
                "hourlyRate=" + hourlyRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", salary after tax=$" + salaryAfterTax() +
                '}';
    }




    public SalaryCalculator(double hourlyRate, double federalTaxRate, double weeklyHours, double stateTaxRate) {
        this.hourlyRate = hourlyRate;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate/100;


    }
    public double salary(){
        return hourlyRate*weeklyHours*52;
    }
    public double StateTaxRate(){
        return salary()*stateTaxRate;
    }

    public double federalTaxRate(){
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax() {
        return salary()-federalTaxRate-stateTaxRate;
    }
}
/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours
	            Add a constructor to set all the fields
		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */