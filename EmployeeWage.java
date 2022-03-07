package com.bridgelabz;

public class EmployeeWage {

    public static final int WAGE_PER_HR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int dailyEmpWage = 0;
        int empHrs = 0;

        int empCheck = (int) (Math.floor (Math.random () * 10) % 3);

        if(empCheck == IS_FULL_TIME) {
            empHrs = 8;
        }
        else if(empCheck == IS_PART_TIME) {
            empHrs = 4;
        }
        else{
            empHrs = 0;
        }

        dailyEmpWage = empHrs * WAGE_PER_HR;
        System.out.println("Employee Daily Wage= " +dailyEmpWage);

    }
}
