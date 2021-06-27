class MySuperMarket{
public static void main(String a[]){

String perfume[]={"axe","fogg","yardly","secret"};
int amountCan[]={120,80,300,450};
System.out.println(perfume.length);
String value[ ]=fetchPerfumeAndPrice(perfume,amountCan);
for(String s: value)
{
System.out.println(s);
}
public static String[] fetchPerfumeAndPrice(String deo[],int amountCan[])
{
	String totaldeo[]=new String[deo.length];
for(int i=0;i<deo.length;i++)
{
deo[i]=deo[i]+ " " +amountCan[i];
 totaldeo[i]= deo[i];	
}
return totaldeo;
}


String biscuits[]={"good day","parle","moms magic","chocos","tiger"};
int amountPack[]={30,10,20,10,10};
System.out.println(biscuits.length);
String pack[]=fetchBiscuitPrice(biscuits,amountPack);
for(String s:pack)
{
	System.out.println(s);
}
}
public static String[] fetchBiscuitPrice(String cookie[],int amountPack[])
{
	String totalcookie[]=new String[cookie.length];
for(int i=0;i<cookie.length;i++){
cookie[i]=cookie[i]+ " " +amountPack[i];
 totalcookie[i]= cookie[i];	
}
return totalcookie;
}


}
}