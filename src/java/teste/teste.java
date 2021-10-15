/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Persistente.UsuarioDB;

/**
 *
 * @author leona
 */
public class teste {
    public static void main(String[] args) throws ClassNotFoundException{
        UsuarioDB.inserir("AHSDIUASH", "LEONARDO", "129128192", "2001-12-03", "orelha@hotmail.com", 0, "48985009242");
    }
}
