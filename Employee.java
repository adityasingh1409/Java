class Details{
    int id;
    String name;
    double salary;
    Details(int id,String name, double salary){
        this.id = id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("ID =" + id);
        System.out.println("Name = " +name);
        System.out.println("salary = "+salary);
    }
}
public class Employee {
    public static void main(String[] args){
        Details employee1 = new Details(101,"Aditya",100000);
        Details employee2 = new Details(102,"harsh",10000);
        employee1.display();
        System.out.println();
        employee2.display();

    }
}
