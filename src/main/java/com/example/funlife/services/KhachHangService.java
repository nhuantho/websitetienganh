package com.example.funlife.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.funlife.models.KhachHang;
import com.example.funlife.responsitorys.KhachHangRes;

@Service
public class KhachHangService {
	private KhachHangRes res;
	
	public KhachHang Add(KhachHang khachHang) {
		return res.save(khachHang);
	}
	
	public List<KhachHang> Adds(List<KhachHang> khachHangs) {
		return res.saveAll(khachHangs);
	}
	
	public List<KhachHang> GetAll(){
		return res.findAll();
	}
	
	public String Delete(String maKHang) {
		res.deleteById(maKHang);
		return "delete by " + maKHang;
	}
	
	public KhachHang Update(KhachHang khachHang) {
		KhachHang e = res.findById(khachHang.getMaKHang()).orElse(null);
		e.setGhiChu(khachHang.getGhiChu());
		return res.save(e);
	}
}
