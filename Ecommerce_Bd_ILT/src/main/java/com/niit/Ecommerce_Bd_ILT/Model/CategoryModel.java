package com.niit.Ecommerce_Bd_ILT.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table
public class CategoryModel  implements Serializable

{ 
private static final long serialVersionUID=1L;
@Id
@Column(name="categoryid")
private int categoryid;
@Column(name="categoryname")
private String categoryname;
public int getCategoryid() {
	return categoryid;
}
public void setCategoryid(int categoryid) {
	this.categoryid = categoryid;
}
public String getCategoryname() {
	return categoryname;
}
public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}
public CategoryModel(int categoryid, String categoryname) {
	super();
	this.categoryid = categoryid;
	this.categoryname = categoryname;
}
public CategoryModel() {
	super();
	// TODO Auto-generated constructor stub
}

}