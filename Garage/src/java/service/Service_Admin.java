/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author allan
 */
public class Service_Admin {
     PreparedStatement statement ;
    ResultSet set ;
    String maka ;
    public Object [] login (String nomTable ,Object[]requette){
      maka="";
     for ( int i =0 ; i<requette.length-1; i++){
        maka= maka+""+requette[i]+"," ;
     }
     maka= maka+requette[requette.length-1] ;
     System.out.println(maka);
     return requette ;
     
    }
}
