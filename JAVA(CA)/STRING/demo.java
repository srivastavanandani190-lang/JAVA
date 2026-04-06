public class demo{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" World");
        System.out.println(str2); // Output: Hello World

        String s1="Ja"+"va";
        String s2="Java";
        System.out.println(s1==s2); // Output: true

        String s3=new String("Java");
        System.out.println(s1==s3); // Output: false

      String s4="hii";
      String s5=s4+"everyone";
      String s6="hii everyone";
      System.out.println(s5==s6); // Output: false

      String s7="honey";
      String s8=s7;
      System.out.println(s7==s8); // Output: true

      String s9="honey";
      s9="bee";
      System.out.println(s9); // Output: bee

      
    }
}