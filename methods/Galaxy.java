class Galaxy{
public static void main(String a[]){

theGalaxy("milkyway galaxy","13.5 billion yrs","orion",400000000);
theGalaxy("canis major galaxy","210 million yrs","sirius",1000000000);
theGalaxy("virgo A","14 billion yrs","virgo and coma",30000000);
theGalaxy("cygnus A","5 million yrs","the swan",9000000);
}

public static void theGalaxy(String galaxyName,String galaxyAge,String constellation,int noOfStars){

	System.out.println(galaxyName);

	System.out.println(galaxyAge);

	System.out.println(constellation);
	
	System.out.println( noOfStars);
	
}
}