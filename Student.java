package shiyansi;
public abstract class Student {
  public String name;  
  public int fee;   
  public Student(String name) {     //���๹�췽����ϵͳĬ��Ϊ�޲Σ����д���вε���û���޲εģ�����д���  
         super();  
         this.name = name;  
     }  
       
  public abstract void setFee(int fee);  
  public abstract int getFee();  
 
}
