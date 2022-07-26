package Aplication;

import database.DBconnection;
import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.dao.imlp.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBconnection.getConnection();
        SellerDAO sellerDAO = DAOFactory.createSellerDao();
        Seller seller = sellerDAO.findById(1);

        System.out.println(seller);
    }
}
