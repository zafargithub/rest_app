package com.stayoh.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.stayoh.bean.Guest;

@XmlType(name = "", propOrder = {"guestDto"})
@XmlRootElement(name = "GuestDto")
public class GuestDto {
	@XmlElement(name = "guests")
	List<Guest> guestDto = null;
	public List<Guest> getAllGuest(){
		if(guestDto == null){
			guestDto = new ArrayList<Guest>();
		}
		return guestDto;
	}
}
