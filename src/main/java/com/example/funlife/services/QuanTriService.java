package com.example.funlife.services;

import java.util.List;

import com.example.funlife.models.QuanTri;
import com.example.funlife.responsitorys.QuanTriRes;

public class QuanTriService {
private QuanTriRes res;
	
	public QuanTri Add(QuanTri quanTri) {
		return res.save(quanTri);
	}
	
	public List<QuanTri> Adds(List<QuanTri> quanTris) {
		return res.saveAll(quanTris);
	}
	
	public List<QuanTri> GetAll(){
		return res.findAll();
	}
	
	public List<QuanTri> CheckUser(QuanTri quanTri){
		return res.CheckUser(quanTri.getTaiKhoan(), quanTri.getMatKhau());
	}
	
	public QuanTri Update(QuanTri quanTri) {
		QuanTri e = res.findById(quanTri.getMaQT()).orElse(null);
		e.setTenQT(quanTri.getTenQT());
		e.setDiaChi(quanTri.getDiaChi());
		e.setSoDT(quanTri.getSoDT());
		e.setMatKhau(quanTri.getMatKhau());
		return res.save(e);
	}
}
