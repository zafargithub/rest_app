package com.stayoh.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.stayoh.bean.Guest;
import com.stayoh.model.GuestDto;
import com.stayoh.service.GuestServiceDao;
import com.stayoh.util.DBUtil;

public class GuestServiceDaoImpl implements GuestServiceDao{
	public String insertGuest() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public GuestDto getAllGuest() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		GuestDto guestDto = new GuestDto();
		Guest guest = null;
		try{
			/*String allGuestSql = "";
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(allGuestSql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				guest = new Guest();
				guest.setGuestId(rs.getInt(0));
				guest.setGuestName(rs.getString(1));
				guest.setRoomNumber(rs.getString(2));
				guest.setGuestMobile(rs.getString(3));
				guest.setGuestCheckInOutDate(rs.getString(4));
				guest.setGuestGender(rs.getString(5));
				guestDto.getAllGuest().add(guest);
			}*/
			for (int count = 0; count < 2; count++) {
				guest = new Guest();
				guest.setGuestId(101);
				guest.setGuestName("Zafar Khan");
				guest.setRoomNumber("R101");
				guest.setGuestMobile("8147143710");
				guest.setGuestCheckInOutDate("07-10-2016 10:00 AM - 07-10-2016 10:00 PM");
				guest.setGuestGender("Male");
				guestDto.getAllGuest().add(guest);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return guestDto;
	}
	
	public GuestDto getGuest(int guestId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String updateGuest() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String deleteGuest() {
		// TODO Auto-generated method stub
		return null;
	}
}
