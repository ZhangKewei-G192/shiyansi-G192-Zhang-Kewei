package shiyansi;

public class Graduate extends Student implements Salary{
	public int salary;  
    
    public Graduate(String name) {  
        super(name);      //ֻҪ�����̳У����๹�췽���ͻ���ø��๹�췽��  
    }  
  
    //��дʵ�ֵĸ��ӿڵķ���  
    @Override  
    public int getSalary() {  
        return 2000;  
    }  
  
    //��д�̳еĸ��෽��  
    @Override  
    public void setFee(int fee) {  
          
    }  
  
    //��д�̳еĸ��෽��  
    @Override  
    public int getFee() {  
        return 0;  
    }  
      
    public boolean isLoan(){  
        if(getFee()<getSalary())    //�������ѧ�ѣ�����Ҫ����  
            return false;     
        else                        //��Ҫ����  
            return true;            
    }  
 
}