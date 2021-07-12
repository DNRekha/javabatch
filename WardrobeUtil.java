class WardrobeUtil{

public static void main(String []a){
WardrobeDTO dto = new WardrobeDTO();

	dto.setType("DOUBLE DOOR");
	dto.setNoOfWardrobe(3);
	
	System.out.println(dto.getType());
	System.out.println(dto.getNoOfWardrobe());
	
	dto.setType("SLIDING DOOR");
	dto.setNoOfWardrobe(4);
	
	System.out.println(dto.getType());
	System.out.println(dto.getNoOfWardrobe());
}
}