class RemoteUtil{

public static void main(String []a){
	RemoteDTO dto = new RemoteDTO();
	
	dto.setNoOfRemote(6);
	dto.setPrice(300);
	
	
	System.out.println(dto.getNoOfRemote());
	
	System.out.println(dto.getPrice());
	
	
	RemoteDTO dto1 = new RemoteDTO();
	dto1.setNoOfRemote(3);
	
	dto1.setPrice(500);
	
	
	System.out.println(dto1.getNoOfRemote());
	
	System.out.println(dto1.getPrice());

}

}