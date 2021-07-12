class VegetableUtil{

public static void main(String []a){
VegetableDTO dto = new VegetableDTO();

	dto.setName("RADDISH");
	dto.setNoOfVegetable(16);
	
	System.out.println(dto.getName());
	System.out.println(dto.getNoOfVegetable());
	
	dto.setName("CARROT");
	dto.setNoOfVegetable(19);
	
	System.out.println(dto.getName());
	System.out.println(dto.getNoOfVegetable());
}
}