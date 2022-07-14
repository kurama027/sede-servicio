package com.formacionbdi.spring.app.sede.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tax_grupo")
public class grupo {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_GRUPO")
	private long ID_GRUPO;
	@Column(name = "NU_GRUPO")
	private String NU_GRUPO; 
	@Column(name = "ID_DELEGADO")
	private Long ID_DELEGADO; 
	@ManyToOne()
	@JoinColumn(name="ID_GRU_CI")
	private ciclo cic;
	public long getID_GRUPO() {
		return ID_GRUPO;
	}
	public void setID_GRUPO(long iD_GRUPO) {
		ID_GRUPO = iD_GRUPO;
	}
	public String getNU_GRUPO() {
		return NU_GRUPO;
	}
	public void setNU_GRUPO(String nU_GRUPO) {
		NU_GRUPO = nU_GRUPO;
	}
	public Long getID_DELEGADO() {
		return ID_DELEGADO;
	}
	public void setID_DELEGADO(Long iD_DELEGADO) {
		ID_DELEGADO = iD_DELEGADO;
	}
	public ciclo getCic() {
		return cic;
	}
	public void setCic(ciclo cic) {
		this.cic = cic;
	} 


}
