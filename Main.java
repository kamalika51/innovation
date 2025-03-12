public class Company
{
    static String companyName="info";
    String employeeName;
    Company(String myemployeeName){
    
    this.employeeName=myemployeeName;
    }
    void display(){
    System.out.println("company:"+companyName);
    System.out.println("employee:"
    +employeeName);
    }

public static void main(String[] args){
    Company com1= new Company("kamal");
    Company com2= new Company("liya");
    com1.display();
    com2.display();
        companyName="techk";
            com1.display();
                com2.display();


}
}
