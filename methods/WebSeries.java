class Movie{
public static void main(String a[]){

someMovie("13 reasons why","clay jensen",7,"english","netflix");
someMovie("elite","itzan escamilla",12,"spanish","netflix");
someMovie("DOTS","soong joong ki",4,"korean","viki");
newMovie("jack ryan","john krasinski",5,"english","prime");
}

public static void someMovie(String name,String seriesLead,int noOfMainCharacters,String language,String platform){

	System.out.println(name);
	System.out.println(seriesLead);
	System.out.println(noOfMainCharacters);
	System.out.println(language);	
	System.out.println(platform);
}
public static void newMovie(String name,String language){
System.out.println(name);
System.out.println(language);	
}
}