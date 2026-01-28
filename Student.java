public class Student {
    int student_id;
    String student_name;


    // constructor
    public Student(int student_id, String student_name){
        this.student_id=student_id;
        this.student_name =student_name;
    }
    // methods
    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                '}';
    }
    //getters
    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }


}
