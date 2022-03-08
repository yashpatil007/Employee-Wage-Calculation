package com.infogalaxy;

import java.util.Random;

public class EmployeeWageCalculation {
    public static void main(String[] args) {
        //Welcome massage for user
        System.out.println("Welcome Employee Wage calculation");
        //UC-2 Calculation Daily Wage
        final int PART_TIME_WAGE = 4;
        final int FULL_DAY_HR = 8;
        final int WAGE_PER_HR = 20;
        int total_Wage = 0;
        //UC-1 Employee Attendance
        Random random = new Random();
        int empAttendance = random.nextInt()%2;
        System.out.println(empAttendance);
        if(empAttendance == 0){
            System.out.println("Employee is Absent");
        } else {
            System.out.println("Employee is Present");
            int empType = random.nextInt() %2;
            System.out.println(empType);
            switch(empType)
            {
                case 0:
                    System.out.println("Employee is on Part Time");
                    total_Wage = WAGE_PER_HR * PART_TIME_WAGE;
                    break;
                case 1:
                    System.out.println("Employee is On Full Time");
                    total_Wage = WAGE_PER_HR * FULL_DAY_HR;
                    break;
            }
        }
        System.out.println("Total Wage="+total_Wage);
    }
}
