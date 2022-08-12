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
@Table(name = "TrungTam")
public class TrungTam {
	@Id
	@Column(name = "maTTam", nullable = false)
	private String maTTam;
	@Column(name = "tenTTam", nullable = false)
	private String tenTTam;
	@Column(name = "diaChi", nullable = false)
	private String diaChi;
	@Column(name = "soDT", nullable = false)
	private String soDT;
	@Column(name = "hinhAnh", nullable = true)
	private String hinhAnh;
	@Column(name = "moTa", nullable = true)
	private String moTa;
	
	@JsonIgnore
	@OneToMany(mappedBy = "maTTam", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<QLTrungTam> qlTrungTams = new ArrayList<>();
}
