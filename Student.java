package shiyansi;
public abstract class Student {
  public String name;  
  public int fee;   
  public Student(String name) {     //父类构造方法，系统默认为无参，如果写了有参的则没有无参的，可以写多个  
         super();  
         this.name = name;  
     }  
       
  public abstract void setFee(int fee);  
  public abstract int getFee();  
 
}
