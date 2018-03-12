package design.structural.adapter;

public class EmployeeOldType {

    private String cn;
    private String givenName;
    private String surname;
    private String mail;

    public EmployeeOldType(String cn, String givenName, String surname, String mail) {
        this.cn = cn;
        this.givenName = givenName;
        this.surname = surname;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "EmployeeOldType{" +
                "cn='" + cn + '\'' +
                ", givenName='" + givenName + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
