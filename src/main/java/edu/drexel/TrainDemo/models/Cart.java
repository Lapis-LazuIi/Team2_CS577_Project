package edu.drexel.TrainDemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private boolean addOn;
	private Long destination_id;
	private Long source_id;
	private Double totalPrice;

	protected Cart() {
	}

	public Cart(boolean addOn, Long destinationId, Long sourceId, Double totalPrice) {
		this.addOn = addOn;
		this.destination_id = destinationId;
		this.source_id = sourceId;
		this.totalPrice = totalPrice;
	}

	public Long getId() {
		return id;
	}

	public boolean getaddOn() {
		return addOn;
	}

	public Long getdestinationId() {
		return destination_id;
	}

	public Long getsourceId() {
		return source_id;
	}

	public Double gettotalPrice() {
		return totalPrice;
	}

	@Override
	public String toString() {
		return "Cart{" + "id=" + id + ", addOn='" + getaddOn() + '\'' + ", source=" + getsourceId() + ", destination='"
				+ getdestinationId() + '\'' + ", totalPrice=" + gettotalPrice() + '}';
	}
}
