package com.venafi.vcert.sdk.endpoint;

import com.google.gson.annotations.SerializedName;
import com.venafi.vcert.sdk.certificate.EllipticCurve;
import com.venafi.vcert.sdk.certificate.KeyType;
import lombok.Data;

import java.util.List;

@Data
public class AllowedKeyConfiguration {
    @SerializedName("keytype") // todo: check server response for spelling
    private KeyType keyType;
    private List<Integer> keySizes;
    private List<EllipticCurve> keyCurves;
}
