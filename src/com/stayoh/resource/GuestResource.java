package com.stayoh.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stayoh.model.GuestDto;
import com.stayoh.serviceimpl.GuestServiceDaoImpl;

@Path("/guest")
public class GuestResource {
	
	@GET
	@Path("/allGuest")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    @Produces(MediaType.APPLICATION_JSON)
	public GuestDto getAllGuest(){
		GuestDto guestDto = new GuestDto();
		GuestServiceDaoImpl guestServiceDaoImpl = new GuestServiceDaoImpl();
		guestDto = guestServiceDaoImpl.getAllGuest();
		System.out.println("guest dto : "+guestDto);
		return guestDto;
	}
}
