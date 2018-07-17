package shopAdminTest.service;

import java.util.List;

import javax.validation.Valid;

import shopAdminTest.model.Cellphone;

public interface cellphoneService {

	List<Cellphone> findAll();

	Cellphone findOne(Integer id);

	void create(Cellphone cellphone);

	void update(Cellphone cellphone);

	void detele(Integer id);

	

	

}
