package shiyansi;

public class Test {
	
	public static void main(String[] args) {  
        
        Graduate g=new Graduate("С��");       
        g.setFee(1000);                       
          
        University u=new University();         
        u.payOff(g);                         
        System.out.println("�Ƿ���Ҫ����"+g.isLoan());  
          
        Teacher t=new Teacher("��");  
        u.payOff(t);             
    }  
 
}
