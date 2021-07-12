class MagazineUtil{

public static void main(String []a){
	MagazineDTO dto = new MagazineDTO();
	
	dto.setNoOfpages(6);
	dto.setPrice(300);
	dto.setName("vouge");
	dto.setType("fashion");
	
	System.out.println(dto.getNoOfMagazine());
	System.out.println(dto.getPrice());
	System.out.println(dto.getName());
	System.out.println(dto.getType());
	
	MagazineDTO dto1 = new MagazineDTO();
	dto1.setNoOfMagazine(3);
	dto1.setPrice(500);
	dto.setName("vijaya");
	dto.setType("educational");
	
	System.out.println(dto1.getNoOfMagazine());
	
	System.out.println(dto1.getPrice());
	System.out.println(dto.getName());
	System.out.println(dto.getType());
}

}