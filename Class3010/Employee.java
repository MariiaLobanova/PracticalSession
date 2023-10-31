package org.example.Class3010;

import java.util.Objects;

//Create an Employee class with attributes like name, ID, department,
//job title, and manager ID. Apply encapsulation and use getter and
//setter methods.
public class Employee {
        private String name;
        private int id;
        private String department;
        private String jobTitle;
        private int managerId;

        public Employee(String name, int id, String department, String jobTitle, int managerId) {
            this.name = name;
            this.id = id;
            this.department = department;
            this.jobTitle = jobTitle;
            this.managerId = managerId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public int getManagerId() {
            return managerId;
        }

        public void setManagerId(int managerId) {
            this.managerId = managerId;
        }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", department='" + department + '\'' +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", managerId=" + managerId +
                    '}';
        }
}

