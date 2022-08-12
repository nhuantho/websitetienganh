package com.example.funlife.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.funlife.models.QLTinTuc;
import com.example.funlife.responsitorys.QLTinTucRes;

@Service
public class QLTinTucService {
	private QLTinTucRes res;
	
	public QLTinTuc Add(QLTinTuc qlTinTuc) {
		return res.save(qlTinTuc);
	}
	
	public List<QLTinTuc> Adds(List<QLTinTuc> qlTinTucs) {
		return res.saveAll(qlTinTucs);
	}
	
	public List<QLTinTuc> GetAll(){
		return res.findAll();
	}
}
