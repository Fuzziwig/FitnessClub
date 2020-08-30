package input;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int rowpadding = 18;
    static String HeaderSpacer = String.join("", Collections.nCopies(rowpadding*5, "*"));
    static String SectionSpacer = "\n";

    public static void main(String[] args) {

        //person list
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Administration("Claus", "221175-1011"));
        personList.add(new Instructor("Tove", "011080-1014",20));
        personList.add(new Administration("Anna", "011080-1014"));
        personList.add(new Instructor("Henning", "011080-1013", 15));
        personList.add(new Member("Morten", "221175-1011", false));
        personList.add(new Member("Martin", "011080-1014",true));
        personList.add(new Member("Martina", "011080-1014", false));
        personList.add(new Member("Marcel", "011080-1013", true));

        //employeee list
        System.out.println("FITNESS EMPLOYEES");
        Employee eheader = new Employee();
        System.out.println(eheader.toString(rowpadding));
        System.out.println(HeaderSpacer);
        for (Person p : personList){
            if (p instanceof Administration || p instanceof Instructor){
                System.out.println(p.toString(rowpadding));
            }
        }
        System.out.println(HeaderSpacer);
        System.out.println(SectionSpacer);

        //member list
        System.out.println("FITNESS MEMBERS");
        Member mheader = new Member();
        System.out.println(mheader.toString(rowpadding));
        System.out.println(HeaderSpacer);
        for (Person p : personList){
            if (p instanceof Member){
                System.out.println(p.toString(rowpadding));
            }
        }
        System.out.println(HeaderSpacer);
        System.out.println(SectionSpacer);

        //employee and member list
        System.out.println("EMPLOYEES & MEMBERS Name and cpr");
        Person pheader = new Person();
        System.out.println(pheader.toString(rowpadding, true));
        System.out.println(HeaderSpacer);
        for (Person p : personList){
                System.out.println(p.toString(rowpadding, true));
        }
        System.out.println(HeaderSpacer);
        System.out.println(SectionSpacer);
    }

}
