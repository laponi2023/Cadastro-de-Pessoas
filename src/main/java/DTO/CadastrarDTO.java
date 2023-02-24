/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Rafael
 */
public class CadastrarDTO {
    private String nome,cpf,rg; 
    private int limite, id_pessoa;  
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    /**
     *
     * @return
     */
    public String getRg() {
        return rg;
    }
    
    /**
     *
     * @param rg
     */
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    /**
     *
     * @return
     */
    public Integer getLimite() {
        return limite;
    }

    /**
     *
     * @param limite
     */
    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    /**
     * @return the id_pessoa
     */
    public int getId_pessoa() {
        return id_pessoa;
    }

    /**
     * @param id_pessoa the id_pessoa to set
     */
    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }
    
}
