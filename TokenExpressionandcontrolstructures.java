//1. Data type is keyword used to allocate sufficient memory space for the data
    //data type is used for representing the data in main memory(RAM)

// 2.  fundamental or primitive data type
// 3.  Derived data type
//4. user defined data type

//2. primitive data type 
  //* boolean data type */
  // boolean data type is used to store true or false value
  // boolean x = false

  //*Byte Data type */
  // byte data type is used to store the integer value between -128 to 127
  // byte x = 127

  //*short Data type */
  // short data type is used to store the integer value between -32768 to 32767
  // short x = 32767

  //*Int Data type */
  // int data type is used to store the integer value between -2147483648 to 2147483647
  // int x = 2147483647

  //*Long Data type */
  // long data type is used to store the integer value between -9223372036854775808 to 9223372036854775807
  // long x = 9223372036854775807

  //*Float Data Type */
  // float data type is used to store the floating point value between -3.4E+38 to 3.4E+38
  // float x = 3.4E+38

  //*Double Data type */
  // double data type is used to store the floating point value between -1.7E+308 to 1.7E+308
  // double x = 1.7E+308

  //*Char Data type */
  // char data type is used to store the character value between 0 to 65535
  // char x = 65535

  //*Derived Data Type */
  // Derived data type is a data type that is derived from the primitive data type

  //*user defined data types */
  // user defined data type is a data type that is created by the user

  // 5. variable - is an identifier which can be used to identify input data in a program.
    //rules- variable name start with alphabets,no space is allowed

  // 6.identifiers - the name of variables,methods,class,packages and interface-composed of letter,num,undersocre_or $.
  
  //7. constants- is a variable which cannot have its value changed after declaration. PI-3.14

  //8. String - any sequences of characters within double quotes is treated as string

  //9. Array - is a collection of similar data type. is a container object that holds values of homogenous type.

  //10. comment - are staements that are not executed by the compiler and interpreter.

  //11. operator - is a symbol that tells the computer to perform the certain mathematical or logical manipulation.
        //types
        //arithmetic operator
        //relational operator - are binary operators used to checking relation between two variables or numbers. <,>,!=.
        //Bitwise operator - works on bits and performss the bit-by-bit operators. &,|,
        //logical operator - are used to perform logical operations on two operands. &&,||,!,^
        //assignment operator - is used to assign the value to the variable. =,+=,-=,*=,/=,%=,&=,|
        //ternary operator - is also known as conditional operator. ? :
        //unary operator - is an operator that takes only one operand. ++,--,!,~,^,+,

  //12. if statement - is a condition statement used to test the condition.Ex
                  class ifTest{
                    public static void main(String[] args){
                      int a=10;
                      if(a==10){
                        System.out.println("a is 10");
                      }
                    } 


  //13. if..else statement- if condition is true then statements in if block will be executed but if it comes out as false then else block will be executed.ex
  class ifelseTest{
    public static void main(String[] args){
      int a=10;
      if(a==10){
        System.out.println("a is 10");
        }
        else{
          System.out.println("a is not 10");
          }
          }



    //14. if..else if statement - is a combination of if and else statement. ex
    class ifelseifTest{
      public static void main(String[] args){
        int a=10;
        if(a==10){
          System.out.println("a is 10");
          }
          else if(a==20){
            System.out.println("a is 20");
            }
            else{
              System.out.println("a is not 10 or 20");
              }
              }
              
     
 //15. switch statement - compares the value and executes one of the case blocks based on the condition.ex
 class switchTest{
  public static void main(String[] args){
    int a=10;
    switch(a){
      case 10:
      System.out.println("a is 10");
      break;
      case 20:
      System.out.println("a is 20");
      break;
      default:
      System.out.println("a is not 10 or 20");
      }
      }


    //16. Nested if statement - if statement is if inside an if block.example
    class nestedifTest{
      public static void main(String[] args){
        int a=10;
        if(a==10){
          if(a==20){
            System.out.println("a is 20");
            }
            else{
              System.out.println("a is not 20");
              }
              }
              }


   //17. looping statements in java- are the statements which execute a block of code repeatedly until some condition meet to the criteria.
          //types
   //17.1 for loop - for loop is used to iterate a block of code a specified number of times. example
   class forloopTest{
    public static void main(String[] args){
      for(int i=0;i<5;i++){
        System.out.println(i);
        }
        }

     //17.2 Do..while loop - do while works same as while loop.ex
     class dowhileTest{
      public static void main(String[] args){
        int i=0;
        do{
          System.out.println(i);
          i++;
          }while(i<5);
          }
          //17.3 while loop - while loop is used to execute a block of code repeatedly until some condition meet to the criteria.
          class whileTest{
            public static void main(String[] args){
              int i=0;
              while(i<5){
                System.out.println(i);
                i++;
                }
                }

                