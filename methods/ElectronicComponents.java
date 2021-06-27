class ElectronicComponents
{
public static void main(String a[])
{
myComponents("resistor");
myComponents(9);
}
public static void myComponents(String name)
{
System.out.println("the most necessarily used component is"+"resistor");
}
public static void myComponents(int noOfComponents)
{
System.out.println("there are "+"noOfComponents"+" main components in EC");
}
}