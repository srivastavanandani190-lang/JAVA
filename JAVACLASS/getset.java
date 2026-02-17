//The meaning of encapsulation is to make sure that "sensitive" data is hidden from users. To achieve this,
//  you must declare class variables/attributes as private 
// Then you provide public get and set methods to access and update the value of a private variable.

//get and set->private variable can only be accessed and updated through the get and set methods, which is known as data hiding.
public class getset {
    private String name; // private variable

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        getset obj = new getset();
        obj.setName("John"); // Using setter to set the value
        System.out.println(obj.getName()); // Using getter to retrieve the value
    }
}