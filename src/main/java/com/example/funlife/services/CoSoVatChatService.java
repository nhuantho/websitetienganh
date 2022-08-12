package com.example.funlife.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.funlife.models.CoSoVatChat;
import com.example.funlife.responsitorys.CoSoVatChatRes;

@Service
public class CoSoVatChatService {
	private CoSoVatChatRes res;
	
	public CoSoVatChat Add(CoSoVatChat coSoVatChat) {
		return res.save(coSoVatChat);
	}
	
	public List<CoSoVatChat> Adds(List<CoSoVatChat> coSoVatChats) {
		return res.saveAll(coSoVatChats);
	}
	
	public List<CoSoVatChat> GetAll(){
		return res.findAll();
	}
	
	public String Delete(String maVT) {
		res.deleteById(maVT);
		return "delete by " + maVT;
	}
	
	public CoSoVatChat Update(CoSoVatChat coSoVatChat) {
		CoSoVatChat e = res.findById(coSoVatChat.getMaVT()).orElse(null);
		e.setTenVT(coSoVatChat.getTenVT());
		e.setGia(coSoVatChat.getGia());
		return res.save(e);
	}
}
