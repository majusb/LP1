package br.com.projeto_1.ctr;

import java.sql.ResultSet;
import br.com.projeto_1.dto.ClienteDTO;
import br.com.projeto_1.dao.ClienteDAO;
import br.com.projeto_1.dao.ConexaoDAO;

public class ClienteCTR {
    
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public ClienteCTR(){
        
    }
    
    public String inserirCliente(ClienteDTO clienteDTO){
        try {
            if (clienteDAO.inserirCliente(clienteDTO)){
                return "Cliente cadastrado com sucesso!!!";
            } else {
                return "Cliente NÃO cadastrado!!!";
            }
        }
        
        catch (Exception e){
            System.out.println(e.getMessage());
        return "Cliente NÃO cadastrado!!!";
        }

    }
    
    public ResultSet consulrarCliente (ClienteDTO clienteDTO, int opcao){
        ResultSet rs = null;
        rs = clienteDAO.consulrarCliente(clienteDTO, opcao);
        return rs;
    }
    
    public String alterarCliente (ClienteDTO clienteDTO){
        try {
            if (clienteDAO.alterarCliente(clienteDTO)){
                return "Cliente Alterado com Sucesso!!!";
            } else {
                return "Cliente NÃO Alterado!!!";
            }                       
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "Cliente NÃO Alterado!!!";
        }
    }
    
    public String excluirCliente (ClienteDTO clienteDTO){
        try{
            if (clienteDAO.excluirCliente(clienteDTO)){
                return "Cliente Excluido com Sucesso!!!";
            } else {
                return "Cliente NÃO Excluido";
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "Cliente NÃO Exluido!!!";
        }
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
}