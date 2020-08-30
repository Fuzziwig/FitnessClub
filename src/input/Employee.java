package input;

public class Employee extends Person{

    int hours = 0;
    int salary = 0;

    public Employee() {
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(int rowpadding) {
        return  String.format("%0$-"+rowpadding+"s", "Name")+
                String.format("%0$-"+rowpadding+"s", "Cpr")+
                String.format("%0$-"+rowpadding+"s", "Hours")+
                String.format("%0$-"+rowpadding+"s", "Salary")+
                String.format("%0$-"+rowpadding+"s", "Vacation")
                ;
    }

}
