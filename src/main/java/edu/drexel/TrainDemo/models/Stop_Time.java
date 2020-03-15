package edu.drexel.TrainDemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stop_Time {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String stop_id;
	private Long trip_id;
	private int stop_sequence;
	private String arrival_time;
	private String departure_time;
	private int pickup_type;
	private int dropoff_type;

	protected Stop_Time() {
	}

	public String stopId() {
		return stop_id;
	}

	public Long tripId() {
		return trip_id;
	}

	public int stopSequence() {
		return stop_sequence;
	}

	public String arrivalTime() {
		return arrival_time;
	}

	public String depatrureTime() {
		return departure_time;
	}

	private int pickupType() {
		return pickup_type;
	}

	private int dropoffType() {
		return dropoff_type;
	}

	@Override
	public String toString() {
		return "Stop_Time{" + "stop_id=" + stop_id + ", trip_id='" + trip_id + '\'' + ", stop_sequence=" + stop_sequence
				+ ", arrival_time=" + arrival_time + '\'' + ", departure_time=" + departure_time + '\''
				+ ", pickup_type=" + pickup_type + '\'' + ", dropoff_type=" + dropoff_type + '}';
	}
}
