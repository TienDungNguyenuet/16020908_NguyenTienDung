
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getGroup(){
        return this.group;
    }
    public void setGroup(String name){
        this.group = name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
//    public  Student(){
//        this.name = "Nguyen Van An";
//        this.id = "17020001";
//        this.group = "K62CC";
//        this.email = "17020001@vnu.edu.vn";
//    }
    public String getInfo(){
        return (name+" - "+id+" - "+group+" - "+email);
    }
    public  Student(){
        this.name = "Student";
        this.id = "0000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email){
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    public Student (Student s){
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
}

