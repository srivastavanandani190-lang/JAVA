class basicloop {
    public static void main(String[] args) {
        // for (int i = 0; i <11; i++) {
        //     System.out.println(i);
        // }
        // int i=0;
        // while (i++<11) {
        //     System.out.println(i);
        //     //i++; 
        //     //to avoid infinite loop
        // }  
        // do {
        //     System.out.println(i);
        //     i++;
        // } while (i<11);

    //for(; ;) infinite loop
    //comma separated statements in for loop
     for (int j = 0, k=10; j < k; j++, k--) {
        System.out.println(j+" "+k);

     }

    }
}
//loops-->while, do while, for loop, for each loop
//for loop-->initialization, condition, increment/decrement
//1.first assignment statement is executed
//2.condition is evaluated, if true then body of loop is executed, if false then control comes out of loop
//3.increment/decrement statement is executed
//4.control goes to step 2
//5.when condition becomes false then loop terminates

//initialisation using int i.e type promotion if we use byte, short, char in for loop

//while loop-->initialization, condition, increment/decrement

//do while loop-->initialization, condition, increment/decrement(at least once)menu item selection

//for each loop-->used to iterate over arrays and collections
