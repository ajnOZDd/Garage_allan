/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import DAO.BDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Employe;

/**
 *
 * @author allan
 */
public class Service_Employer {
    public Boolean chekEmployer (String name , String username ,String date) throws SQLException{
        Boolean Checkemploye = false ;
        int count=0 ;
        BDD bdd = new BDD () ;
        Employe employe  ;
        if (!name.equals("") && !username.equals("") && !date.equals("") ){
            String requette = "select * from employe where employer_name= '"+name+"'and employer_forname='"+username+"' and employer_date='"+date+"'" ; 
            Checkemploye = true ;
            try{
            ResultSet set =  bdd.response(requette) ;
            while (set.next()){
                
            }
            }catch (Exception e){
                
            }
            
        }
        return Checkemploye ;
    }
    public Boolean chekValeur (String name , String username ,String date){
     Boolean bol =false;
     if(!name.equals("") && !username.equals("") && !date.equals("") ){
        bol=true ;
     }else{

     }
     return bol ;
    }
    
}
