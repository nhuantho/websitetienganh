package com.example.funlife.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.funlife.models.TrungTam;
import com.example.funlife.responsitorys.TrungTamRes;

@Service
public class TrungTamService {
	private TrungTamRes res;
	
	public TrungTam Add(TrungTam trungTam) {
		return res.save(trungTam);
	}
	
	public List<TrungTam> Adds(List<TrungTam> trungTams) {
		return res.saveAll(trungTams);
	}
	
	public List<TrungTam> GetAll(){
		return res.findAll();
	}
	
	public String Delete(String maTTam) {
		res.deleteById(maTTam);
		return "delete by " + maTTam;
	}
	
	public TrungTam Update(TrungTam trungTam) {
		TrungTam e = res.findById(trungTam.getMaTTam()).orElse(null);
		e.setTenTTam(trungTam.getTenTTam());
		e.setDiaChi(trungTam.getDiaChi());
		e.setSoDT(trungTam.getSoDT());
		e.setMoTa(trungTam.getMoTa());
		return res.save(e);
	}
}
