class PowerBankUtil{

public static void main(String a[]){
PowerBankDTO band=new PowerBankDTO();

band.setData("50 gb");
band.setAvailableApp("AMAZON");

System.out.println(band.getData());
System.out.println(band.getAvailableApp());
}
}