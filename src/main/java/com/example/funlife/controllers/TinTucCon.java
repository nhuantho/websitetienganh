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

import com.example.funlife.models.TinTuc;
import com.example.funlife.services.TinTucService;

@RestController
@CrossOrigin("https://localhost:3000/")
public class TinTucCon {
	private TinTucService service;
	
	@PostMapping("/addTTuc")
	public TinTuc Add(@RequestBody TinTuc tinTuc) {
		return service.Add(tinTuc);
	}
	
	@PostMapping("/addTTucs")
	public List<TinTuc> Adds(@RequestBody List<TinTuc> tinTucs) {
		return service.Adds(tinTucs);
	}
	
	@GetMapping("/getAllTTuc")
	public List<TinTuc> GetAll(){
		return service.GetAll();
	}
	
	@DeleteMapping("/deleteTTuc/{maTTuc}")
	public String Delete(@PathVariable String maTTuc) {
		return service.Delete(maTTuc);
	}
	
	@PutMapping("/updateTTuc")
	public TinTuc update(@RequestBody TinTuc tinTuc) {
		return service.Update(tinTuc);
	}
}
