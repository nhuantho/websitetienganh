package com.example.funlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.KhachHang;
import com.example.funlife.services.KhachHangService;

@RestController
@CrossOrigin("https://localhost:3000/")
public class KhachHangCon {
	@Autowired
	private KhachHangService service;
	
	@PostMapping("/addKHang")
	public KhachHang Add(@RequestBody KhachHang khachHang) {
		return service.Add(khachHang);
	}
	
	@PostMapping("/addKHangs")
	public List<KhachHang> Adds(@RequestBody List<KhachHang> khachHangs) {
		return service.Adds(khachHangs);
	}
	
	@GetMapping("/getAllKHang")
	public List<KhachHang> GetAll(){
		return service.GetAll();
	}
	
	@DeleteMapping("/deleteKHang/{maKHang}")
	public String Delete(@PathVariable String maKHang) {
		return service.Delete(maKHang);
	}
	
	@PutMapping("/updateKHang")
	public KhachHang update(@RequestBody KhachHang khachHang) {
		return service.Update(khachHang);
	}
}
