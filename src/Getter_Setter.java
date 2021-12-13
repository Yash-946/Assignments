public class Getter_Setter {
    private int age;
    private char gender;
    public int getAge(){
        return age;
    }
    public void setAge(int age1){
        age = age1;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender1){
        gender = gender1;
    }
}
class Person1Main{
    public static void main(String[] args) {
        Getter_Setter obj =new Getter_Setter();
        obj.setAge(20);
        obj.setGender('M');
        System.out.println(obj.getAge()+" "+obj.getGender());

    }
}
