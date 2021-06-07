/**
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @Created_on: 06.06.21
 *
 * purpose: is to calculate employee Working hours and monthly wages.
 *
 */
 
package com.bridgelabz.Employeewage;

class EmployeeWageComputation {

    private static final int PART_TIME = 1;
    private static final int FULL_TIME = 2;
    private static final int WAGE_RATE_PER_HOUR = 20;
    private static final int NUMBER_OF_WORKING_DAYS = 20;
    private static final int TOTAL_WORKING_HOURS = 100;

    /**
     *  calculating Total wage  and  daily working hours for full time and part time employee
     * while loop is used to calculate employee wage if a certain condition is met
     */
    public static int calculateTotalWage() {

        //variables
        int workingHours = 0, totalWorkingHours = 0, totalWorkingDays = 0;

        //computation done here
        while (totalWorkingHours <= TOTAL_WORKING_HOURS && totalWorkingDays < NUMBER_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int employeeType = (int) (Math.random() * 100) % 3;
            switch (employeeType) {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:
                    workingHours = 0;
                    break;
            }
            totalWorkingHours += workingHours;
            System.out.println("Day#: " + totalWorkingDays + " Working Hours: " + workingHours);
        }
        
        // printing  total employee wage after while ends. 
        int totalEmployeeWage = totalWorkingHours * WAGE_RATE_PER_HOUR;
        System.out.println("Total Employee Wage is : " + totalEmployeeWage);
        return totalEmployeeWage;

    }

    /**
     *
     * This is the main method Displaying Welcome to Employee Wage Computation
     * Program calling employee Monthly Wage method for calculating wages
     *
     */
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Computation Program");
        calculateTotalWage();// calling this method to start calculation of employee wage
    }
}
