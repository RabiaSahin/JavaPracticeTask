package day31_CustomClass_Cunstructor;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHour;

    public SalaryCalculator(double hourlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;// to make sure that user does not need to convert the percentage to decimal
        this.federalTaxRate = federalTaxRate/100;// to make sure that user does not need to convert the percentage to decimal
        this.weeklyHour = weeklyHour;
    }

    public double salary(){
        return weeklyHour * hourlyRate * 52;
    }
    public double stateTax(){
        return salary() * stateTaxRate;
    }
    public double federalTax(){
        return salary() * federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHour=" + weeklyHour +
                ", salary= £" + salary() +
                ", stateTax= £" + stateTax() +
                ", federalTax= £" + federalTax() +
                ", salary after tax= £" + salaryAfterTax() +
                '}';
    }
}
