/**
 * 
 */
package com.uday.hotel.model;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author udaybhanuprasad
 *
 */
@Document(collection="reservation")
public class Reservation {
	private ObjectId id;
	private ObjectId hotelId;
	private Integer roomId;
	private ZonedDateTime checkinDateTime;
	private ZonedDateTime checkoutDateTime;
	@CreatedDate
	private ZonedDateTime createdDateTime = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("US/Pacific"));
	@LastModifiedDate
	private ZonedDateTime lastModifiedDate = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("US/Pacific"));
	
	public Reservation() {
		super();
	}
	
	public Reservation(ObjectId hotelId, Integer roomId, ZonedDateTime checkinDateTime,
			ZonedDateTime checkoutDateTime) {
		super();
		this.hotelId = hotelId;
		this.roomId = roomId;
		this.checkinDateTime = checkinDateTime;
		this.checkoutDateTime = checkoutDateTime;
	}
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public ObjectId getHotelId() {
		return hotelId;
	}
	public void setHotelId(ObjectId hotelId) {
		this.hotelId = hotelId;
	}
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public ZonedDateTime getCheckinDateTime() {
		return checkinDateTime;
	}
	public void setCheckinDateTime(ZonedDateTime checkinDateTime) {
		this.checkinDateTime = checkinDateTime;
	}
	public ZonedDateTime getCheckoutDateTime() {
		return checkoutDateTime;
	}
	public void setCheckoutDateTime(ZonedDateTime checkoutDateTime) {
		this.checkoutDateTime = checkoutDateTime;
	}
	public ZonedDateTime getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(ZonedDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public ZonedDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(ZonedDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", hotelId=" + hotelId + ", roomId=" + roomId + ", checkinDateTime="
				+ checkinDateTime + ", checkoutDateTime=" + checkoutDateTime + ", createdDateTime=" + createdDateTime
				+ ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	
	
}
