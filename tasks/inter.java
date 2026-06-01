interface upi{
    void pay(); 
}
interface ybl{
    void withdraw();
}
class intern implements upi,ybl{
    public void pay(){
        System.out.println("amount is paid:");
    }
    public void withdraw(){
        System.out.println("amount is withdrawed:");
    }
}
public class inter{
    public static void main(String args[]){
            intern t=new intern();
            t.pay();
            t.withdraw();
        }
    
}
