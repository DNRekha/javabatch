class TableUtil{

public static void main(String a[]){
TableDTO band=new TableDTO();

band.setType("round teak Table");
band.setNoOfTable(40);

System.out.println(band.getType());
System.out.println(band.getNoOfTable());

band.setType("rose wood Table");
band.setNoOfTable(70);

System.out.println(band.getType());
System.out.println(band.getNoOfTable());
}

}