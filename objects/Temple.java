class Temple{
String name;
String place;
public static void originalTemp(){
 Temple temp=new  Temple();
temp.name="venkateshwara";
temp.place="tirupati";
System.out.println(temp.name+" "+temp.place);
}
public static void devotion(){
Temple dev=new  Temple();
dev.name="somnath temple";
dev.place="gujarat";
System.out.println(dev.name+" "+dev.place);
}
public static void main(String a[]){
originalTemp();
devotion();
}
}