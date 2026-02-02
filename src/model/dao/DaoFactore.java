package model.dao;

import db.DB;
import model.dao.impl.SellerDaoImplJDBC;

public class DaoFactore {

	public static SellerDao createSellerDao() {
		return new SellerDaoImplJDBC(DB.getConnection());
	}
	
}
