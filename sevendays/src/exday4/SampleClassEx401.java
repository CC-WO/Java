package exday4;

public class SampleClassEx401 {
  public static void main(String[] args) {
    CellPhone cp = new CellPhone("hoge@gmail.com", "090-1234-5678");
    cp.call("011-123-4567");
    cp.sendMail("fuge@gmail.com");

    IPhone phone = (IPhone)cp;
    phone.call("011-987-6543");

    IEmail mail = (IEmail)cp;
    mail.sendMail("bar@gmmai.com");
  }
}
