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
	
	//  variables
	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	private static final int WAGE_RATE_PER_HOUR = 20;
	
/**
 *  uc2- calculating daily wage for full time and part time employee
 */	

	private void employeeDailyWage( int workRatePerHour ) {
		 int employeeDailyWage = wageRatePerHour * workRatePerHour;
		 System.out.println("Employee Daily wage is : " +employeeDailyWage +"$");
	}

   
 /**
 *  This is the main method
 *  Displaying Welcome to Employee Wage Computation Program
 */
 
	public static void main(String[] args) {

       System.out.println("Welcome to Employee Wage Computation Program");
	   
/**
 *  uc1- checking  if full time employee is present or absent
 *  passing work rate per hour value to employee wage calculation by creating object.
 *  uc3- added part time employee for calculating daily wage
 *  UC4- calculating daily wage using switch case	
 */		
			Employee employee = new Employee();
		    int attendanceCheck = (int)(Math.random()*3);
	        switch (attendanceCheck){
			case IS_FULL_TIME:
			employee.employeeDailyWage(8);
			break;

			case IS_PART_TIME:
			employee.employeeDailyWage(4);
			break;

			default:
			employee.employeeDailyWage(0);
		     }
    }
}
