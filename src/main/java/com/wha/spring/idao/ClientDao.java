package com.wha.spring.idao;

<<<<<<< HEAD

=======
>>>>>>> 73ae4fb8b947c936ed8eafca31016fdf211b7920
import java.util.List;

import com.wha.spring.model.Client;
import com.wha.spring.model.Conseiller;

public interface ClientDao {
		
	Client saveClient(Client client);

	void updateClient(Client client);

	void deleteClient(int id);
	
	Client findById(int id);
	
	public List<Client> findAllClients();


	void reaffectationClient(Client client, Conseiller conseiller);

<<<<<<< HEAD
	//void modifDecouvert(int idCompte, int montant);
	
=======
	Client getByName(String nom);


>>>>>>> 73ae4fb8b947c936ed8eafca31016fdf211b7920
}


