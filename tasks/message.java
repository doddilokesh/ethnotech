interface MailMessage {
  public void email(String str);
}
interface InstaMessage {
  public void insta(String str1);
}
interface FBMessage {
  public void fb(String str2);
}
interface JobMessage {
  public void job(String str3);
}
class Notification implements MailMessage,InstaMessage,FBMessage,JobMessage {
  public void email(String str) {
    System.out.println("Email: "+str);
  }
  public void insta(String str1) {
    System.out.println("Insta: "+str1);
  }
  public void fb(String str2) {
    System.out.println("FB: "+str2);
  }
  public void job(String str3) {
    System.out.println("job"+str3);
}

}
public class message{
  public static void main(String[] args) {
    Notification m = new Notification();
    m.email("You have a new email!");
    m.insta("You have a new Instagram message!");
    m.fb("You have a new Facebook notification!");
    m.job("You have a new job alert!");
  }
}
