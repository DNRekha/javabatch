class BroadBandUtil{

public static void main(String a[]){
BroadBandDTO band=new BroadBandDTO();

band.setSpeed(500);
band.setData("50 gb");
band.setAvailableApp("AMAZON");

System.out.println(band.getSpeed());
System.out.println(band.getData());
System.out.println(band.getAvailableApp());
}
}