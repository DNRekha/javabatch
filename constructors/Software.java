class Software{
static int softwareId;
static String name;
static String type;
static boolean isOpenSource;

public Software(int softId,String nm,String typ,boolean isOpenSrc){
this. softwareId=softId;
this.name=nm;
this. type=typ;
this.isOpenSource=isOpenSrc ;
}

public static void printSoftwareDetails(){
System.out.println(softwareId+" "+name+" "+type+" "+isOpenSource);
}
public static void main(String[] args){
System.out.println("THE SOFTWARES");
}
}