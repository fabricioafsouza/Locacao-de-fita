package br.com.kca.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kca.api.dto.ClienteShowDTO;
import br.com.kca.api.mapper.MapStructClienteMapper;
import br.com.kca.api.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Override
	public List<ClienteShowDTO> listar() {
		
		return null;
	}
	
	private ClienteRepository clienteRepository;
	private MapStructClienteMapper mapper;
	
	@Autowired
	public ClienteServiceImpl(ClienteRepository clienteRepository, MapStructClienteMapper mapper) {
		
		this.clienteRepository = clienteRepository;
		this.mapper = mapper;
	}

}
