class FurnitureUtil{

public static void main(String a[]){
FurnitureDTO band=new FurnitureDTO();

band.setType("SOFA teak Furniture");
band.setNoOfFurniture(40);

System.out.println(band.getType());
System.out.println(band.getNoOfFurniture());

band.setType("cot rose wood Furniture");
band.setNoOfFurniture(70);

System.out.println(band.getType());
System.out.println(band.getNoOfFurniture());
}

}