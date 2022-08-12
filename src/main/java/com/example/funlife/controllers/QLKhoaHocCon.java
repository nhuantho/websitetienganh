package com.example.funlife.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.QLKhoaHoc;
import com.example.funlife.services.QLKhoaHocService;

@RestController
@CrossOrigin("https://localhost:3000/")
public class QLKhoaHocCon {
	private QLKhoaHocService service;
	
	@PostMapping("/addQLKHoc")
	public QLKhoaHoc Add(@RequestBody QLKhoaHoc qlKhoaHoc) {
		return service.Add(qlKhoaHoc);
	}
	
	@PostMapping("/addQLKHocs")
	public List<QLKhoaHoc> Adds(@RequestBody List<QLKhoaHoc> qlKhoaHocs) {
		return service.Adds(qlKhoaHocs);
	}
	
	@GetMapping("/getAllQLKHoc")
	public List<QLKhoaHoc> GetAll(){
		return service.GetAll();
	}
}
