package com.seguros.teste.domain.dtos;

public class BrockerDTO {
    private String nome;
    private String documento;
    private String codigo;
    private String dataCriacao;
    private String taxaComissao;
    private Boolean ativo;

    public BrockerDTO(Brocker brocker, BrockerInfo brockerInfo) {
        this.nome = brocker.getName();
        this.documento = brocker.getDocument();
        this.codigo = brocker.getCode();
        this.dataCriacao = brocker.getCreateDate();
        this.taxaComissao = brockerInfo.getCommissionRate();
        this.ativo = brockerInfo.getActive();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDataCriacao() {
        return this.dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }


    public String getTaxaComissao() {
        return this.taxaComissao;
    }

    public void setTaxaComissao(String taxaComissao) {
        this.taxaComissao = taxaComissao;
    }


    public Boolean isAtivo() {
        return this.ativo;
    }

    public Boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", documento='" + getDocumento() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", dataCriacao='" + getDataCriacao() + "'" +
            ", taxaComissao='" + getTaxaComissao() + "'" +
            ", ativo='" + isAtivo() + "'" +
            "}";
    }
}