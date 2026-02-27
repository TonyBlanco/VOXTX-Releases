package com.amazonaws.services.s3.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class NotificationConfigurationStaxUnmarshaller<T extends NotificationConfiguration> implements Unmarshaller<Map.Entry<String, NotificationConfiguration>, StaxUnmarshallerContext> {
    public abstract T createConfiguration();

    public abstract boolean handleXmlEvent(T t9, StaxUnmarshallerContext staxUnmarshallerContext, int i9) throws Exception;

    @Override // com.amazonaws.transform.Unmarshaller
    public Map.Entry<String, NotificationConfiguration> unmarshall(StaxUnmarshallerContext staxUnmarshallerContext) throws Exception {
        int currentDepth = staxUnmarshallerContext.getCurrentDepth();
        int i9 = currentDepth + 1;
        if (staxUnmarshallerContext.isStartOfDocument()) {
            i9 = currentDepth + 2;
        }
        NotificationConfiguration notificationConfigurationCreateConfiguration = createConfiguration();
        String strUnmarshall = null;
        while (true) {
            int iNextEvent = staxUnmarshallerContext.nextEvent();
            if (iNextEvent == 1) {
                return null;
            }
            if (iNextEvent == 2) {
                if (!handleXmlEvent(notificationConfigurationCreateConfiguration, staxUnmarshallerContext, i9)) {
                    if (staxUnmarshallerContext.testExpression(JsonDocumentFields.POLICY_ID, i9)) {
                        strUnmarshall = SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext);
                    } else if (staxUnmarshallerContext.testExpression("Event", i9)) {
                        notificationConfigurationCreateConfiguration.addEvent(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
                    } else if (staxUnmarshallerContext.testExpression("Filter", i9)) {
                        notificationConfigurationCreateConfiguration.setFilter(FilterStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext));
                    }
                }
            } else if (iNextEvent == 3 && staxUnmarshallerContext.getCurrentDepth() < currentDepth) {
                return new AbstractMap.SimpleEntry(strUnmarshall, notificationConfigurationCreateConfiguration);
            }
        }
    }
}
