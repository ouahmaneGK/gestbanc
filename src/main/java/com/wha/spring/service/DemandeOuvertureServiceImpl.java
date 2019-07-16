
package com.wha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.wha.spring.idao.DemandeOuvertureDao;
import com.wha.spring.iservice.DemandeOuvertureService;
import com.wha.spring.model.DemandeOuverture;

@Service("demandeOuvertureService")
@Transactional
public class DemandeOuvertureServiceImpl implements DemandeOuvertureService {

	@Autowired
	DemandeOuvertureDao demandeOuvertureDao;
	
	@Override
	public DemandeOuverture saveDemandeOuverture(DemandeOuverture demandeOuverture) {
		demandeOuvertureDao.saveDemandeOuverture(demandeOuverture);
		return demandeOuverture;
	}

	@Override
	public DemandeOuverture findById(int id) {
		return demandeOuvertureDao.findById(id);
	}

	@Override
	public void updateDemandeOuverture(DemandeOuverture demandeOuverture) {
		demandeOuvertureDao.updateDemandeOuverture(demandeOuverture);
	}

	@Override
	public List<DemandeOuverture> findAllDemandeOuvertures() {
		return demandeOuvertureDao.findAllDemandeOuvertures();
	}

	@Override
	public void deleteDemandeOuverture(int id) {
		demandeOuvertureDao.deleteDemandeOuverture(id);

	}


}
