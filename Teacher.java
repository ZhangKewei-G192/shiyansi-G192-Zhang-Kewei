package shiyansi;

public class Teacher implements Salary{
	public String name;  
    public int salary;  
      
    public Teacher(String name) {  
        super();  
        this.name = name;  
    }  
      
    @Override  
    public int getSalary() {  
        return 4000;  
    } 
 
}
