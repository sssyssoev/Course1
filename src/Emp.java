public class Emp {
    public  String surname;
    public  String name;
    public  String midname;
     int dept;
     int salary;
     int id;

    public Emp(String surname, String name, String midname, int dept, int salary, int size) {
        this.surname = surname;
        this.name = name;
        this.midname = midname;
        this.dept = dept;
        this.salary = salary;
        this.id = size;
    }

    public  String getSurname() {
        return surname;
    }

    public  String getName() {
        return name;
    }

    public  String getMidname() {
        return midname;
    }


    public  int getSalary() {
        return salary;

    }

    public  int getDept() {
        return dept;

    }

    public  int getSize() {
        return id;

    }

    public void setSalary(int salary) {
        this.salary = salary;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setSurname(String surname) {
        this.surname = surname;

    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public void setDept(int dept) {
        this.dept = dept;

    }

    public void setSize(int id) {
        this.id = id;

    }


    public String toString() {
        return surname + "   " + name + "   " + midname + " Отдел №:  " + dept + "  Зарплата :  " + salary + "   руб   " + "Номер записи: " + id;
    }
}





