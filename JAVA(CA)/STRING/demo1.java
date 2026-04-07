public class demo1 {
    public static void main(String[] args) {
 String s1=new String("Hello");
    String s2=new String("");
    String s3="Honey";
    String s4=new String(s3);
    System.out.println(s1);
    System.out.println(s2); 
    System.out.println(s3);
    System.out.println(s4);

//char array
char[] ch={'H','e','l','l','o'};
//ch[0]='h' won't change s5 because s5 is created by copying the content of ch, not referencing it.
String s5=new String(ch);
System.out.println(s5);

String s6=new String(ch,1,3);//(arr,[offset,count))
System.out.println(s6);

byte[] arr1={97,98,99};//ASCII values for 'a','b','c'
String s7=new String(arr1);
System.out.println(s7);

StringBuffer sb=new StringBuffer("Hello");
String s8=new String(sb);   
System.out.println(s8);

    }
}