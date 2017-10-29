/**
 * 
 */
package com.uday.hotel.model;

/**
 * @author udaybhanuprasad
 *
 */
public class Room {
	private Integer id;
	private RoomType type;
	
	public Room() {
		super();
	}
	
	public Room(Integer id, RoomType type) {
		super();
		this.id = id;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public RoomType getType() {
		return type;
	}
	public void setType(RoomType type) {
		this.type = type;
	}

	public enum RoomType{
		SINGLE,
		DOUBLE,
		TRIPLE;
	}
}
