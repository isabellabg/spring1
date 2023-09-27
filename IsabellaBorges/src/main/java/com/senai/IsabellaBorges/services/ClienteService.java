package com.senai.IsabellaBorges.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.IsabellaBorges.entities.Cliente;
import com.senai.IsabellaBorges.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private final ClienteRepository  clienterepository;
	
	public ClienteService (ClienteRepository clienterepository) {
		this.clienterepository = clienterepository;
	}
	
	public Cliente saveCliente (Cliente cliente) {
		return clienterepository.save(cliente);
	}
	
	public Cliente getCliente (Long idccliente) {
		return clienterepository.findById(idccliente).orElse(null);
	}
	public List<Cliente> getAllCliente() {
		return clienterepository.findAll();
	}
	public void deleteCliente(Long idcCliente) {
		clienterepository.deleteById(idcCliente);
	}
	public List<Cliente> getAllClientes() {
		return null;
	}
}
	
