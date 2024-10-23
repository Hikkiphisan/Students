public class ManagerStudent {
    int id;
    Object student;
    public ManagerStudent(int id, Object student) {
        this.id = id;
        this.student = student;
    }

    public static void main(String[] args) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getStudent() {
        return student;
    }

    public void setStudent(Object student) {
        this.student = student;
    }

}

