package org.example.Class211;
// Create an Enum to define different report types (e.g., employee,
//department, hierarchy), encapsulating report types as objects.

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

enum ReportType{
    EMPLOYEE, DEPARTMENT, HIERARCHY
}
public class E1 {
    public  static Object generateReport(ReportType reportType){
        try{
            Class<?> reportClass = Class.forName(reportType.name()+ "Report");
            Method generateMethod = reportClass.getDeclaredMethod("generate");
            Object reportInstance = reportClass.getDeclaredConstructor().newInstance();
            return generateMethod.invoke(reportInstance);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
class EmployeeReport {
    public void generate() {
        System.out.println("Generating Employee Report...");
        // Add report generation logic for Employee Report here
    }
}

class DepartmentReport {
    public void generate() {
        System.out.println("Generating Department Report...");
        // Add report generation logic for Department Report here
    }
}

class HierarchyReport {
    public void generate() {
        System.out.println("Generating Hierarchy Report...");
        // Add report generation logic for Hierarchy Report here
    }
}

class Main {
    public static void main(String[] args) {
        ReportType selectedReportType = ReportType.EMPLOYEE; // Change the report type as needed

        Object report = E1.generateReport(selectedReportType);
        if (report != null) {
            System.out.println("Report generation completed.");
        } else {
            System.out.println("Report generation failed.");
        }
    }
}
