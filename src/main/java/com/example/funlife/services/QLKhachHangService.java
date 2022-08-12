package com.example.funlife.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.funlife.models.QLKhachHang;
import com.example.funlife.responsitorys.QLKhachHangRes;

@Service
public class QLKhachHangService {
	private QLKhachHangRes res;
	
	public QLKhachHang Add(QLKhachHang qlKhachHang) {
		return res.save(qlKhachHang);
	}
	
	public List<QLKhachHang> Adds(List<QLKhachHang> qlKhachHangs) {
		return res.saveAll(qlKhachHangs);
	}
	
	public List<QLKhachHang> GetAll(){
		return res.findAll();
	}
}
