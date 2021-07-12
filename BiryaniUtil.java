class BiryaniUtil{

public static void main(String []a){
BiryaniDTO dto = new BiryaniDTO();

	dto.setName("paneer biryani");
	dto.setNoOfPlates(16);
	
	System.out.println(dto.getName());
	System.out.println(dto.getNoOfPlates());
	
	dto.setName("chicken biryani");
	dto.setNoOfPlates(19);
	
	System.out.println(dto.getName());
	System.out.println(dto.getNoOfPlates());
}
}