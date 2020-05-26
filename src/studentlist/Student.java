package studentlist;

/**
 * This class is to represent a Student in our app
 *
 * @author Marjorie Teu - May 26, 2020
 */
public class Student {

    private String name;
    private String address;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", address=" + address + '}';
    }

}
