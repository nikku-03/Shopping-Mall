import java.util.*;
class Product
{
	String item_name;
	float price;
	Product()
	{
	}
	Product(String item_name,float price)
	{
		this.item_name = item_name;
		this.price = price;
	
	}
	public String getItemName()
	{
		return item_name;
	}
	public void setItem(String item_name)
	{
		this.item_name = item_name;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public String toString()
	{
		return item_name+ "  "+price;
	}
	
}

class ShoppingCart
{
	ArrayList<Product> cart;
	ShoppingCart()
	{
		cart=new ArrayList<>();
	}
	void addProduct(Product p)
	{
		cart.add(p);
	}
	void removeProduct(int index)
	{
		cart.remove(index);
	}
	void showProduct()
	{ 
		for(Product p:cart)
		{
				System.out.println(p);
		}
	}
	void cal_bill()
	{
		float total_bill = 0.0f;
		for(Product p : cart)
		{
			total_bill += p.getPrice();
	    }
		System.out.println("Total Bill="+total_bill);
	}
}
class ShoppingMall
{
	public static void main(String args[])
	{
		
		Product p;
		String itm;
		float price;
		ShoppingCart scart = new ShoppingCart();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Item Name: ");
			itm=sc.next();
			System.out.println("Enter Price : ");
			price=sc.nextFloat();			
			p=new Product(itm,price);
			scart.addProduct(p);
			System.out.println("Continue (Y/N): ");
			String opt=sc.next();
			if(opt.equals("N"))
				break;
			
		}
		scart.showProduct();
		scart.cal_bill();
	}
}
