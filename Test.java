package shiyansi;

public class Test {
	
	public static void main(String[] args) {  
        
        Graduate g=new Graduate("小明");       
        g.setFee(1000);                       
          
        University u=new University();         
        u.payOff(g);                         
        System.out.println("是否需要贷款"+g.isLoan());  
          
        Teacher t=new Teacher("王");  
        u.payOff(t);             
    }  
 
}
