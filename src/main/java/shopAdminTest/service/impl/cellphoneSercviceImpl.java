package shopAdminTest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopAdminTest.mapper.cellphoneMapper;
import shopAdminTest.model.Cellphone;
import shopAdminTest.service.cellphoneService;
@Service
public class cellphoneSercviceImpl implements cellphoneService{
	
	private cellphoneMapper cm;
	
	@Autowired
	public cellphoneSercviceImpl(cellphoneMapper cm) {
		this.cm = cm;
	}


	@Override
	public List<Cellphone> findAll() {
		return cm.findAll();
	}


	@Override
	public Cellphone findOne(Integer id) {
		// TODO Auto-generated method stub
		return cm.findOne(id);
	}


	@Override
	public void create(Cellphone cellphone) {
		// TODO Auto-generated method stub
		cm.create(cellphone);
	}


	@Override
	public void update(Cellphone cellphone) {
		// TODO Auto-generated method stub
		cm.update(cellphone);
	}


	@Override
	public void detele(Integer id) {
		// TODO Auto-generated method stub
		cm.delete(id);
	}




}
