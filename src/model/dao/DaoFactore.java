package model.dao;

import model.dao.impl.SellerDaoImplJDBC;

public class DaoFactore {

	public static SellerDao createSellerDao() {
		return new SellerDaoImplJDBC();
	}
	
}
