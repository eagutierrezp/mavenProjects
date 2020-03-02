package org.certificatic.tarjetadigital.repository;

import java.util.List;

import org.certificatic.tarjetadigital.model.Tarjeta;

public interface TarjetaRepository {
	
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
