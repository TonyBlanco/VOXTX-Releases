package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CustomEmailLambdaVersionConfigType implements Serializable {
    private String lambdaArn;
    private String lambdaVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CustomEmailLambdaVersionConfigType)) {
            return false;
        }
        CustomEmailLambdaVersionConfigType customEmailLambdaVersionConfigType = (CustomEmailLambdaVersionConfigType) obj;
        if ((customEmailLambdaVersionConfigType.getLambdaVersion() == null) ^ (getLambdaVersion() == null)) {
            return false;
        }
        if (customEmailLambdaVersionConfigType.getLambdaVersion() != null && !customEmailLambdaVersionConfigType.getLambdaVersion().equals(getLambdaVersion())) {
            return false;
        }
        if ((customEmailLambdaVersionConfigType.getLambdaArn() == null) ^ (getLambdaArn() == null)) {
            return false;
        }
        return customEmailLambdaVersionConfigType.getLambdaArn() == null || customEmailLambdaVersionConfigType.getLambdaArn().equals(getLambdaArn());
    }

    public String getLambdaArn() {
        return this.lambdaArn;
    }

    public String getLambdaVersion() {
        return this.lambdaVersion;
    }

    public int hashCode() {
        return (((getLambdaVersion() == null ? 0 : getLambdaVersion().hashCode()) + 31) * 31) + (getLambdaArn() != null ? getLambdaArn().hashCode() : 0);
    }

    public void setLambdaArn(String str) {
        this.lambdaArn = str;
    }

    public void setLambdaVersion(CustomEmailSenderLambdaVersionType customEmailSenderLambdaVersionType) {
        this.lambdaVersion = customEmailSenderLambdaVersionType.toString();
    }

    public void setLambdaVersion(String str) {
        this.lambdaVersion = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLambdaVersion() != null) {
            sb.append("LambdaVersion: " + getLambdaVersion() + ",");
        }
        if (getLambdaArn() != null) {
            sb.append("LambdaArn: " + getLambdaArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public CustomEmailLambdaVersionConfigType withLambdaArn(String str) {
        this.lambdaArn = str;
        return this;
    }

    public CustomEmailLambdaVersionConfigType withLambdaVersion(CustomEmailSenderLambdaVersionType customEmailSenderLambdaVersionType) {
        this.lambdaVersion = customEmailSenderLambdaVersionType.toString();
        return this;
    }

    public CustomEmailLambdaVersionConfigType withLambdaVersion(String str) {
        this.lambdaVersion = str;
        return this;
    }
}
