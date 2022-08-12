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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "QuanTri")
public class QuanTri {
	@Id
	@Column(name = "maQT", nullable = false)
	private String maQT;
	@Column(name = "tenQT", nullable = false)
	private String tenQT;
	@Column(name = "diaChi", nullable = false)
	private String diaChi;
	@Column(name = "soDT", nullable = false)
	private String soDT;
	@Column(name = "taiKhoan", nullable = false, unique = true)
	private String taiKhoan;
	@Column(name = "matKhau", nullable = false)
	private String matKhau;
	@Column(name = "hinhAnh", nullable = true)
	private String hinhAnh;
	
	@OneToMany(mappedBy = "maQT", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<QLCoSoVatChat> qlCoSoVatChats = new ArrayList<>();
	
	@OneToMany(mappedBy = "maQT", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<QLKhachHang> qlKhachHangs = new ArrayList<>();
	
	@OneToMany(mappedBy = "maQT", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<QLKhoaHoc> qlKhoaHocs = new ArrayList<>();
	
	@OneToMany(mappedBy = "maQT", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<QLTinTuc> qlTinTucs = new ArrayList<>();
	
	@OneToMany(mappedBy = "maQT", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<QLTrungTam> qlTrungTams = new ArrayList<>();
}
