package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.model.BucketNotificationConfiguration;
import com.amazonaws.services.s3.model.NotificationConfiguration;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public class BucketNotificationConfigurationStaxUnmarshaller implements Unmarshaller<BucketNotificationConfiguration, InputStream> {
    private static BucketNotificationConfigurationStaxUnmarshaller instance = new BucketNotificationConfigurationStaxUnmarshaller();
    private static final XmlPullParserFactory xmlPullParserFactory;

    static {
        try {
            xmlPullParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e9) {
            throw new AmazonClientException("Couldn't initialize XmlPullParserFactory", e9);
        }
    }

    private BucketNotificationConfigurationStaxUnmarshaller() {
    }

    public static BucketNotificationConfigurationStaxUnmarshaller getInstance() {
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public BucketNotificationConfiguration unmarshall(InputStream inputStream) throws Exception {
        Unmarshaller topicConfigurationStaxUnmarshaller;
        Map.Entry<String, NotificationConfiguration> entryUnmarshall;
        XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactory.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        StaxUnmarshallerContext staxUnmarshallerContext = new StaxUnmarshallerContext(xmlPullParserNewPullParser, null);
        int currentDepth = staxUnmarshallerContext.getCurrentDepth();
        int i9 = currentDepth + 1;
        if (staxUnmarshallerContext.isStartOfDocument()) {
            i9 = currentDepth + 2;
        }
        BucketNotificationConfiguration bucketNotificationConfiguration = new BucketNotificationConfiguration();
        while (true) {
            int iNextEvent = staxUnmarshallerContext.nextEvent();
            if (iNextEvent == 1) {
                return bucketNotificationConfiguration;
            }
            if (iNextEvent == 2) {
                if (staxUnmarshallerContext.testExpression("TopicConfiguration", i9)) {
                    topicConfigurationStaxUnmarshaller = TopicConfigurationStaxUnmarshaller.getInstance();
                } else if (staxUnmarshallerContext.testExpression("QueueConfiguration", i9)) {
                    topicConfigurationStaxUnmarshaller = QueueConfigurationStaxUnmarshaller.getInstance();
                } else if (staxUnmarshallerContext.testExpression("CloudFunctionConfiguration", i9)) {
                    entryUnmarshall = LambdaConfigurationStaxUnmarshaller.getInstance().unmarshall(staxUnmarshallerContext);
                    bucketNotificationConfiguration.addConfiguration(entryUnmarshall.getKey(), entryUnmarshall.getValue());
                }
                entryUnmarshall = topicConfigurationStaxUnmarshaller.unmarshall(staxUnmarshallerContext);
                bucketNotificationConfiguration.addConfiguration(entryUnmarshall.getKey(), entryUnmarshall.getValue());
            } else if (iNextEvent == 3 && staxUnmarshallerContext.getCurrentDepth() < currentDepth) {
                return bucketNotificationConfiguration;
            }
        }
    }
}
