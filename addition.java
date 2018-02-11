class addition()

{
private int number1;
private int number2;
private int result;

public addition(int a ,int b)
{
  number1 = a;
  number2 = b;
}

public int getNumber1()
{
   return number1;
}

public int getNumber2()  
{
   return number2;
}

public void printDetails()
{
 System.out.println("number1 " + number1 ); 
 System.out.println("number2 " + number2 ); 
}

public int do_add()
{
   result = number1 + number2;
   return result;
}



}
