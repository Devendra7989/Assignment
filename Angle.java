Class Angle
{
public static void main(String Args[])
{
if(args.length!=2)
System.out.println("Syntax is:Java Angle<Hours><minutes>");
else
int h=interger.parseint(args[0]);
int m=interger.parseint(args[1]);

int ha=h*30;
int ma=m*6;
int gap=Math.abs(ha-ma);
System.out.println("Angle gap is"+gap);

}
}