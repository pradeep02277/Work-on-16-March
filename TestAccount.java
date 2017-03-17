package Java_Oops;

class Account
{  
int acc_no;  
String name;  
float amount;  
void insert(int a,String n,float amt)
{  
acc_no=a;  
name=n;  
amount=amt;  
}  
void deposit(float amt){  
amount=amount+amt;  //i.e:amount=amount+deposit
System.out.println(amt+" deposited");  
}  
void withdraw(float amt){  
if(amount<amt)       //if(amount<deposit)
{  
System.out.println("Insufficient Balance");  
}
else{  
amount=amount-amt;  //else amount=amount-deposit
System.out.println(amt+" withdrawn");  
}  
}  
void checkBalance(){
	System.out.println("Balance is: "+amount);
	}  
void display(){
	System.out.println(acc_no+" "+name+" "+amount);}  
}  
  
class TestAccount{  
public static void main(String[] args){  
Account a1=new Account();  
a1.insert(2727,"Pradeep",1000);  
a1.display();  
a1.checkBalance();  
a1.deposit(4000);  
a1.checkBalance();  
a1.withdraw(1500);  
a1.checkBalance();  
}
}   