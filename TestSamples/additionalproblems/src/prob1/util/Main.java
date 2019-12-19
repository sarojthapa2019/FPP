package prob1.util;

import prob1.Employee;
import prob1.EmployeeInfo;
import prob1.TestData;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> result = EmployeeInfo.removeDuplicates(TestData.originalList);
        boolean check = Util.listsAreEqual(result, TestData.dupsRemoved);
        System.out.println("Result is :" + check);
    }
}