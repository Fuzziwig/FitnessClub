package input;

public class Instructor extends Employee{

    public Instructor() {
    }

    public Instructor(String name, String cpr, int hours) {
        this.name = name;
        this.cpr = cpr;
        this.hours = hours;
    }

    public int getSalary () {
        return this.hours * 456;
    }

    public String toString(int rowpadding) {
        return  String.format("%0$-"+rowpadding+"s", name)+
                String.format("%0$-"+rowpadding+"s", cpr)+
                String.format("%0$-"+rowpadding+"s", this.getHours())+
                String.format("%0$-"+rowpadding+"s", this.getSalary())+
                String.format("%0$-"+rowpadding+"s", "")
                ;
    }

}
