package com.LoginLogoutExample.service.interfaces;

import java.util.List;

import com.LoginLogoutExample.entity.AdminDetail;

public interface AdminService {

	public int saveAdminDetail(AdminDetail adminDetail);
	
	public int adminLogin(String emailId , String password);
	
	public List<AdminDetail> getAdminData();
}
