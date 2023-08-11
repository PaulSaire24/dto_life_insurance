package com.bbva.rbvd.dto.lifeinsrc.simulation;

import com.bbva.rbvd.dto.lifeinsrc.commons.CommonFieldsDTO;

public class ParticipantTypeDTO extends CommonFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParticipantTypeDTO{");
        sb.append("id='").append(getId()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
