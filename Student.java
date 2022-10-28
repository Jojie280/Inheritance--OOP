
package collegelist;


public class Student extends Person{
    	//Creating a private variables of the program and year level.
	String program;
	int yearLevel;
	
    public static void main(String [] args) {
    }
    //Setter method para ma set ang value sa program.
    public void setProgram(String p){
    	this.program = p;
    }
    
    //Getter method para mag retrun ang value ng program.
    public String getProgram(){
    	return program;
    }
     //Setter method ulit para ma set ang value sa year level.
     public void setYearLevel(int y){
     	this.yearLevel = y;
     }
     
     //Getter method ulit para mag retrun ang value ng year level.
     public int getYearLevel(){
     	return yearLevel;
     }
}
