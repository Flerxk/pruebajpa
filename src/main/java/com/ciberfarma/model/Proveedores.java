package com.ciberfarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_proveedor")
public class Proveedores {
	@Id
	private int idproveedor ;
	private String nombre_rs;
	private String telefono;
	private String email;
}
