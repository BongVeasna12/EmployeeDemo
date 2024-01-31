package practice;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Employee {
    private  static final int MALETAXRATE = 50;
    private static final int FEMALETAXRATE = 30;
    private int id;
    private String name;
    private  String gender;
    private  String possition;
    private float hours;
    private  float rate;
    Employee(){
    }
//    public Employee(int id, String name, String gender, String possition, double hours, float rate) {
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//        this.possition = possition;
//        this.hours = hours;
//        this.rate = rate;
//    }
    private float findSalary(){
       return  rate * hours;
    }
     private float findTaxDeductions(){
        float rate = 0;
        if (gender.equalsIgnoreCase("female")){
            rate = FEMALETAXRATE;
        }else{
            rate = MALETAXRATE;
        }
        float deduction = findSalary() * (rate /100);
         System.out.println("Tax: "+ rate +"%");
         System.out.println("Salary: "+ deduction + "$");
         return deduction;
     }
     public void  validationID(){
         while (true){
             Scanner input = new Scanner(System.in);
             try{
                 System.out.println("Enter employee id:");
                 int id = input.nextInt();
                 if (id >=1 && id <=99999){
                     System.out.println("");
                     break;
                 }else {
                     System.out.println("Invalid");
                 }
             }catch (InputMismatchException e){
                 System.out.println("This is not a valid employee");

                 input.nextInt();
             }

         }
     }

    public void EmployeeInput(Scanner input){
        //validation input for employee
        validationID();
        System.out.println("Enter name:"+ name);
        name = input.nextLine();
//      genderValidation();
        System.out.println("Emnter gender:"+ gender);
        gender = input.nextLine();
        System.out.println("Enter possition:"+ possition);
        possition = input.nextLine();
        System.out.println("Enter hours:"+ hours);
        hours = input.nextFloat();
        System.out.println("Enter rate:"+ rate);
        rate = input.nextFloat();
    }
    public void  EmployeeInfor(){
        System.out.println("ID:" + id);
        System.out.println("NAME:" + name);
        System.out.println("GENDFER:"+ gender);
        System.out.println("POSSITION:" + possition);
        float deduction = 0;
        if (deduction <=1000){
            deduction = findTaxDeductions();
        }
        System.out.println("FindSalary "+ (findSalary() - deduction)+"$");
    }

}

