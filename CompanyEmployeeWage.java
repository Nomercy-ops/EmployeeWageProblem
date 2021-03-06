package com.bridgelabz.Employeewage;

// model for company..
 
class CompanyEmployeeWage {

    public final String companyName;
    public final int wageRatePerHour;
    public final int numberOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmployeeWage = 0; ;

    /**
     *
     * CompanyWageComputation is the constructor of CompanyEmployeeWage class
     * created with arguments for initialization of values.
     *
     * @param companyName
     * @param wageRatePerHour
     * @param numberOfWorkingDays
     * @param maxHoursPerMonth
     *
     */
    public CompanyEmployeeWage(String companyName, int wageRatePerHour, int numberOfWorkingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.wageRatePerHour = wageRatePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;     
    }
    
     /**
     * Method for setting employee total wage.
     */
    
    public void setTotalEmployeeWage(int totalEmployeeWage) {
        this.totalEmployeeWage = totalEmployeeWage;
    }
    
    /**
     * This method returns the string itself
     */
    
    @Override
    public String toString() {
        return "Total wage of a month for " + companyName + " Employee is : " + totalEmployeeWage;
    }

}