package shiyansi;

public class Graduate extends Student implements Salary{
	public int salary;  
    
    public Graduate(String name) {  
        super(name);      //只要发生继承，子类构造方法就会调用父类构造方法  
    }  
  
    //重写实现的父接口的方法  
    @Override  
    public int getSalary() {  
        return 2000;  
    }  
  
    //重写继承的父类方法  
    @Override  
    public void setFee(int fee) {  
          
    }  
  
    //重写继承的父类方法  
    @Override  
    public int getFee() {  
        return 0;  
    }  
      
    public boolean isLoan(){  
        if(getFee()<getSalary())    //收入大于学费，不需要贷款  
            return false;     
        else                        //需要贷款  
            return true;            
    }  
 
}