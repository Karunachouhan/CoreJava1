package in.co.oop.encapsulation;

public class TestProduct {
 public static void main(String[] args) {
	 
	 Product pr = new Product();
	 pr.setProductName("iPhone 16 Pro Max");
	 pr.setProductId(101);
	 pr.setQuantity(2);
	 pr.setCategory("Smart phone");
	 pr.setPrice(130000.0);
	 
	 System.out.println("Product name = "+pr.getProductName());
	 System.out.println("Product id = "+pr.getProductId());
	 System.out.println("Product quantity = "+pr.getQuantity());
	 System.out.println("Product category = "+pr.getCategory());
	 System.out.println("Price = "+pr.getPrice());
 }
}
