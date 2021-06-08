package com.bridgelabz.Employeewage;

/**
 * This Interface class implements all the methods of Employee Wage Computation
 * class It also overide the the interface method.
 *
 */
public interface IEmployeeWageComputation {

    public void addCompany(String companyName, int wageRatePerHour, int numberOfWorkingDays, int maxHoursPerMonth);

    public void calculateCompanyWage();

    public int getWageByCompanyName(String companyName);

}
