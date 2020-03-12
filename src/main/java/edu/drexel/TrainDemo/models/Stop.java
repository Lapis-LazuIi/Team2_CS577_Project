package edu.drexel.TrainDemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String name;
	private double lat;
	private double lon;
	private String external_Url;

	protected Stop() {
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getLat() {
		return lat;
	}

	public double getLon() {
		return lon;
	}

	public String getExternalUrl() {
		return external_Url;
	}

	@Override
	public String toString() {
		return "Stop{" + "id=" + id + ", name='" + name + '\'' + ", lat=" + lat + ", lon='" + lon + '\''
				+ ", external_Url=" + external_Url + '}';
	}
}
