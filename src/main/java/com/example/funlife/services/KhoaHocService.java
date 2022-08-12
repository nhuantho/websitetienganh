package com.example.funlife.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.funlife.models.KhoaHoc;
import com.example.funlife.responsitorys.KhoaHocRes;

@Service
public class KhoaHocService {
	private KhoaHocRes res;
	
	public KhoaHoc Add(KhoaHoc khoaHoc) {
		return res.save(khoaHoc);
	}
	
	public List<KhoaHoc> Adds(List<KhoaHoc> khoaHocs) {
		return res.saveAll(khoaHocs);
	}
	
	public List<KhoaHoc> GetAll(){
		return res.findAll();
	}
	
	public String Delete(String maKHoc) {
		res.deleteById(maKHoc);
		return "delete by " + maKHoc;
	}
	
	public KhoaHoc Update(KhoaHoc khoaHoc) {
		KhoaHoc e = res.findById(khoaHoc.getMaKHoc()).orElse(null);
		e.setTenKHoc(khoaHoc.getTenKHoc());
		e.setLoaiKHoc(khoaHoc.getLoaiKHoc());
		e.setDiem(khoaHoc.getDiem());
		e.setDonGia(khoaHoc.getDonGia());
		e.setMoTa(khoaHoc.getMoTa());
		return res.save(e);
	}
}
