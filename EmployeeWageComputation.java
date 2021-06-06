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

   
 /**
 *  This is the main method
 *  Displaying Welcome to Employee Wage Computation Program
 */
 
	public static void main(String[] args) {

       System.out.println("Welcome to Employee Wage Computation Program");
	   
/**
 *  uc1- checking whether a employee is present or absent 
 */	
		int attendanceCheck = (int)(Math.random()*2);
	     if (attendanceCheck == 0){
		System.out.println("Employee is Absent");
		 }
		else{
		System.out.println("Employee is Present");
		}

    }
}
