package OgrenciNotSistemi;

public class Student {
    String name;
    String studentNo;
    int classes;
    Course mat,fizik,kimya;
    double average;
    boolean isPass;

    public Student(String name,int classes,String studentNo,Course mat,Course fizik,Course kimya){
        this.name=name;
        this.classes=classes;
        this.studentNo=studentNo;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        calculateAverage();
        this.isPass=false;

    }
    public void addBulkExamNote(int mat, int fizik,int kimya){
        if (mat>=0&&mat<=100){
            this.mat.note=mat;
        }
        if (fizik>=0&&fizik<=100){
            this.fizik.note=fizik;
        }
        if (kimya>=0&&kimya<=100){
            this.kimya.note=kimya;
        }
    }
    public void addBulSozluNote(int matS, int fizikS,int kimyaS){
        if (matS>=0&&matS<=100){
            this.mat.sozluNote=matS;
        }
        if (fizikS>=0&&fizikS<=100){
            this.fizik.sozluNote=fizikS;
        }
        if (kimyaS>=0&&kimyaS<=100){
            this.kimya.sozluNote=kimyaS;
        }
    }
    public int calculateMat(){
        return (this.mat.note*9+this.mat.sozluNote)/10;
    }
    public int calculateFizik(){
        return (this.fizik.note*8+this.fizik.sozluNote*2)/10;
    }
    public int calculateKimya(){
        return (this.kimya.note*85+this.kimya.sozluNote*15)/100;
    }


    public void calculateAverage(){
        this.average=(calculateMat()+calculateFizik()+calculateFizik())/3;
    }
    public boolean isCheckPass(){
        calculateAverage();
        return this.average>55;
    }
    public void isPass(){
        if (this.mat.note==0||this.fizik.note==0||this.kimya.note==0||this.mat.sozluNote==0||this.fizik.sozluNote==0||this.kimya.sozluNote==0){
            System.out.println("Notlar tam girilmemiş");
        }else {
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Ortalama:"+this.average);
            if (this.isPass){
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        }
    }
    public void printNote(){
        System.out.println("*****************************************");
        System.out.println("Öğrenci:"+this.name);
        System.out.println("Matematik:"+calculateMat());
        System.out.println("Fizik:"+calculateFizik());
        System.out.println("Kimya:"+calculateKimya());
    }

}
