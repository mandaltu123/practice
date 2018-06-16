package basics.encapsulation;


/**
 * Encapsulation is the technique used to implement abstraction in object oriented programming. Encapsulation is used
 * for access restriction to a class members and methods.
 *
 * Access modifier keywords are used for encapsulation in object oriented programming. For example, encapsulation in
 * java is achieved using private, protected and public keywords.
 */
public class Encapsulation {

    private String name;
    private int id;
    private String email;

    public Encapsulation(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
