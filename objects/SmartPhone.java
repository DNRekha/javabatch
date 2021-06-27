class SmartPhone {
String name;
boolean isAnroid;
String brand;
public static void phone(){
 SmartPhone cal=new  SmartPhone();
cal.name="mi pro ";
cal.isAnroid=true;
cal.brand="Redmi";
System.out.println(cal.name+" "+cal.isAnroid+" "+cal.brand);
}
public static void advanced(){
 SmartPhone msg=new  SmartPhone();
msg.name="Apple";
msg.isAnroid=false;
msg.brand="iphone";
System.out.println(msg.name+" "+msg.isAnroid+" "+msg.brand);
}
public static void main(String a[]){
phone();
advanced();
}
}