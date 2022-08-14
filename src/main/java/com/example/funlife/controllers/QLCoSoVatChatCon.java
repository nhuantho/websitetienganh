package com.example.funlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.QLCoSoVatChat;
import com.example.funlife.services.QLCoSoVatChatService;

@RestController
@CrossOrigin("https://localhost:3000/")
public class QLCoSoVatChatCon {
	@Autowired
	private QLCoSoVatChatService service;
	
	@PostMapping("/addQLCSVC")
	public QLCoSoVatChat Add(@RequestBody QLCoSoVatChat qlCoSoVatChat) {
		return service.Add(qlCoSoVatChat);
	}
	
	@PostMapping("/addQLCSVCs")
	public List<QLCoSoVatChat> Adds(@RequestBody List<QLCoSoVatChat> qlCoSoVatChats) {
		return service.Adds(qlCoSoVatChats);
	}
	
	@GetMapping("/getAllQLCSVC")
	public List<QLCoSoVatChat> GetAll(){
		return service.GetAll();
	}
}
