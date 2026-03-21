class unboxing {
    public static void main(String[] args) {
      Integer a=200;
      Integer b=200;
      System.out.println(a==b); //false
      //because it is comparing the reference of a and b not the value of a and b
      a=536;
      b=536;
      System.out.println(a==b); //true
      //caching of Integer objects in the range of -128 to 127, so when we assign a value in this range to an Integer object, it will return the same object reference for the same value.
      System.out.println(a.equals(b)); //true
      System.out.println(a.intValue()==b.intValue()); //true
      int m=500;
      int n=500;
      System.out.println(m==n); //true

    }
}