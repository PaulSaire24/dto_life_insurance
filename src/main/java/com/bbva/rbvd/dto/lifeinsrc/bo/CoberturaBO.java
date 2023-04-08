package com.bbva.rbvd.dto.lifeinsrc.bo;


public class CoberturaBO extends CommonFieldsBO{

    private Long cobertura;
    private String descripcionCobertura;

    public Long getCobertura() { return cobertura; }
    public void setCobertura(Long cobertura) { this.cobertura = cobertura; }
    public String getDescripcionCobertura() { return descripcionCobertura; }
    public void setDescripcionCobertura(String descripcionCobertura) { this.descripcionCobertura = descripcionCobertura; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoberturaBO{");
        sb.append("cobertura=").append(cobertura);
        sb.append(", descripcionCobertura='").append(descripcionCobertura).append('\'');
        sb.append(", ").append(super.toString()).append('}');
        return sb.toString();
    }

}
