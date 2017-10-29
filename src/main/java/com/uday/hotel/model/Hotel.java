/**
 * 
 */
package com.uday.hotel.model;

import java.util.Set;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.uday.hotel.utility.ObjectIdJsonSerializer;

/**
 * @author udaybhanuprasad
 *
 */
@Document(collection="hotel")
public class Hotel {
	@Id
	@JsonSerialize(using = ObjectIdJsonSerializer.class)
	private ObjectId id;
	private String name;
	@JsonDeserialize(as=Address.class)
	private Address address;
	private String phoneNumber;
	private Double rating;
	private Set<Room> rooms;
	
	public Hotel() {
		super();
	}
	
	public Hotel(String name, Address address, String phoneNumber, Double rating) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.rating = rating;
	}
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Set<Room> getRooms() {
		return rooms;
	}
	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", rating=" + rating + ", rooms=" + rooms + "]";
	}
	
	
}
