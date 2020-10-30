package com.sprincore.constructorreferencebean;

public class ProductInfo {

	private String productInfo;

	public ProductInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductInfo(String productInfo) {
		super();
		this.productInfo = productInfo;
	}

	@Override
	public String toString() {
		return "ProductInfo [productInfo=" + productInfo + "]";
	}

}
