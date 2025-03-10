class additon
{
   public int add(int a, int b)
   {
         int addition = a+b;
         return addition;
   }
}
class subtraction extends addition
{
     public int sub(int a, int b)
     {
          int subtraction = a-b;
          return subtraction;
     }
}
class multiplication extends subtraction
{
      public int mult(int a, int b)
     {
          int multiplication = a*b;
          return multiplication;
     }
}
class division extends multiplication
{
    public int div(int a,int b)
    {
          int division = a/b;
          return division;
    }
}
class calculator
{
    public static void main(String args[])
    {
         division obj = new division();
         obj.add(10,5);
         obj.sub(12,7);
         obj.mult(2,4);
         obj.div(10,2);
        System.out.println(addition);
         System.out.println(subtraction);
           System.out.println(multiplication);
     System.out.println(division);
   }
}