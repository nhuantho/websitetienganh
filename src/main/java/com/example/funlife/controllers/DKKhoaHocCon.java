package com.example.funlife.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.DKKhoaHoc;
import com.example.funlife.services.DKKhoaHocService;

@RestController
@CrossOrigin("https://localhost:3000/")
public class DKKhoaHocCon {
	private DKKhoaHocService service;
	
	@PostMapping("/addDKKH")
	public DKKhoaHoc Add(@RequestBody DKKhoaHoc dkKhoaHoc) {
		return service.Add(dkKhoaHoc);
	}
	
	@PostMapping("/addDKKHs")
	public List<DKKhoaHoc> Adds(@RequestBody List<DKKhoaHoc> dkKhoaHocs) {
		return service.Adds(dkKhoaHocs);
	}
	
	@GetMapping("/getAllDKKH")
	public List<DKKhoaHoc> GetAll(){
		return service.GetAll();
	}
	
	@DeleteMapping("/deleteDKKH/{id}")
	public String Delete(@PathVariable int id) {
		return service.Delete(id);
	}
}
