package edu.drexel.TrainDemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double price;
	private Long routeId;
	private Long stopId;
	private Long ticket_available;

	protected Ticket() {

	}

	public Long getId() {
		return id;
	}

	public Double getPrice() {
		return price;
	}

	public Long getRouteId() {
		return routeId;
	}

	public Long getStopId() {
		return stopId;
	}

	public Long getTicketAvailable() {
		return ticket_available;
	}

	@Override
	public String toString() {
		return "Fare{" + "id=" + id + ", price='" + price + '\'' + ", routeId=" + routeId + ", stopId='" + stopId
				+ ", ticketAvailable='" + ticket_available + '}';
	}
}
