public class Student {
    private int id ;
    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    private int age;
    private double score;
    private int grade;
    private String address;

   public   Student(int id,String name,int age,double score,int grade,String address){
        this.id=id;
        this.name=name;
        this.age=age;
        this.score=score;
        this.grade=grade;
        this.address=address;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void showStudentInfo(){
        System.out.printf("id: %s\n name: %s \n age: %s \n score: %s \n grade: %s \n address: %s",id,name,age,score,grade,address);
    }

}
