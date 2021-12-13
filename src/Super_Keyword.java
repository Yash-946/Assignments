public class Super_Keyword {
    int id;
    String name;
    int salary;
    Super_Keyword(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Emp extends Super_Keyword{

    Emp(int id,String name,int salary){
        super(id,name);//reusing parent constructor
        this.salary=salary;
    }
    void display(){
        System.out.println(id+"  "+name+"  "+salary);
    }
}
class Main2{
    public static void main(String[] args){
        Emp e1=new Emp(1,"Yash",50000);
        e1.display();
    }
}