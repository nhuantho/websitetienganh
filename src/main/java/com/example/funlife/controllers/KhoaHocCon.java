package com.example.funlife.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.KhoaHoc;
import com.example.funlife.services.KhoaHocService;

@RestController
@CrossOrigin("https://localhost:3000/")
public class KhoaHocCon {
	private KhoaHocService service;
	
	@PostMapping("/addKHoc")
	public KhoaHoc Add(@RequestBody KhoaHoc khoaHoc) {
		return service.Add(khoaHoc);
	}
	
	@PostMapping("/addKHocs")
	public List<KhoaHoc> Adds(@RequestBody List<KhoaHoc> khoaHocs) {
		return service.Adds(khoaHocs);
	}
	
	@GetMapping("/getAllKHoc")
	public List<KhoaHoc> GetAll(){
		return service.GetAll();
	}
	
	@DeleteMapping("/deleteKHoc/{maKHoc}")
	public String Delete(@PathVariable String maKHoc) {
		return service.Delete(maKHoc);
	}
	
	@PutMapping("/updateKHoc")
	public KhoaHoc update(@RequestBody KhoaHoc khoaHoc) {
		return service.Update(khoaHoc);
	}
}
