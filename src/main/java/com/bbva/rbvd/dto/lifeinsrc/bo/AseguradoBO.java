package com.bbva.rbvd.dto.lifeinsrc.bo;

public class AseguradoBO extends CommonFieldsBO {
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AseguradoBO{");
        sb.append("tipoDocumento='").append(this.getTipoDocumento()).append('\'');
        sb.append(", numeroDocumento='").append(this.getNumeroDocumento()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
