package club.banyuan.threadDemo.ticketThread;

public class TestTicket {

  public static void main(String[] args) {

    ThreadTicket  tt1=new ThreadTicket("窗口A");
    ThreadTicket  tt2=new ThreadTicket("窗口B");
    ThreadTicket  tt3=new ThreadTicket("窗口C");
    ThreadTicket  tt4=new ThreadTicket("窗口D");
    tt1.start();
    tt2.start();
    tt3.start();
    tt4.start();

  }

}
