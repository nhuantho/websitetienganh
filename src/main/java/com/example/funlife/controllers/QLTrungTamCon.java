package com.example.funlife.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.QLTrungTam;
import com.example.funlife.services.QLTrungTamService;

@RestController
@CrossOrigin("https://localhost:3000/")
public class QLTrungTamCon {
	private QLTrungTamService service;
	
	@PostMapping("/addQLTTam")
	public QLTrungTam Add(@RequestBody QLTrungTam qlTrungTam) {
		return service.Add(qlTrungTam);
	}
	
	@PostMapping("/addQLTTams")
	public List<QLTrungTam> Adds(@RequestBody List<QLTrungTam> qlTrungTams) {
		return service.Adds(qlTrungTams);
	}
	
	@GetMapping("/getAllQLTTam")
	public List<QLTrungTam> GetAll(){
		return service.GetAll();
	}
}
