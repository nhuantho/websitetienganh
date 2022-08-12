package com.example.funlife.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.funlife.models.DKKhoaHoc;
import com.example.funlife.responsitorys.DKKhoaHocRes;

@Service
public class DKKhoaHocService {
	private DKKhoaHocRes res;
	
	public DKKhoaHoc Add(DKKhoaHoc dkKhoaHoc) {
		return res.save(dkKhoaHoc);
	}
	
	public List<DKKhoaHoc> Adds(List<DKKhoaHoc> dKhoaHocs) {
		return res.saveAll(dKhoaHocs);
	}
	
	public List<DKKhoaHoc> GetAll(){
		return res.findAll();
	}
	
	public String Delete(int id) {
		res.deleteById(id);
		return "delete by " + id;
	}

}
