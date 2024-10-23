//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Anh A",44,173,76,88);
        int fix = student.getHeight();
        fix++;
        System.out.println(student);

        ManagerStudent managerStudent = new ManagerStudent(12,student);
        Student demo = managerStudent.getStudent();
        demo.getAge();
        System.out.println(managerStudent.getStudent());

    }
}