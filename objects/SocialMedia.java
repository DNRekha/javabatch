class SocialMedia{
String name;
String color;
boolean isInternetReq;
String ownerName;
public static void main(String a[]){

System.out.println("Main method started");
System.out.println("in process of creating objects");

SocialMedia sm =new SocialMedia();
sm.name="telegram";
sm.color="blue";
sm.isInternetReq=true;
sm.ownerName="pavel";
System.out.println(sm.name+" "+sm.color+" "+sm.isInternetReq+" "+sm.ownerName);


SocialMedia social =new SocialMedia();
social.name="insta";
social.color="pink";
social.isInternetReq=true ;
social.ownerName="kevin";
System.out.println(social.name+" "+social.color+" "+social.isInternetReq+" "+social.ownerName);

}

}