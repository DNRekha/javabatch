class BankApplication{
String bankName;
String purposeOfAppln;
int amount;
String branch;
public static void main(String a[]){

BankApplication bank= new BankApplication();
bank.bankName="sbi";
bank.purposeOfAppln="deposit";
bank.amount=20000;
bank.branch="vijaynagar";
System.out.println(bank.bankName+" "+bank.purposeOfAppln+" "+bank.amount+" "+bank.branch);

BankApplication bnk= new BankApplication();
bnk.bankName="icici bank";
bnk.purposeOfAppln="crediting";
bnk.amount=8000;
bnk.branch="jaynagar";
System.out.println(bnk.bankName+" "+bnk.purposeOfAppln+" "+bnk.amount+" "+bnk.branch);	
}

}