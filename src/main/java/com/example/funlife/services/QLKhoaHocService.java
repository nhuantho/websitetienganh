package com.example.funlife.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.funlife.models.QLKhoaHoc;
import com.example.funlife.responsitorys.QLKhoaHocRes;

@Service
public class QLKhoaHocService {
	private QLKhoaHocRes res;
	
	public QLKhoaHoc Add(QLKhoaHoc qlKhoaHoc) {
		return res.save(qlKhoaHoc);
	}
	
	public List<QLKhoaHoc> Adds(List<QLKhoaHoc> qlKhoaHocs) {
		return res.saveAll(qlKhoaHocs);
	}
	
	public List<QLKhoaHoc> GetAll(){
		return res.findAll();
	}
}
