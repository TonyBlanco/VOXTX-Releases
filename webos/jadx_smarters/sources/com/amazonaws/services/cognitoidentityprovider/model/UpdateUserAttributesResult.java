package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UpdateUserAttributesResult implements Serializable {
    private List<CodeDeliveryDetailsType> codeDeliveryDetailsList;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateUserAttributesResult)) {
            return false;
        }
        UpdateUserAttributesResult updateUserAttributesResult = (UpdateUserAttributesResult) obj;
        if ((updateUserAttributesResult.getCodeDeliveryDetailsList() == null) ^ (getCodeDeliveryDetailsList() == null)) {
            return false;
        }
        return updateUserAttributesResult.getCodeDeliveryDetailsList() == null || updateUserAttributesResult.getCodeDeliveryDetailsList().equals(getCodeDeliveryDetailsList());
    }

    public List<CodeDeliveryDetailsType> getCodeDeliveryDetailsList() {
        return this.codeDeliveryDetailsList;
    }

    public int hashCode() {
        return 31 + (getCodeDeliveryDetailsList() == null ? 0 : getCodeDeliveryDetailsList().hashCode());
    }

    public void setCodeDeliveryDetailsList(Collection<CodeDeliveryDetailsType> collection) {
        if (collection == null) {
            this.codeDeliveryDetailsList = null;
        } else {
            this.codeDeliveryDetailsList = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCodeDeliveryDetailsList() != null) {
            sb.append("CodeDeliveryDetailsList: " + getCodeDeliveryDetailsList());
        }
        sb.append("}");
        return sb.toString();
    }

    public UpdateUserAttributesResult withCodeDeliveryDetailsList(Collection<CodeDeliveryDetailsType> collection) {
        setCodeDeliveryDetailsList(collection);
        return this;
    }

    public UpdateUserAttributesResult withCodeDeliveryDetailsList(CodeDeliveryDetailsType... codeDeliveryDetailsTypeArr) {
        if (getCodeDeliveryDetailsList() == null) {
            this.codeDeliveryDetailsList = new ArrayList(codeDeliveryDetailsTypeArr.length);
        }
        for (CodeDeliveryDetailsType codeDeliveryDetailsType : codeDeliveryDetailsTypeArr) {
            this.codeDeliveryDetailsList.add(codeDeliveryDetailsType);
        }
        return this;
    }
}
