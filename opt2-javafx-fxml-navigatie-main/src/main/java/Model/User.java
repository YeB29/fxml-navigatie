package Model;

public class User {
    private String name;
    private String gender;
    private String password;
    private String userName;
    private String emailadress;
    private String dateofBirth;

    public User(String name, String gender,  String password,String userName, String emailadress, String dateofBirth){
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.userName = userName;
        this.emailadress = emailadress;
        this.dateofBirth = dateofBirth;
    }
    public String getName() { return name; }
    public String getEmailadress() { return emailadress; }
    public String getPassword() { return password; }
    public String getDateofBirth() { return dateofBirth; }
    public String getGender() { return gender; }
    public String getUserName() { return userName; }
    public void setPassword(String password) { this.password = password; }
    public void setEmailadress(String emailadress) { this.emailadress = emailadress; }
    public void setGender(String gender) { this.gender = gender; }
    public void setName(String name) { this.name = name; }
    public void setDateofBirth(String dateofBirth) { this.dateofBirth = dateofBirth; }
    public void setUserName(String userName) { this.userName = userName; }
}
