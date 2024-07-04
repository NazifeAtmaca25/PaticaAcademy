package OgrenciNotSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNote;


    public Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.sozluNote=0;

    }

    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.teacher=t;
            System.out.println("İşlem başarılı");
        }else {
            System.out.println(t.name+" akademisyeni bu dersi veremez.");
        }
    }
    public void printTeacher(){
        if (teacher!=null){
            System.out.println(this.name+" dersinin akademisyeni "+this.teacher);
        }else {
            System.out.println(this.name+" dersin akademisyeni atanmamıştır.");
        }
    }
}
