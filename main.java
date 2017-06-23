
abstract class x {
abstract void print ();
}
class a extends x
{
void p()
{
System.out.println( "class a");
}
 public void print ()
{
p();
}}
class b extends x
{
void q()
{ System.out.println("class b");
} 
 public void print()
{
q();
}
}
public class main 
{
    public static void main(String args[])
{
x in;
a ob1=new a();
in=ob1;
in.print();
b ob2=new b();
in=ob2;
in.print();
}
}