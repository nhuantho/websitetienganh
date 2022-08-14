package com.example.funlife.responsitorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.funlife.models.KhoaHoc;

public interface KhoaHocRes extends JpaRepository<KhoaHoc, String>{
	@Query(value = "SELECT * FROM websitetienganh.khoa_hoc WHERE loaikhoc = :loaiKHoc", nativeQuery = true)
	public List<KhoaHoc> Check(String loaiKHoc);
}
