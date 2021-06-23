class Resturant{
String name;
String place;
boolean isVeg;

public static void main(String a[]){

Resturant res=new Resturant();
res.name="denison";
res.place="dharwad";
res.isVeg=true;
System.out.println(res.name+" "+res.place+" "+res.isVeg);


Resturant restu=new Resturant();
restu.name="sip n dine";
restu.place="bengaluru";
restu.isVeg=false;
System.out.println(restu.name+" "+restu.place+" "+restu.isVeg);


}
}