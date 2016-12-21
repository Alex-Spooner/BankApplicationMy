package com.luxoft.bankapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.luxoft.bankapp.exceptions.ClientExistsException;

public class Bank implements Report, Serializable {

	private List<Client> clients = new ArrayList<>();

	public List<Client> getClients() {
		return clients;
	}

	public void addClient(Client c) throws ClientExistsException {
		if (!checkIfClientExists(c)) {
			clients.add(c);
		} else {
			throw new ClientExistsException();
		}
	}

	public void removeClient(Client c) {
		clients.remove(c);
	}

	@Override
	public void printReport() {
		for (Client c : clients) {
			c.printReport();
		}

	}

	public boolean checkIfClientExists(Client client) {
		for (Client c : clients) {
			if (c.getName().equals(client.getName())) {
				return true;
			}
		}
		return false;
	}

	public Bank() {
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Bank{");
		for(Client client : clients) sb.append("client=").append(client.toString());
		sb.append('}');
		return sb.toString();
	}
}
