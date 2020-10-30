package com.sprincore.constructorreferencebean;

public class Product {

	private int productId;
	private String productName;
	private ProductInfo productInfo;

	public Product(int productId, String productName, ProductInfo productInfo) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productInfo = productInfo;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productInfo=" + productInfo
				+ "]";
	}

}
