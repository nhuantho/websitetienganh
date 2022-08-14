package com.example.funlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.funlife.models.TinTuc;
import com.example.funlife.responsitorys.TinTucRes;

@Service
public class TinTucService {
	@Autowired
	private TinTucRes res;
	
	public TinTuc Add (TinTuc tinTuc) {
		return res.save(tinTuc);
	}
	
	public List<TinTuc> Adds(List<TinTuc> tinTucs) {
		return res.saveAll(tinTucs);
	}
	
	public List<TinTuc> GetAll(){
		return res.findAll();
	}
	
	public String Delete(String maTTuc) {
		res.deleteById(maTTuc);
		return "delete by " + maTTuc;
	}
	
	public TinTuc Update(TinTuc tinTuc) {
		TinTuc e = res.findById(tinTuc.getMaTTuc()).orElse(null);
		e.setTenTTuc(tinTuc.getTenTTuc());
		e.setNoiDung(tinTuc.getNoiDung());
		return res.save(e);
	}
}
