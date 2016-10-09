package com.stayoh.service;

import com.stayoh.model.GuestDto;

public interface GuestServiceDao {
	public String insertGuest();
	public GuestDto getAllGuest();
	public GuestDto getGuest(int guestId);
	public String updateGuest();
	public String deleteGuest();
}
