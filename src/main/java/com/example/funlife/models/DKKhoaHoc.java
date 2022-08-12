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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DKKhoaHoc")
public class DKKhoaHoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "thoiGian", nullable = false)
	private String thoiGian;
	@Column(name = "xacNhan", nullable = false)
	private int xacNhan;
	
	@Column(name = "maKHang", nullable = false)
	private String maKHang;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maKHang", foreignKey = @ForeignKey(name = "FK_DKKhoaHoc_KhachHang"), insertable = false, updatable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer"})
	private KhachHang khachHang;
	
	@Column(name = "maKHoc", nullable = false)
	private String maKHoc;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maKHoc", foreignKey = @ForeignKey(name = "FK_DKKhoaHoc_KhoaHoc"), insertable = false, updatable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer"})
	private KhoaHoc khoaHoc;
	
}
