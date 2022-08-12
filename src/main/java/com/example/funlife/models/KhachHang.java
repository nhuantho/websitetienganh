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
@Table(name = "KhachHang")
public class KhachHang {
	@Id
	@Column(name = "maKHang", nullable = false)
	private String maKHang;
	@Column(name = "tenKHang", nullable = false)
	private String tenKHang;
	@Column(name = "diaChi", nullable = false)
	private String diaChi;
	@Column(name = "soDT", nullable = false)
	private String soDT;
	@Column(name = "ghiChu", nullable = true)
	private String ghiChu;
	
	@JsonIgnore
	@OneToMany(mappedBy = "maKHang", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<DKKhoaHoc> dkKhoaHocs = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "maKHang", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<QLKhachHang> qlKhachHangs = new ArrayList<>();
}
