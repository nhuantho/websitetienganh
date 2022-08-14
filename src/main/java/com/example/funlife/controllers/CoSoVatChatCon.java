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

import com.example.funlife.models.CoSoVatChat;
import com.example.funlife.services.CoSoVatChatService;

@RestController
@CrossOrigin("https://localhost:3000/")
public class CoSoVatChatCon {
	@Autowired
	private CoSoVatChatService service;
	
	@PostMapping("/addCSVC")
	public CoSoVatChat Add(@RequestBody CoSoVatChat coSoVatChat) {
		return service.Add(coSoVatChat);
	}
	
	@PostMapping("/addCSVCs")
	public List<CoSoVatChat> Adds(@RequestBody List<CoSoVatChat> coSoVatChats) {
		return service.Adds(coSoVatChats);
	}
	
	@GetMapping("/getAllCSVC")
	public List<CoSoVatChat> GetAll(){
		return service.GetAll();
	}
	
	@DeleteMapping("/deleteCSVC/{maVT}")
	public String Delete(@PathVariable String maVT) {
		return service.Delete(maVT);
	}
	
	@PutMapping("/updateCSVC")
	public CoSoVatChat update(@RequestBody CoSoVatChat coSoVatChat) {
		return service.Update(coSoVatChat);
	}
}
