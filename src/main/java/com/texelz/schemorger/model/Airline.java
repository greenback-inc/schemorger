package com.texelz.schemorger.model;

/**
 *
 * An organization that provides flights for passengers.
 * @fullPath Thing > Organization > Airline
 *
 * @author Texelz (by Onhate)
 *
 */
public class Airline extends Organization {

	private String iataCode;
	/**
	 * IATA identifier for an airline or airport
	 */
	public String getIataCode() {
		return this.iataCode;
	}
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
}