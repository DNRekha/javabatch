class Jeans{
String name;
int noOfJeans;
String type;
public void  printJeansDetails(){
System.out.println(name+" "+noOfJeans+" "+type);
}

public Jeans(String nm,int hm,String typ){
name=nm;
noOfJeans=hm;
type=typ;
}
public static void main(String[] args){
System.out.println("Jeans is the most comfortable cloth to wear");
}
}
