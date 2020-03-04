package com.desafio.itau.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private double price;
	private Integer quantity;

	public Pedido() {
	}

	public Pedido(Integer orderId, double price, Integer quantity) {
		this.id = orderId;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getOrderId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setOrderId(Integer orderId) {
		this.id = orderId;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
