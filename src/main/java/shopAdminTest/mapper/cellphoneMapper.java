package shopAdminTest.mapper;

import java.util.List;

import shopAdminTest.model.Cellphone;

public interface cellphoneMapper {

	List<Cellphone> findAll();

	Cellphone findOne(Integer id);

	void create(Cellphone cellphone);

	void update(Cellphone cellphone);

	void delete(Integer id);

	

	

}
