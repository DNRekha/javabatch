class Museum{
static String place;
static String name;
static String type;


public Museum(String plc,String nm,String typ){
this. place=plc;
this.name=nm;
this. type=typ;

}

public static void printMuseumDetails(){
System.out.println(place+" "+name+" "+type);
}
public static void main(String[] args){
System.out.println("THE MuseumS");
}

}