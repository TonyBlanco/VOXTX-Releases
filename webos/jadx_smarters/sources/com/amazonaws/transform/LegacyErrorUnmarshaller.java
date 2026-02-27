package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.XpathUtils;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public class LegacyErrorUnmarshaller implements Unmarshaller<AmazonServiceException, Node> {
    private final Class<? extends AmazonServiceException> exceptionClass;

    public LegacyErrorUnmarshaller() {
        this(AmazonServiceException.class);
    }

    public LegacyErrorUnmarshaller(Class<? extends AmazonServiceException> cls) {
        this.exceptionClass = cls;
    }

    public String getErrorPropertyPath(String str) {
        return "Response/Errors/Error/" + str;
    }

    public String parseErrorCode(Node node) throws Exception {
        return XpathUtils.asString("Response/Errors/Error/Code", node);
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(Node node) throws Exception {
        AmazonServiceException.ErrorType errorType;
        String errorCode = parseErrorCode(node);
        String strAsString = XpathUtils.asString("Response/Errors/Error/Message", node);
        String strAsString2 = XpathUtils.asString("Response/RequestID", node);
        String strAsString3 = XpathUtils.asString("Response/Errors/Error/Type", node);
        AmazonServiceException amazonServiceExceptionNewInstance = this.exceptionClass.getConstructor(String.class).newInstance(strAsString);
        amazonServiceExceptionNewInstance.setErrorCode(errorCode);
        amazonServiceExceptionNewInstance.setRequestId(strAsString2);
        if (strAsString3 == null) {
            errorType = AmazonServiceException.ErrorType.Unknown;
        } else {
            if (!"server".equalsIgnoreCase(strAsString3)) {
                if ("client".equalsIgnoreCase(strAsString3)) {
                    errorType = AmazonServiceException.ErrorType.Client;
                }
                return amazonServiceExceptionNewInstance;
            }
            errorType = AmazonServiceException.ErrorType.Service;
        }
        amazonServiceExceptionNewInstance.setErrorType(errorType);
        return amazonServiceExceptionNewInstance;
    }
}
