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
@Table(name = "KhoaHoc")
public class KhoaHoc {
	@Id
	@Column(name = "maKHoc", nullable = false)
	private String maKHoc;
	@Column(name = "tenKHoc", nullable = false)
	private String tenKHoc;
	@Column(name = "loaiKHoc", nullable = false)
	private String loaiKHoc;
	@Column(name = "diem", nullable = false)
	private float diem;
	@Column(name = "donGia", nullable = false)
	private int donGia;
	@Column(name = "hinhAnh", nullable = true)
	private String hinhAnh;
	@Column(name = "moTa", nullable = false)
	private String moTa;
	
	@JsonIgnore
	@OneToMany(mappedBy = "maKHoc", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<DKKhoaHoc> dkKhoaHocs = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "maKHoc", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<QLKhoaHoc> qlKhoaHocs = new ArrayList<>();
}
