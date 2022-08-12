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

import com.example.funlife.models.TrungTam;
import com.example.funlife.services.TrungTamService;

@RestController
@CrossOrigin("https://localhost:3000/")
public class TrungTamCon {
	private TrungTamService service;
	
	@PostMapping("/addTTam")
	public TrungTam Add(@RequestBody TrungTam trungTam) {
		return service.Add(trungTam);
	}
	
	@PostMapping("/addTTams")
	public List<TrungTam> Adds(@RequestBody List<TrungTam> trungTams) {
		return service.Adds(trungTams);
	}
	
	@GetMapping("/getAllTTam")
	public List<TrungTam> GetAll(){
		return service.GetAll();
	}
	
	@DeleteMapping("/deleteTTam/{maTTam}")
	public String Delete(@PathVariable String maTTam) {
		return service.Delete(maTTam);
	}
	
	@PutMapping("/updateTTam")
	public TrungTam update(@RequestBody TrungTam trungTam) {
		return service.Update(trungTam);
	}
}
