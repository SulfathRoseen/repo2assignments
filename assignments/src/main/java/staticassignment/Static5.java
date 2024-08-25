package staticassignment;

public class Static5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static5.calculatetotalamount(2500,2500, 1000);
		Static5.applyDiscount(discountedamount);
	}
public static void calculatetotalamount(int price1,int price2,int price3)
{
int totalamount=price1 +price2+price3;
System.out.println(totalamount);
}
public static void applydiscount(int totalamount)
{
if (totalamount>5000)	
{
	double discountedamount=totalamount*0.8;
	System.out.println("Discount applied");
}
else
{
	System.out.println("No discount applied");
}
}
}

