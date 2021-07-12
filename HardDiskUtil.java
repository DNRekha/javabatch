class HardDiskUtil{

public static void main(String a[]){
HardDiskDTO band=new HardDiskDTO();

band.setBrand("Western Digital");
band.setIsHardDIskInternal=true;
band.setCapacity("1 TB");

System.out.println(band.getBrand());
System.out.println(band.getIsHardDiskInternal());
System.out.println(band.getCapacity());
}
}