package com.example.funlife.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.QLKhachHang;
import com.example.funlife.services.QLKhachHangService;

@RestController
@CrossOrigin("https://localhost:3000/")
public class QLKhachHangCon {
	private QLKhachHangService service;
	
	@PostMapping("/addQLKHang")
	public QLKhachHang Add(@RequestBody QLKhachHang qlKhachHang) {
		return service.Add(qlKhachHang);
	}
	
	@PostMapping("/addQLKHangs")
	public List<QLKhachHang> Adds(@RequestBody List<QLKhachHang> qlKhachHangs) {
		return service.Adds(qlKhachHangs);
	}
	
	@GetMapping("/getAllQLKHang")
	public List<QLKhachHang> GetAll(){
		return service.GetAll();
	}
}
