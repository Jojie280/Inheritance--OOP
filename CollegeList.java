package collegelist;
import java.util.Scanner;

public class CollegeList {

    public static void main(String[] args) {
           
        Scanner scan = new Scanner(System.in);
    	Person per  = new Person();
        Employee emp = new Employee();
        Faculty fac = new Faculty();
    	Student stu = new Student();
        
    	
    	System.out.println("\nPress E for Employee , F for Faculty, or S for Student: ");
    	String pressed = scan.nextLine();
    	switch(pressed.toUpperCase()){
    		case "E":
    			System.out.print("Type Employee's Name, Contact Number, Salary, and Department.");
    			System.out.print("\nPress Enter after every input.\n" );
    			per.name = scan.nextLine();
                        per.contactNum = scan.nextLine();
    			emp.salary = Double.parseDouble(scan.nextLine());
    			emp.department = scan.nextLine();
                        System.out.println("---------------------------------------");
                        System.out.println("Name: " + per.name);
                        System.out.println("Contact Number: " + per.contactNum);
                        System.out.println("Salary: " + emp.salary);
                        System.out.println("Department: " + emp.department);
                        break;
                case "F":
                    System.out.print("Type Faculty Member's Name, Contact Number, Salary, Department, \nand Status.");
                    System.out.print("\nPress Enter after every input.\n");
                    per.name = scan.nextLine();
                    per.contactNum = scan.nextLine();
                    emp.salary = Double.parseDouble(scan.nextLine());
                    emp.department = scan.nextLine();
                    System.out.print("Is this faculty member a regular/tenured");
                    System.out.print("\nPress Y for YES, Press N for NO: ");
                    pressed = scan.nextLine();
                    String status = fac.status ? "Not a Regular/Tenured" : "Regular/Tenured\n";
                    System.out.println("---------------------------------------");
                    System.out.println("Name: " + per.name);
                    System.out.println("Contact Number: " + per.contactNum);
                    System.out.println("Salary: " + emp.salary);
                    System.out.println("Department: " + emp.department);
                    System.out.println("Status: " + status);
                    break;
                case "S":
                    System.out.print("Type Students's Name, Contact Number, Program, and Year Level.");
                    System.out.print("\nPress Enter after every input.\n");
                    per.name = scan.nextLine();
                    per.contactNum = scan.nextLine();
                    stu.program = scan.nextLine();
                    stu.yearLevel=scan.nextInt();
                    System.out.println("---------------------------------------");
                    System.out.println("Name: " + per.name);
                    System.out.println("Contact Number: " + per.contactNum);
                    System.out.println("Program: "+ stu.program);
                    System.out.println("Year Level: " +stu.yearLevel);
                    break;
                default:
                    System.out.println("!!!Sorry invalid Error!!");
                    break;
                        
                        
        
    }
    
    }
}