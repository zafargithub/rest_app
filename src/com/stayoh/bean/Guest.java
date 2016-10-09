package com.stayoh.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"guestId", "guestName", "roomNumber", "guestMobile", "guestCheckInOutDate", "guestGender"})
@XmlRootElement(name = "Guest")
public class Guest {
	private String roomNumber;
	private Integer guestId;
	private String guestName;
	private String guestMobile;
	private String guestCheckInOutDate;
	private String guestGender;
	
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Integer getGuestId() {
		return guestId;
	}
	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}
	
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	
	public String getGuestMobile() {
		return guestMobile;
	}
	public void setGuestMobile(String guestMobile) {
		this.guestMobile = guestMobile;
	}
	
	public String getGuestCheckInOutDate() {
		return guestCheckInOutDate;
	}
	public void setGuestCheckInOutDate(String guestCheckInOutDate) {
		this.guestCheckInOutDate = guestCheckInOutDate;
	}
	
	public String getGuestGender() {
		return guestGender;
	}
	public void setGuestGender(String guestGender) {
		this.guestGender = guestGender;
	}
	
	@Override
	public String toString() {
		return "{roomNumber = "+roomNumber+", guestId = "+guestId+
				", guestName = "+guestName+", guestMobile = "+guestMobile+
				", guestCheckInOutDate = "+guestCheckInOutDate+", guestGender = "+guestGender+"}";
	}
}
