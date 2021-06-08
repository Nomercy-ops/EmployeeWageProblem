/**
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @Created_on: 08.06.21
 *
 * purpose: is to calculate employee daily and monthly wages for the Multiple
 * companies.
 *
 */

package com.bridgelabz.Employeewage;

import java.util.ArrayList;

/**
 * EmployeeWageComputation class starts here
 */
public class EmployeeWageComputation implements IEmployeeWageComputation {

    // class constants
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;

    // variables
    ArrayList<CompanyEmployeeWage> companies;
    
/**
 * constructor for adding companies from main method to companies arraylist
 * putting  companies into arraylist.
 */

    public EmployeeWageComputation() {
        companies = new ArrayList<>();

    }

    /**
     * Method for adding new company and values into arraylist. It is getting value
     * from the main method.
     *
     * @param companyName
     * @param wageRatePerHour
     * @param numberOfWorkingDays
     * @param maxHoursPerMonth
     */
    @Override
    public void addCompany(String companyName, int wageRatePerHour, int numberOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmployeeWage company = new CompanyEmployeeWage(companyName, wageRatePerHour, numberOfWorkingDays, maxHoursPerMonth);
        companies.add(company);
    }

    /**
     * Method for generating random number.
     *
     * @return either 0 or 1 or 2.
     */
    public int generateEmployeeType() {
        return (int) (Math.random() * 100) % 3;
    }

    /**
     * Method for generating Employee type either full time employee or
     * parttime.
     *
     * @param employeeType
     * @return either 8 or 4 or 0 .
     */
    public int getWorkingHours(int employeeType) {
        switch (employeeType) {
            case FULL_TIME:
                return 8;
            case PART_TIME:
                return 4;
            default:
                return 0;
        }
    }

    /**
     * Method setting total Employee Wage of a company. Here calculation for
     * each companies will be done by passing its value to calculateTotalWage.
     */
    @Override
    public void calculateCompanyWage() {
        for (CompanyEmployeeWage company : companies) {
            int totalEmployeeWage = calculateTotalWage(company);
            company.setTotalEmployeeWage(totalEmployeeWage);
            System.out.println(company);
        }
    }

    /**
     * calculate TotalWage method gets value from main method and calculate the
     * employee wage.
     *
     * @param companyEmployeeWage
     * @return total wage
     *
     */
    public int calculateTotalWage(CompanyEmployeeWage companyEmployeeWage) {
        // computation done here

        System.out.println("Computation of total wage of " + companyEmployeeWage.companyName + " employee");
        int workingHours;
        int totalWage = 0;

        for (int day = 1, totalWorkingHours = 0; day <= companyEmployeeWage.numberOfWorkingDays
                && totalWorkingHours <= companyEmployeeWage.maxHoursPerMonth; day++, totalWorkingHours += workingHours) {
            int employeeType = generateEmployeeType();
            workingHours = getWorkingHours(employeeType);
            int wage = workingHours * companyEmployeeWage.wageRatePerHour;
            totalWage += wage;
            System.out.println("Day#: " + day + " Working Hours: " + workingHours);
        }
        return totalWage;

    }

    /**
     *
     * This is the main method Displaying Welcome to Employee Wage Computation
     * passing company name wage rate per hour into calculate total wage method
     * for employee wage google and microsoft are the object that is created for
     * EmployeeWageComputation.
     *
     */
    public static void main(String args[]) {
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
        employeeWageComputation.addCompany("Microsoft", 4, 30, 100);
        employeeWageComputation.addCompany("Google", 5, 40, 170);
        employeeWageComputation.addCompany("Apple", 9, 10, 70);
        employeeWageComputation.addCompany("Amazon", 19, 10, 150);
        employeeWageComputation.calculateCompanyWage();
    }

}
