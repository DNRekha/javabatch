class Library{
String name;
String authName;
int noOfBookSold;

public static void main(String a[]){
System.out.println("main method started");

Library lib=new Library();
lib.name="2 states";
lib.authName="chethan bagath";
lib.noOfBookSold=400;
System.out.println(lib.name+" "+lib.authName+" "+lib.noOfBookSold);

Library book=new Library();
book.name="half girlfrient";
book.authName="chethan bagath";
book.noOfBookSold=500;
System.out.println(book.name+" "+book.authName+" "+book.noOfBookSold);

}
}