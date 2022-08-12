package com.example.funlife.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.funlife.models.QLCoSoVatChat;
import com.example.funlife.responsitorys.QLCoSoVatChatRes;

@Service
public class QLCoSoVatChatService {
	private QLCoSoVatChatRes res;
	
	public QLCoSoVatChat Add(QLCoSoVatChat qlCoSoVatChat) {
		return res.save(qlCoSoVatChat);
	}
	
	public List<QLCoSoVatChat> Adds(List<QLCoSoVatChat> qlCoSoVatChats) {
		return res.saveAll(qlCoSoVatChats);
	}
	
	public List<QLCoSoVatChat> GetAll(){
		return res.findAll();
	}
}
