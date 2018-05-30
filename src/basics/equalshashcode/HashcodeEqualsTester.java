package basics.equalshashcode;

public class HashcodeEqualsTester {

    public static void main(String[] args) {
        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");

        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
        /**
         *
         *
         * *****************************
         * Although the two instances have exactly the same attribute values, they are stored in different memory
         * locations. Hence, they are not considered equal as per the default implementation of equals().
         * The same applies for hashcode() — a random unique code is generated for each instance.
         *
         * If our Student class looks like this :
         *
         *
         public class Student {
         private int id;
         private String name;
         public Student(int id, String name) {
         this.name = name;
         this.id = id;
         }
         public int getId() {
         return id;
         }
         public void setId(int id) {
         this.id = id;
         }
         public String getName() {
         return name;
         }
         public void setName(String name) {
         this.name = name;
         }
         }

         ***************************
         *          OUTPUT
         ***************************
         alex1 hashcode = 325040804
         alex2 hashcode = 1173230247
         Checking equality between alex1 and alex2 = false
         *
         */

    }
}
