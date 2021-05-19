package WritingATests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {
    EmployeeDetails employee = new EmployeeDetails();
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();


    @Test
    public void testCalculateAppriasal() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(500, appraisal, 0.0);
    }

    // test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(96000, salary, 0.0);
    }
}
