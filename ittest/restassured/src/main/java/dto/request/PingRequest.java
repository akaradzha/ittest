package dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import static dto.BusConstants.Properties.REQUEST;
import static dto.BusConstants.Properties.UID;
import static dto.BusConstants.UID_MAX_SIZE;
import static dto.BusConstants.UID_MIN_SIZE;

@XmlRootElement(name = REQUEST)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PingRequest extends BaseRequest {

    private String uid;

    @Builder
    public PingRequest(String chameleonSession, String uid) {
        super(chameleonSession);
        this.uid = uid;
    }

    @NotNull
    @Size(min = UID_MIN_SIZE, max = UID_MAX_SIZE)
    public String getUid() {
        return uid;
    }

    @XmlElement(name = UID)
    @JsonProperty(UID)
    public void setUid(String uid) {
        this.uid = uid;
    }
}