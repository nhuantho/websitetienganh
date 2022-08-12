package com.example.funlife.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "QLKhachHang")
public class QLKhachHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "thongTinSua", nullable = false)
	private String thongTinSua;
	@Column(name = "thoiGian", nullable = false)
	private String thoiGian;
	@Column(name = "xacNhan", nullable = false)
	private int xacNhan;
	@Column(name = "ghiChu", nullable = true)
	private String ghiChu;
	
	@Column(name = "maQT", nullable = false)
	private String maQT;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maQT", foreignKey = @ForeignKey(name = "FK_QLKhachHang_QuanTri"), insertable = false, updatable = false)
	private QuanTri quanTri;
	
	@Column(name = "maKHang", nullable = false)
	private String maKHang;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maKHang", foreignKey = @ForeignKey(name = "FK_QLKhachHang_KhachHang"), insertable = false, updatable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer"})
	private KhachHang khachHang;
}
