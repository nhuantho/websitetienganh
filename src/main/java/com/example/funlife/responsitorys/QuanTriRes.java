package com.example.funlife.responsitorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.funlife.models.QuanTri;

public interface QuanTriRes extends JpaRepository<QuanTri, String>{
	@Query(value = "SELECT * FROM websitetienganh.quan_tri WHERE tai_khoan = :username AND mat_khau = :password", nativeQuery = true)
	public List<QuanTri> CheckUser(String username, String password);
}
