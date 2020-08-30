package input;

public class Person {

    String name;
    String cpr;


    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }

    public String toString(int rowpadding) {
        return "";
    }

    public String toString(int rowpadding, boolean Super) {
        if (name==null) {
            return String.format("%0$-" + rowpadding + "s", "Name") +
                    String.format("%0$-" + rowpadding + "s", "Cpr")
                    ;
        }
        else
            return String.format("%0$-" + rowpadding + "s", this.name) +
                    String.format("%0$-" + rowpadding + "s", this.cpr)
                    ;

    }


}
