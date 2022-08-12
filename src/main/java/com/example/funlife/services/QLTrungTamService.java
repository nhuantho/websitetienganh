package com.example.funlife.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.funlife.models.QLTrungTam;
import com.example.funlife.responsitorys.QLTrungTamRes;

@Service
public class QLTrungTamService {
	private QLTrungTamRes res;
	
	public QLTrungTam Add(QLTrungTam qlTrungTam) {
		return res.save(qlTrungTam);
	}
	
	public List<QLTrungTam> Adds(List<QLTrungTam> qlTrungTams) {
		return res.saveAll(qlTrungTams);
	}
	
	public List<QLTrungTam> GetAll(){
		return res.findAll();
	}
}
