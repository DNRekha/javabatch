class ModeOfTransportation{
String name;
String mode;
String brand;

public static void travel(){
 ModeOfTransportation mode=new  ModeOfTransportation();
mode.name="bike";
mode.mode="road";
mode.brand="hero honda";
System.out.println(mode.name+" "+mode.mode+" "+mode.brand);
}
public static void reachingDestination(){
 ModeOfTransportation transp=new  ModeOfTransportation();
transp.name="car";
transp.mode="road";
transp.brand="ciazz";
System.out.println(transp.name+" "+transp.mode+" "+transp.brand);
}
public static void main(String a[]){
travel();
reachingDestination();
}
}