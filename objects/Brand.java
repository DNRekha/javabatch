class Brand{
String name;
String type;
boolean isMadeInIndia;

public static void main(String a[]){

Brand product=new Brand();
product.name="ZARA";
product.type="cloth";
product.isMadeInIndia=false;
System.out.println(product.name+" "+product.type+" "+product.isMadeInIndia);

Brand prod=new Brand();
prod.name="RELIENCE TRENDS";
prod.type="cloths";
prod.isMadeInIndia=true;
System.out.println(prod.name+" "+prod.type+" "+prod.isMadeInIndia);


}
}