package model.dao;

import database.DBconnection;
import model.dao.imlp.SellerDaoJDBC;

import java.sql.Connection;

public class DAOFactory {
    public static SellerDAO  createSellerDao( ){
       return new SellerDaoJDBC(DBconnection.getConnection());
    }
}
