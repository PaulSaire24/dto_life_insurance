package com.bbva.rbvd.dto.lifeinsrc.commons;

public class PeriodDTO extends CommonFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PeriodDTO{");
        sb.append("id=").append(this.getId()).append('\'');
        sb.append(", name=").append(this.getName()).append('\'');
        sb.append(", isAvailable=").append(this.getIsAvailable());
        sb.append('}');
        return sb.toString();
    }

}
