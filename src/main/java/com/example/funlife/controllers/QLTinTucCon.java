package com.example.funlife.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.QLTinTuc;
import com.example.funlife.services.QLTinTucService;

@RestController
@CrossOrigin("https://localhost:3000/")
public class QLTinTucCon {
	private QLTinTucService service;
	
	@PostMapping("/addQLTTuc")
	public QLTinTuc Add(@RequestBody QLTinTuc qlTinTuc) {
		return service.Add(qlTinTuc);
	}
	
	@PostMapping("/addQLTTucs")
	public List<QLTinTuc> Adds(@RequestBody List<QLTinTuc> qlTinTucs) {
		return service.Adds(qlTinTucs);
	}
	
	@GetMapping("/getAllQLTTuc")
	public List<QLTinTuc> GetAll(){
		return service.GetAll();
	}
}
