package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.XpathUtils;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public class StandardErrorUnmarshaller extends AbstractErrorUnmarshaller<Node> {
    public StandardErrorUnmarshaller() {
    }

    public StandardErrorUnmarshaller(Class<? extends AmazonServiceException> cls) {
        super(cls);
    }

    public String getErrorPropertyPath(String str) {
        return "ErrorResponse/Error/" + str;
    }

    public String parseErrorCode(Node node) throws Exception {
        return XpathUtils.asString("ErrorResponse/Error/Code", node);
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(Node node) throws Exception {
        AmazonServiceException.ErrorType errorType;
        String errorCode = parseErrorCode(node);
        String strAsString = XpathUtils.asString("ErrorResponse/Error/Type", node);
        String strAsString2 = XpathUtils.asString("ErrorResponse/RequestId", node);
        AmazonServiceException amazonServiceExceptionNewException = newException(XpathUtils.asString("ErrorResponse/Error/Message", node));
        amazonServiceExceptionNewException.setErrorCode(errorCode);
        amazonServiceExceptionNewException.setRequestId(strAsString2);
        if (strAsString == null) {
            errorType = AmazonServiceException.ErrorType.Unknown;
        } else {
            if (!"Receiver".equalsIgnoreCase(strAsString)) {
                if ("Sender".equalsIgnoreCase(strAsString)) {
                    errorType = AmazonServiceException.ErrorType.Client;
                }
                return amazonServiceExceptionNewException;
            }
            errorType = AmazonServiceException.ErrorType.Service;
        }
        amazonServiceExceptionNewException.setErrorType(errorType);
        return amazonServiceExceptionNewException;
    }
}
