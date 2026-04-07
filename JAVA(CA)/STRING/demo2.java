class demo2{
    public static void main(String[] args) {
   String s1=new String("Hello");
   String s2=new String("Hello");
   System.out.println(s1.length());
   System.out.println(s1.isEmpty());//"   "false
   System.out.println(s1.isBlank());//"   "true
   //character access
   System.out.println(s1.charAt(0));
   System.out.println(s1.charAt(4));
    //comparison
    System.out.println(s1.equals(s2));//value
    System.out.println(s1==s2);//reference
  String s3=new String("HELLO");    
  System.out.println(s1.equalsIgnoreCase(s3));//value
  //lexicographical order
  System.out.println(s1.compareTo(s3));//ASCII value +,- or 0

//search
System.out.println(s1.contains("lo"));
System.out.println(s1.indexOf("lo"));//first occurrence
System.out.println(s1.lastIndexOf("lo"));//last occurrence
//startsWith and endsWith
System.out.println(s1.startsWith("He"));
System.out.println(s1.endsWith("lo"));

//extraction/transformation
System.out.println(s1.substring(0,3));//[0,3)
System.out.println(s1.toUpperCase());   
System.out.println(s1.toLowerCase());   
System.out.println(s1.trim());//remove leading and trailing spaces
System.out.println(s1.replace('l', 'x'));//replace all occurrences of 'l' with 'x'
System.out.println(s1.strip());//remove leading and trailing spaces (Java 11+)
System.out.println(s1.replaceAll("l", "x"));//replace all occurrences of 'l' with 'x' using regex

String s4="Honey,Nilli,Anjii";
String[] parts=s4.split(",");//split by comma
for(String part:parts){
    System.out.println(part);   
    }
    System.out.println(String.join("-", parts));//join with hyphen
    }

    //conversion
    String s5=String.valueOf(123);//int to String
    System.out.println(s5);

    


}