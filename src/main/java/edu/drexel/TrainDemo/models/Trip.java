package edu.drexel.TrainDemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long route_id;
	private Long calendar_id;
	private String headsign;
	private DirectionType direction;

	protected Trip() {
	}

	public Long getId() {
		return id;
	}

	public Long getroute_id() {
		return route_id;
	}

	public Long getcalendar_id() {
		return calendar_id;
	}

	public String getheadsign() {
		return headsign;
	}

	public DirectionType getDirectionType() {
		return direction;
	}

	@Override
	public String toString() {
		return "Trip{" + "id=" + id + ", route_id='" + route_id + '\'' + ", calendar_id=" + calendar_id + ", headsign='"
				+ headsign + '\'' + ", direction=" + direction + '}';
	}
}
