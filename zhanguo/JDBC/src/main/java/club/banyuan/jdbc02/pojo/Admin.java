package club.banyuan.jdbc02.pojo;

public class Admin {

  private Integer  aid;
  private String   username;
  private String   password;
  private Double   money;

  public Double getMoney() {
    return money;
  }

  public void setMoney(Double money) {
    this.money = money;
  }

  public Admin(String username, String password, Double money) {
    this.username = username;
    this.password = password;
    this.money = money;
  }

  public Admin(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public Admin(Integer aid, String username, String password) {
    this.aid = aid;
    this.username = username;
    this.password = password;
  }

  public Admin() {
  }

  public Integer getAid() {
    return aid;
  }

  public void setAid(Integer aid) {
    this.aid = aid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "Admin{" +
        "aid=" + aid +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
