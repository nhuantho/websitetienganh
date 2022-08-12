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
@Table(name = "QLTinTuc")
public class QLTinTuc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "thoiGian", nullable = false)
	private int thoiGian;
	
	@Column(name = "maQT", nullable = false)
	private String maQT;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maQT", foreignKey = @ForeignKey(name = "FK_QLTinTuc_QuanTri"), insertable = false, updatable = false)
	private QuanTri quanTri;
	
	@Column(name = "maTTuc", nullable = false)
	private String maTTuc;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maTTuc", foreignKey = @ForeignKey(name = "FK_QLTinTuc_TinTuc"), insertable = false, updatable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer"})
	private TinTuc tinTuc;
}
