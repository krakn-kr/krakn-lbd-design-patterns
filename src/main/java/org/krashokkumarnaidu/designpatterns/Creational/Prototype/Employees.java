package org.krashokkumarnaidu.designpatterns.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

// Prototype class
public class Employees implements Cloneable {
    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        // Simulate loading from database
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>(this.getEmpList());
        return new Employees(temp);
    }
}

// Usage
class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emp = new Employees();
        emp.loadData();

        // Clone the Employees object
        Employees empClone = (Employees) emp.clone();
        empClone.getEmpList().add("John");

        System.out.println(emp.getEmpList());      // [Pankaj, Raj, David, Lisa]
        System.out.println(empClone.getEmpList()); // [Pankaj, Raj, David, Lisa, John]
    }
}
