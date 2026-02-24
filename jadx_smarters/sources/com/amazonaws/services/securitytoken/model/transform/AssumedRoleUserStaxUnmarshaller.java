package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.services.securitytoken.model.AssumedRoleUser;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* JADX INFO: loaded from: classes.dex */
class AssumedRoleUserStaxUnmarshaller implements Unmarshaller<AssumedRoleUser, StaxUnmarshallerContext> {
    private static AssumedRoleUserStaxUnmarshaller instance;

    public static AssumedRoleUserStaxUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AssumedRoleUserStaxUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AssumedRoleUser unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
        AssumedRoleUser assumedRoleUser = new AssumedRoleUser();
        int currentDepth = staxUnmarshallerContext.getCurrentDepth();
        int i9 = currentDepth + 1;
        if (staxUnmarshallerContext.isStartOfDocument()) {
            i9 = currentDepth + 3;
        }
        while (true) {
            int iNextEvent = staxUnmarshallerContext.nextEvent();
            if (iNextEvent == 1) {
                break;
            }
            if (iNextEvent != 2) {
                if (iNextEvent == 3 && staxUnmarshallerContext.getCurrentDepth() < currentDepth) {
                    break;
                }
            } else if (staxUnmarshallerContext.testExpression("AssumedRoleId", i9)) {
                assumedRoleUser.setAssumedRoleId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            } else if (staxUnmarshallerContext.testExpression("Arn", i9)) {
                assumedRoleUser.setArn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
            }
        }
        return assumedRoleUser;
    }
}
