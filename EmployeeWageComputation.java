/**
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @Created_on: 08.06.21
 *
 * purpose: is to calculate employee daily and monthly wages for the Multiple companies.
 *
 */
 
 
package com.bridgelabz.Employeewage;

public class EmployeeWageComputation
{
    // class constants
    private static final int PART_TIME = 1;
    private static final int FULL_TIME = 2;
   
  
    private final String companyName;
    private final int wageRatePerHour;
    private  final int numberOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmployeeWage;
	
	/**
     * 
     *  EmployeeWageComputation is the constructor created with arguments  for initialization of values.
     * @param companyName
     * @param wageRatePerHour
     * @param numberOfWorkingDays
     * @param maxHoursPerMonth
     *
     */

    EmployeeWageComputation(String companyName, int wageRatePerHour, int numberOfWorkingDays, int maxHoursPerMonth)
    {
        this.companyName = companyName;
        this.wageRatePerHour= wageRatePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;    
    }
	
/**
  * Method  for generating random number either 0 or 1 or 2.
  */

   private int generateEmployeeType()
    {
        return (int) (Math.random() * 100) % 3;
    }
	
	
 /**
   *  Method  for generating Employee type either full time employee or parttime.
   *  @param employeeType 
   *  @return either 8 or 4 or 0 .
   */

    private int getWorkingHours(int employeeType)
    {
        switch (employeeType)
        {
            case FULL_TIME:
                return 8;
            case PART_TIME:
                return 4;
            default:
                return 0;
        }
    }


 /**
     * calculateTotalWage method gets value from main method and calculate the
     * employee wage
     *
     * @param company
     * @param wageRatePerHour
     * @param maxWorkingDays
     * @param maxWorkingHours
     *
     */


    private void calculateTotalWage()
    {
		// computation done here
		
        System.out.println("Computation of total wage of " + companyName + " employee");
        int workingHours;
        for (int day = 1, totalWorkingHours = 0; day <= numberOfWorkingDays
                && totalWorkingHours <= maxHoursPerMonth; day++, totalWorkingHours += workingHours)
        {
            int employeeType = generateEmployeeType();
            workingHours = getWorkingHours(employeeType);
            int wage = workingHours * wageRatePerHour;
            totalEmployeeWage += wage;
			System.out.println("Day#: " + day +  " Working Hours: " + workingHours);
        }

    }
	
	
	
	/** 
	 *     This method returns the string itself 
	 */
	
    public String toString()
    {
        return "Total wage of a month for " + companyName + " Employee is : " +totalEmployeeWage;
    }

 
 /**
     *
     * This is the main method Displaying Welcome to Employee Wage Computation
     * passing company name wage rate per hour into calculate total wage method
     * for employee wage
	 * google and microsoft are the object that is created for EmployeeWageComputation.
     *
     */


    public static void main(String args[])
    {
		
        EmployeeWageComputation google = new EmployeeWageComputation("Google", 16, 20, 100);
        EmployeeWageComputation microsoft = new EmployeeWageComputation("Microsoft", 12, 20, 150);

        google.calculateTotalWage();
        System.out.println(google);

        microsoft.calculateTotalWage();
        System.out.println(microsoft);
    }
}