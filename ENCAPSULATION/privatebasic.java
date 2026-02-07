class human{

    private String name="Honey";
    private int age=20;

    // public void setName(String n){
    // name = n;
    // }

    public String getName(){
        return name;
    }//getter method

    // public void setAge(int a){
    //     age = a;
    // } 
    //setter method

    public int getAge(){
        return age;
    }
}
public class privatebasic {
    public static void main(String[] args) {
        human h1 = new human();
        // h1.setName("John");
        // h1.setAge(30);

        System.out.println("Name: " + h1.getName());
        System.out.println("Age: " + h1.getAge());
    }
}