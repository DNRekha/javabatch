class PlayStore{
String appName;
boolean isNetReq;
String minDataReq;

public static void main(String a[]){

PlayStore ply=new PlayStore();
ply.appName="youtube";
ply.isNetReq=true;
ply.minDataReq="120mb";
System.out.println(ply. appName+" "+ply.isNetReq +" "+ply.minDataReq);

PlayStore play=new PlayStore();
play.appName="zara";
play.isNetReq=true;
play.minDataReq="220mb";
System.out.println(play. appName+" "+play.isNetReq +" "+play.minDataReq);
}

}