package com.example.funlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.QuanTri;
import com.example.funlife.services.QuanTriService;

@RestController
@CrossOrigin("https://localhost:3000/")
public class QuanTriCon {
	@Autowired
	private QuanTriService service;
	
	@PostMapping("/addQT")
	public QuanTri Add(@RequestBody QuanTri quanTri) {
		return service.Add(quanTri);
	}
	
	@PostMapping("/addQTs")
	public List<QuanTri> Adds(@RequestBody List<QuanTri> quanTris) {
		return service.Adds(quanTris);
	}
	
	@GetMapping("/getAllQT")
	public List<QuanTri> GetAll(){
		return service.GetAll();
	}
	
	@PostMapping(path = "/checkUser")
	public List<QuanTri> CheckUser(@RequestBody QuanTri quanTri){
		return service.CheckUser(quanTri);
	}
	
	@PutMapping("/updateQT")
	public QuanTri update(@RequestBody QuanTri quanTri) {
		return service.Update(quanTri);
	}
}
