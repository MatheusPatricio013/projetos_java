package Aplication;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department dp = new Department(1,"Cueca");
        System.out.println(dp);
        Seller seller = new Seller(10,"Matheus" , "Matheus@gmail.com",new Date(),1900.00,dp);
        System.out.println(seller);
    }
}