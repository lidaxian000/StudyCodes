package com.experiment.servlet;

public class DepartmentInfo {
    private String id;
    private String department;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "{" +
                "id: '" + id + '\'' +
                ", department: '" + department + '\'' +
                '}';
    }
}
