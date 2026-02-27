package com.amazonaws.mobileconnectors.cognitoidentityprovider;

import com.amazonaws.services.cognitoidentityprovider.model.CodeDeliveryDetailsType;
import com.amazonaws.services.cognitoidentityprovider.model.MFAOptionType;

/* JADX INFO: loaded from: classes.dex */
public class CognitoUserCodeDeliveryDetails {
    private final String attributeName;
    private final String deliveryMedium;
    private final String destination;

    public CognitoUserCodeDeliveryDetails(CodeDeliveryDetailsType codeDeliveryDetailsType) {
        String attributeName;
        if (codeDeliveryDetailsType != null) {
            this.destination = codeDeliveryDetailsType.getDestination();
            this.deliveryMedium = codeDeliveryDetailsType.getDeliveryMedium();
            attributeName = codeDeliveryDetailsType.getAttributeName();
        } else {
            attributeName = null;
            this.destination = null;
            this.deliveryMedium = null;
        }
        this.attributeName = attributeName;
    }

    public CognitoUserCodeDeliveryDetails(MFAOptionType mFAOptionType) {
        this.destination = null;
        if (mFAOptionType != null) {
            this.deliveryMedium = mFAOptionType.getDeliveryMedium();
            this.attributeName = mFAOptionType.getAttributeName();
        } else {
            this.deliveryMedium = null;
            this.attributeName = null;
        }
    }

    public CognitoUserCodeDeliveryDetails(String str, String str2, String str3) {
        this.destination = str;
        this.deliveryMedium = str2;
        this.attributeName = str3;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getDeliveryMedium() {
        return this.deliveryMedium;
    }

    public String getDestination() {
        return this.destination;
    }
}
