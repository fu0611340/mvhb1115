package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the coffees database table.
 * 
 */
@Entity
@Table(name="coffees")
@NamedQuery(name="Coffee.findAll", query="SELECT c FROM Coffee c")
public class Coffee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COF_NAME")
	private String cofName;

	private BigDecimal price;

	private int sales;

	private int total;

	@Column(name="SUP_ID")
	private int supId;

	public Coffee() {
	}

	public String getCofName() {
		return this.cofName;
	}

	public void setCofName(String cofName) {
		this.cofName = cofName;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getSales() {
		return this.sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSupId() {
		return this.supId;
	}

	public void setSupplier(int supId) {
		this.supId = supId;
	}

	@Override
	public String toString() {
		return "Coffee [cofName=" + cofName + ", price=" + price + ", sales=" + sales + ", total=" + total + ", supId="
				+ supId + "]";
	}

}