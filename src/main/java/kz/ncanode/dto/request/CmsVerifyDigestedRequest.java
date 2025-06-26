package kz.ncanode.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import javax.validation.constraints.NotEmpty;

@Jacksonized
@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class CmsVerifyDigestedRequest extends VerifyRequest {
    @NotEmpty
    private String cms;

    @NotEmpty
    private String hash;

    private boolean digestedOnly = true;
}
