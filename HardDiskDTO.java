public class HardDiskDTO{

private String brand;
private boolean isHardDiskInternal;
private String capacity;

public HardDiskDTO(){

}
public String getBrand(){
	return brand;
}
public void setBrand(String brand){
	this.brand=brand;
}

public boolean getIsHardDiskInternal(){
	return isHardDiskInternal;
}
public void setIsHardDiskInternal(boolean isHardDiskInternal){
	this.isHardDiskInternal=isHardDiskInternal;
}

public String getCapacity(){
	return capacity;
}
public void setCapacity(String capacity){
	this.capacity=capacity;
}
}