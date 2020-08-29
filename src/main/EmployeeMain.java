/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Aug-20
 *  Time: 4:18 PM
 */
package main;

import databean.Employee;

import java.util.Arrays;
import java.util.Scanner;

//step 5
public class EmployeeMain {
    //step 6
    public static void main(String[] args) {
        //step 7
        Employee[] arr = new Employee[3];
        System.out.println(Arrays.toString(arr));
        //step 8
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {
            Employee employee = new Employee();

            System.out.println("enter firstName");
            employee.setFirstName(sc.nextLine());
            System.out.println("enter lastName");
            employee.setLastName(sc.nextLine());
            System.out.println("enter salary");
            employee.setSalary(sc.nextDouble());
            System.out.println("enter empid");
            employee.setEmpId(sc.nextInt());
            System.out.println("enter experience");
            employee.setExperience(sc.nextDouble());
            System.out.println("enter mbile number");
            employee.setMobile(sc.nextLong());
            System.out.println("enter email");
            // handling \n, by skipping input stream for \n
            sc.nextLine();
            employee.setEmail(sc.nextLine());
            arr[i] = employee;
        }
        System.out.println(Arrays.toString(arr));
        //calling function to sort array
        Employee[] sorted = sortSalaryOrder(arr);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(sorted));
    }
    //step 9
    //sorting employee array by salary
    public static Employee[] sortSalaryOrder(Employee[] arr){
        Employee[]  response = arr.clone();
        for (int i = 0; i < response.length ; i++) {
            for (int j = 0; j < response.length - 1 ; j++) {
                // compare first element with second element
                // if first element is smaller then second element
                //swap them
                if(response[j].getSalary() < response[j+1].getSalary()){
                    //swap
                    Employee temp = response[j];
                    response[j] = response[j+1];
                    response[j+1] = temp;
                }

            }
        }
        return response;
    }
}
