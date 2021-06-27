class Speaker{
public static String brandName="SONY";
public static String color="BLUE";
public static int maxVolume=9;
public static int minVolume=1;
public static int currentVolume=6;
public static boolean connected;

public static void onOrOff(){
System.out.println("INSIDE SPEAKERS");
if(connected==false){
connected=true;
System.out.println("SPEAKER IS ON");
}
else if(connected==true){
connected=false;
System.out.println("SPEAKER IS OFF");
}
}


public static int increaseVolume(){ 
if(connected==true){
if(currentVolume < maxVolume){
currentVolume=currentVolume+1;
System.out.println("current volume is:"+ currentVolume);
}
}
else{
System.out.println("max volume  reached");
}
else{
System.out.println("SPEAKER IS OFF");
}
return currentVolume;
}


public static int decreaseVolume(){ 
if(connected==true){
if(currentVolume > minVolume){
currentVolume=currentVolume-1;
System.out.println("current volume is:"+ currentVolume);
}
}
else{
System.out.println("min volume  reached");
}
return currentVolume;
}

public static void main(String a[]){
onOrOff();
int volume= increaseVolume();
System.out.println(volume);
increaseVolume();
int vol= decreaseVolume();
System.out.println(vol);
decreaseVolume();
int volu= decreaseVolume();
System.out.println(volu);
decreaseVolume();
}
}