package com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoParameterInvalidException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;
import com.amazonaws.services.cognitoidentityprovider.model.AttributeType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationDetails {
    private Map<String, String> authenticationParameters;
    private String authenticationType;
    private String password;
    private final String userId;
    private List<AttributeType> validationData;

    public AuthenticationDetails(String str, String str2, Map<String, String> map) {
        this.authenticationType = CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD_VERIFIER;
        this.userId = str;
        this.password = str2;
        setValidationData(map);
    }

    public AuthenticationDetails(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this.userId = str;
        this.password = str2;
        if (map == null) {
            this.authenticationType = null;
            return;
        }
        this.authenticationType = CognitoServiceConstants.CHLG_TYPE_CUSTOM_CHALLENGE;
        this.authenticationParameters = map;
        setAuthenticationParameter("USERNAME", str);
        setCustomChallenge("SRP_A");
        setValidationData(map2);
    }

    public AuthenticationDetails(String str, Map<String, String> map, Map<String, String> map2) {
        this.userId = str;
        if (map == null) {
            this.authenticationType = null;
            return;
        }
        this.authenticationType = CognitoServiceConstants.CHLG_TYPE_CUSTOM_CHALLENGE;
        this.authenticationParameters = map;
        setAuthenticationParameter("USERNAME", str);
        setValidationData(map2);
    }

    private void setValidationData(Map<String, String> map) {
        if (map == null) {
            this.validationData = null;
            return;
        }
        this.validationData = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            AttributeType attributeType = new AttributeType();
            attributeType.setName(entry.getKey());
            attributeType.setValue(entry.getValue());
            this.validationData.add(attributeType);
        }
    }

    public Map<String, String> getAuthenticationParameters() {
        return this.authenticationParameters;
    }

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public String getCustomChallenge() {
        return this.authenticationParameters.get(CognitoServiceConstants.AUTH_PARAM_CHALLENGE_NAME);
    }

    public String getPassword() {
        return this.password;
    }

    public String getUserId() {
        return this.userId;
    }

    public List<AttributeType> getValidationData() {
        return this.validationData;
    }

    public void setAuthenticationParameter(String str, String str2) {
        if (str == null) {
            throw new CognitoParameterInvalidException("A null key was used to add a new authentications parameter.");
        }
        if (this.authenticationParameters == null) {
            this.authenticationParameters = new HashMap();
        }
        this.authenticationParameters.put(str, str2);
    }

    public void setAuthenticationParameters(Map<String, String> map) {
        this.authenticationParameters = map;
    }

    public void setAuthenticationType(String str) {
        this.authenticationType = str;
        if (CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD_VERIFIER.equals(str) || CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD.equals(this.authenticationType)) {
            this.authenticationParameters = null;
        } else if (CognitoServiceConstants.CHLG_TYPE_CUSTOM_CHALLENGE.equals(this.authenticationType)) {
            this.password = null;
        }
    }

    public void setCustomChallenge(String str) {
        if (CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD_VERIFIER.equals(this.authenticationType) || CognitoServiceConstants.CHLG_TYPE_USER_PASSWORD.equals(this.authenticationType)) {
            throw new CognitoParameterInvalidException(String.format("Cannot set custom challenge when the authentication type is %s.", this.authenticationType));
        }
        this.authenticationType = CognitoServiceConstants.CHLG_TYPE_CUSTOM_CHALLENGE;
        setAuthenticationParameter(CognitoServiceConstants.AUTH_PARAM_CHALLENGE_NAME, str);
    }

    public void setPassword(String str) {
        this.password = str;
    }
}
