package modServDao.generic.imp;

import modServDao.generic.IGenericDAO;

public class GenericDao implements IGenericDAO {

	private String name;
	
	private String lasName;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getLastname() {
		// TODO Auto-generated method stub
		return this.lasName;
	}

}
