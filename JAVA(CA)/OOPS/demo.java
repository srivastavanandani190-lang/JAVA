class Student1{
    String name;
    int rollnum;
    String college;
    void present(){
        System.out.println("prsent"+name);
    }
    void print(){
        System.out.println("name:"+name);
        System.out.println("rollnum:"+rollnum);
        System.out.println("college:"+college);
    }

}
class demo{
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "John";
        s1.rollnum = 101;
        s1.college = "ABC College";
        s1.present();
        s1.print();
        Student1 s2 = new Student1();
        s2.name = "Alice";
        s2.rollnum = 102;
        s2.college = "XYZ University";
        s2.present();
        s2.print();
    }
}