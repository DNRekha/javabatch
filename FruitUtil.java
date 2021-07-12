class FruitUtil{

public static void main(String []a){
FruitDTO dto = new FruitDTO();

	dto.setName("APPLE");
	dto.setNoOfFruit(6);
	
	System.out.println(dto.getName());
	System.out.println(dto.getNoOfFruit());
	
	dto.setName("orange");
	dto.setNoOfFruit(11);
	
	System.out.println(dto.getName());
	System.out.println(dto.getNoOfFruit());
}
}