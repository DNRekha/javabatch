class QueensOfIndia{
String name;
int noOfYrsRuled;
String dynasty;
public void  printQueensOfIndiaDetails(){
System.out.println(name+" "+noOfYrsRuled+" "+dynasty);
}

public QueensOfIndia(String nm,int rule,String dyn){
name=nm;
noOfYrsRuled=rule;
dynasty=dyn;
}
public static void main(String[] args){
System.out.println("Queens ");
}
}