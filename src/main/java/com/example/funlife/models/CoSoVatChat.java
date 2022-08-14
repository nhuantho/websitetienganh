package com.example.funlife.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CoSoVatChat")
public class CoSoVatChat {
	@Id
	@Column(name = "maVT", nullable = false)
	private String maVT;
	@Column(name = "tenVT", nullable = false)
	private String tenVT;
	@Column(name = "moTa", nullable = false)
	private String moTa;
	@Column(name = "hinhAnh", nullable = true)
	private String hinhAnh;
	
	@JsonIgnore
	@OneToMany(mappedBy = "maVT", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<QLCoSoVatChat> qlCoSoVatChats = new ArrayList<>();
}
