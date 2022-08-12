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
@Table(name = "TinTuc")
public class TinTuc {
	@Id
	@Column(name = "maTTuc", nullable = false)
	private String maTTuc;
	@Column(name = "tenTTuc", nullable = false)
	private String tenTTuc;
	@Column(name = "noiDung", nullable = false)
	private String noiDung;
	@Column(name = "hinhAnh", nullable = true)
	private String hinhAnh;
	
	@JsonIgnore
	@OneToMany(mappedBy = "maTTuc", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<QLTinTuc> qlTinTucs = new ArrayList<>();
}
