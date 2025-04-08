class program6{
public static void main(String[]args){
int a=10;
System.out.println(a);
int c=20;
int b=a++ + ++c + c-- + c++ + --a + --a + c--;
System.out.println("the value of b "+b);
System.out.println("the value of a "+a);
System.out.println("the value of c "+c);
}
}
/*
unary operator
it is used to increase/decrease a value by 1
1. increment operator
         1.preincrement(++value)
it will increase the value by 1,then it will use
         2.postincrement(value++)
firstly,it will use the value,then it increase the value by 1
2.decrement operator
         1.predecrement(--value)
         2.postdecrement(value--)
*/

