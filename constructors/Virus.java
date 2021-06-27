class Virus {
static String name;
static String diseases;
static String effects;
static boolean isMedicineAvailable;
public Virus(String nm,String dis,String eff,boolean isMedAvl){
this.name=nm;
this.diseases=dis;
this.effects=eff;
this.isMedicineAvailable=isMedAvl;
}
public static void printVirusDetails(){
System.out.println(name+" "+diseases+" "+effects+" "+isMedicineAvailable);
}
public static void main(String[] args){
System.out.println("THE VirusS");
}

}