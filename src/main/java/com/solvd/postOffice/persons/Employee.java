package com.solvd.postOffice.persons;

public class Employee extends Person implements Workable {
    private String position;

    public Employee() {}

    public Employee(String position){
        this.position = position;
    }

    public Employee(String name, String surname, String position){
        super(name, surname);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || obj.getClass() != this.getClass())
            return false;
        else if (((Employee) obj).position == this.position)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = 600;
        result += position.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" + "position=" + position + "}";
    }
}
