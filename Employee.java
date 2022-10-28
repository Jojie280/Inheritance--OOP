
package collegelist;


public class Employee extends Person {
    double salary;
    	String department;
        	//Setter method para ma set ang value sa salary.
    	public void setSalary(double s){
    		this.salary = s;
    	}
    	
    	//Getter method para mag retrun ang value ng salary.
    	public double getSalary(){
    		return salary;
    	}
    	
    	//Setter method ulit para ma set ang value sa department.
    	public  void setDepartment(String d){
    		this.department = d;
    	}
    	
    	//Getter method ulit para mag retrun ang value ng salary.
    	public String getDepartment(){
    		return department;
        }
}
