class student
{
    int id;
    String name;
    student(int i,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
}
public class anonymoususe {
    public static void main(String[] args) {
        new student(101,"John").display();
    }
}
