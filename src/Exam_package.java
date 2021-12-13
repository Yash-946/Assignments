public class Exam_package {
    int roll_no;
    String course;
    int marks;
    Exam_package()
    {
        roll_no =10;
        course = "BTECH";
        marks = 50;
    }
    Exam_package(int roll_no,String course,int marks){
        this.roll_no=roll_no;
        this.course=course;
        this.marks=marks;
    }
    Exam_package(int roll_no){
        this.roll_no=roll_no;
        course="BCA";
        marks=51;
    }
    public void display(){
        System.out.println(roll_no+"  "+course+"  "+marks);
    }
}
class Main{
    public static void main(String[] args) {
        Exam_package obj1 = new Exam_package();
        Exam_package obj2 = new Exam_package(23,"MCA",90);
        Exam_package obj3 = new Exam_package(30);
        obj1.display();
        obj2.display();
        obj3.display();
    }

}
