class FreedomFighter{
String name;
String foughtAgainst;
int yearOfDeath;
String placeOfBirth;

public static void figther(){
FreedomFighter fighter=new FreedomFighter();
fighter.name="Mangal pandey";
fighter.foughtAgainst="British";
fighter.yearOfDeath=1927;
fighter.placeOfBirth="Punjab";
System.out.println(fighter.name+" "+fighter.foughtAgainst+" "+ fighter.yearOfDeath+" "+ fighter.placeOfBirth);
}
public static void independence(){
FreedomFighter fght=new FreedomFighter();
fght.name="Kittur Chennamma";
fght.foughtAgainst="British";
fght.yearOfDeath=1829;
fght.placeOfBirth="karnataka";
System.out.println(fght.name+" "+fght.foughtAgainst+" "+ fght.yearOfDeath+" "+ fght.placeOfBirth);
}

public static void main (String a[]){
figther();
 independence();

}
}