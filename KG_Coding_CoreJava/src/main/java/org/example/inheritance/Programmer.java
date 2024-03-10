package org.example.inheritance;

public class Programmer extends Person{ //Programmer is a Person hence extends
    private String companyName;  //Programmer has a CompanyName

    public Programmer(String aadhar,String name,String gender,String companyName){
        super(aadhar,name,gender);
        this.companyName=companyName;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String learn(String subect) {
        return "I am learning "+subect;
    }

    @Override
    public String sleep() {
        return "Now i am sleeping...";
    }

    @Override
    public void walk() {
        System.out.println("I am walking in Microsoft ");
    }
    public void coding(){
        System.out.println("I am Writting Java Codes....");
    }
}
