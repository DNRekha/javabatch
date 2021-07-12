public class BroadBandDTO{

private int speed;
private String data;
private String availableApp;

public BroadBandDTO(){

}
public int getSpeed(){
	return speed;
}
public void setSpeed(int speed){
	this.speed=speed;
}

public String getData(){
	return data;
}
public void setData(String data){
	this.data=data;
}

public String getAvailableApp(){
	return availableApp;
}
public void setAvailableApp(String availableApp){
	this.availableApp=availableApp;
}
}