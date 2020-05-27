package studentlist;

/**
 * This Class +++Insert Description Here+++
 *
 * @author Marjorie Teu
 */
public class PartTimeStudent extends Student {

    private int numCourses;

    public PartTimeStudent(String name, int numCourses) {
        super(name);
        this.numCourses = numCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

}
