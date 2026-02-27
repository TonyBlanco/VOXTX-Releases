package com.amazonaws.services.s3.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.s3.model.CloudFunctionConfiguration;
import com.amazonaws.services.s3.model.Filter;
import com.amazonaws.services.s3.model.LambdaConfiguration;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class LambdaConfigurationStaxUnmarshaller implements Unmarshaller<Map.Entry<String, NotificationConfiguration>, StaxUnmarshallerContext> {
    private static LambdaConfigurationStaxUnmarshaller instance = new LambdaConfigurationStaxUnmarshaller();

    private LambdaConfigurationStaxUnmarshaller() {
    }

    private Map.Entry<String, NotificationConfiguration> createLambdaConfig(String str, List<String> list, String str2, String str3, Filter filter) {
        return new AbstractMap.SimpleEntry(str, (str3 == null ? new LambdaConfiguration(str2, (String[]) list.toArray(new String[0])) : new CloudFunctionConfiguration(str3, str2, (String[]) list.toArray(new String[0]))).withFilter(filter));
    }

    public static LambdaConfigurationStaxUnmarshaller getInstance() {
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Map.Entry<String, NotificationConfiguration> unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
        int currentDepth = staxUnmarshallerContext.getCurrentDepth();
        int i9 = currentDepth + 1;
        if (staxUnmarshallerContext.isStartOfDocument()) {
            i9 = currentDepth + 2;
        }
        ArrayList arrayList = new ArrayList();
        String strUnmarshall = null;
        String strUnmarshall2 = null;
        String strUnmarshall3 = null;
        Filter filterUnmarshall = null;
        while (true) {
            int iNextEvent = staxUnmarshallerContext.nextEvent();
            if (iNextEvent == 1) {
                return null;
            }
            if (iNextEvent == 2) {
                if (staxUnmarshallerContext.testExpression(JsonDocumentFields.POLICY_ID, i9)) {
                    strUnmarshall = SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext);
                } else if (staxUnmarshallerContext.testExpression("Event", i9)) {
                    arrayList.add(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
                } else if (staxUnmarshallerContext.testExpression("Filter", i9)) {
                    filterUnmarshall = FilterStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext);
                } else if (staxUnmarshallerContext.testExpression("CloudFunction", i9)) {
                    strUnmarshall2 = SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext);
                } else if (staxUnmarshallerContext.testExpression("InvocationRole", i9)) {
                    strUnmarshall3 = SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext);
                }
            } else if (iNextEvent == 3 && staxUnmarshallerContext.getCurrentDepth() < currentDepth) {
                return createLambdaConfig(strUnmarshall, arrayList, strUnmarshall2, strUnmarshall3, filterUnmarshall);
            }
        }
    }
}
