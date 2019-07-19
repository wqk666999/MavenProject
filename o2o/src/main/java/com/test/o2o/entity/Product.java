package com.test.o2o.entity;
import java.util.Date;
import java.util.List;

public class Product {
	private Long productId;
	private String productName;
	private String productDesc;
	private String imgAddr;
	private String normalPrice;
	private String lowPrice;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;
	private Integer enableStatus;
	//0.下架，1.在前端系统中展示
	private List<ProductImg> productimg;
	private ProductCategory productcategory;
	private Shop shop;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getImgAddr() {
		return imgAddr;
	}
	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}
	public String getNormalPrice() {
		return normalPrice;
	}
	public void setNormalPrice(String normalPrice) {
		this.normalPrice = normalPrice;
	}
	public String getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	public Integer getEnableStatus() {
		return enableStatus;
	}
	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}
	public List<ProductImg> getProductimg() {
		return productimg;
	}
	public void setProductimg(List<ProductImg> productimg) {
		this.productimg = productimg;
	}
	public ProductCategory getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(ProductCategory productcategory) {
		this.productcategory = productcategory;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	
}
