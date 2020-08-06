public class StudentManagement {
    public Student[] students = new Student[100] ;
    int length = 0;
    String[] group = new String[10] ;
    int idem = 0;

    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup()) ;
    }
    public void addStudent (Student newStudent){
        students[length] = newStudent;
        length++;
    }
    public String CheckGroup() {
        String sol = "";
        for (int i = 0; i < length; i++) {
            for(int j = 0; ; j++){
                if(group[j] == students[i].getGroup())break;
                else if (group [j] != students[i].getGroup() && j == idem ){
                    group[j] = students[i].getGroup();
                    idem ++;
                    break;
                }
            }
        }
        for (int i = 0; i < idem; i++) {
            sol = sol + group[i] + "\n";
        }
        return sol;
    }
    public String StudentByGroup(){
        this.CheckGroup();
        String sol = "";
        for (int i = 0; i < idem; i++) {
            for (int j = 0; j < length; j++) {
                if(students[j].getGroup() == group[i]){
                    sol = sol + students[j].getInfo() + "\n";
                }
            }
        }
        return sol;
    }
    public void removeStudent(String id){
        int location = 0;
        for (int i = 0; i < length; i++) {
            if(students[i].getId().equals(id)){
                location = i;
                break;
            }
        }
        for (int i = location; i < length; i++) {
            students[i] = students[i+1];
        }
        length --;
    }



    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Nguyen Van An", "17021111", "17021111@vnu.edu.vn");
//        System.out.println(s1.getInfo());
        Student s3 = new Student(s2);
        s2.setGroup("K61CD");
//        System.out.println(s3.getInfo());
        StudentManagement stu = new StudentManagement();
        stu.addStudent(s1);
        stu.addStudent(s2);
        stu.addStudent(s3);
        stu.removeStudent("0000");
        System.out.println(stu.StudentByGroup());
    }

}
