/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.controller;

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;

/**
 *
 * @author lohan.yugue
 */
public class NotaFiscalController {
    
    
    
    public static boolean salvar (int numeroNota, String descricaoNota, double valorNota){
        
        NotaFiscal nota = new NotaFiscal();
        
        nota.setNumNota(numeroNota);
        nota.setDescricaoNota(descricaoNota);
        nota.setValNota(valorNota);
        
        NotaFiscalDAO dao = new NotaFiscalDAO();
        
        dao.addNota(nota);
        
        return true;
    }
    
}
