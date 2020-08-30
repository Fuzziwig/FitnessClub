package input;

public class Member extends Person{

    boolean isBasic;

    public Member() {
    }

    public Member(String name, String cpr, boolean basic) {
        isBasic = basic;
        this.name = name;
        this.cpr = cpr;
    }

    public String getMemberType() {
        if (isBasic) {
            return "Basic";
        }
        else return "Full";
    }

    public int monthlyFee(){
        if (isBasic) {
            return 199;
        }
        else return 299;
    }

    public String toString(int rowpadding) {
        if (cpr==null){
            return String.format("%0$-"+rowpadding+"s","Name")+
                    String.format("%0$-"+rowpadding+"s","Cpr")+
                    String.format("%0$-"+rowpadding+"s","Member type")+
                    String.format("%0$-"+rowpadding+"s","Fee")
                    ;
        }
        return  String.format("%0$-"+rowpadding+"s", this.name)+
                String.format("%0$-"+rowpadding+"s", this.cpr)+
                String.format("%0$-"+rowpadding+"s", getMemberType())+
                String.format("%0$-"+rowpadding+"s", monthlyFee())
                ;
    }

}
