package org.certificatic.tarjetadigital.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetadigital.model.Tarjeta;
import org.certificatic.tarjetadigital.repository.TarjetaRepository;
import org.certificatic.tarjetadigital.repository.TarjetaRepositoryImpl;

@WebService(endpointInterface = "org.certificatic.tarjetadigital.service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService{

	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		return tarjetaRepository.obtenerTodas();
	}

}
