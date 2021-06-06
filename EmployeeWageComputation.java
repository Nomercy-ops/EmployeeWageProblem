/**
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @Created_on: 06.06.21
 *
 * purpose: is to calculate employee daily and monthly wages.
 *
 */
package com.bridgelabz.Employeewage;

class EmployeeWageComputation {

    // Constant variables
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static final int WAGE_RATE_PER_HOUR = 20;
    private static final int WORKING_DAY_PER_MONTH = 20;
    private static final int MAX_HOUR_IN_MONTH = 100;

    //variables
    private static int employeeMonthlyWage = 0;
    private static int totalEmployeeHours = 0;
    

/**
 *  uc2- calculating daily wage for full time and part time employee
 *  @param workRatePerHour is getting value from attendance check method
 *  @param totalEmployeeHours will store the total hour work by employee.
 */
    
    
    private static void employeeDailyWage(int workRatePerHour) {
        int employeeDailyWage = WAGE_RATE_PER_HOUR * workRatePerHour;
        employeeMonthlyWage += employeeDailyWage;
        totalEmployeeHours += workRatePerHour;
        System.out.println("Employee Daily wage is : " + employeeDailyWage + "$");

    }
    
    
/**
 *  uc1- checking if user is part time or full time
 *  if a user is part time then work rate hour is 4 and pass it to a method employee daily wage
 *  full time employee work rate hour is 8;
 */

    private static void attendenceCheck() {
        int attendanceCheck = (int) (Math.random() * 3);
        switch (attendanceCheck) {
            case IS_FULL_TIME:
                employeeDailyWage(8);
                break;

            case IS_PART_TIME:
                employeeDailyWage(4);
                break;

            default:
                employeeDailyWage(0);
        }
    }

/**
 *  uc2- calculating daily wage for full time and part time employee
 *  uc5 - calculating daily wage for full time and part time employee
 *  uc6- while loop is used to calculate employee wage if a certain condition is met
 */	
    private static void employeeMonthlyWage() {
        int totalWorkingDays = 0;
        while (totalEmployeeHours <= MAX_HOUR_IN_MONTH && totalWorkingDays < WORKING_DAY_PER_MONTH) {
            attendenceCheck();
            totalWorkingDays++;
        }
        System.out.println("Employee Total Working Hours is :" + totalEmployeeHours + " hrs");
        System.out.println("Employee Monthly wage is :" + employeeMonthlyWage + "$");
        System.out.println("Employee Total Working Days is : " + totalWorkingDays + " days");

    }
    
/**
 * 
 *  This is the main method
 *  Displaying Welcome to Employee Wage Computation Program
 *  calling employee Monthly Wage method for calculating wages 
 **/

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        employeeMonthlyWage();

    }
}

