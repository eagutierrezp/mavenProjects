package org.certificatic.tarjetadigital.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetadigital.model.Tarjeta;

@WebService
public interface TarjetaService {
	
	
	/**
	 * Metodo para crear una tarjeta nueva.
	 * @param tarjeta
	 * @return tarjeta creada
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	/**
	 * Metodo para obtener todas las tarjetas
	 * @return lista de tarjetas
	 */
	
	List<Tarjeta> obtenerTodas();
	

}
