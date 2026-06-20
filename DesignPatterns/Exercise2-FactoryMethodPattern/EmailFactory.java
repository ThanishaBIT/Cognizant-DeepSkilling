package factory;

public class EmailFactory implements Notification{



@Override
public void send() {

System.out.println(
        "Sending  Email Notification");

} 

}
