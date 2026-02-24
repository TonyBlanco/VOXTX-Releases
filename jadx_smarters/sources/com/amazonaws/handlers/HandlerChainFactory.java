package com.amazonaws.handlers;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.ClassLoaderHelper;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HandlerChainFactory {
    private List<RequestHandler2> createRequestHandlerChain(String str, Class<?> cls) throws Throwable {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            try {
                InputStream resourceAsStream = getClass().getResourceAsStream(str);
                if (resourceAsStream == null) {
                    return arrayList;
                }
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(resourceAsStream, StringUtils.UTF8));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused) {
                            }
                            return arrayList;
                        }
                        String strTrim = line.trim();
                        if (!"".equals(strTrim)) {
                            Object objNewInstance = ClassLoaderHelper.loadClass(strTrim, cls, getClass()).newInstance();
                            if (!cls.isInstance(objNewInstance)) {
                                throw new AmazonClientException("Unable to instantiate request handler chain for client.  Listed request handler ('" + strTrim + "') does not implement the " + cls + " API.");
                            }
                            if (cls == RequestHandler2.class) {
                                arrayList.add((RequestHandler2) objNewInstance);
                            } else {
                                if (cls != RequestHandler.class) {
                                    throw new IllegalStateException();
                                }
                                arrayList.add(RequestHandler2.adapt((RequestHandler) objNewInstance));
                            }
                        }
                    } catch (Exception e9) {
                        e = e9;
                        bufferedReader = bufferedReader2;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Exception e10) {
                e = e10;
            }
            throw new AmazonClientException("Unable to instantiate request handler chain for client: " + e.getMessage(), e);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public List<RequestHandler2> newRequestHandler2Chain(String str) {
        return createRequestHandlerChain(str, RequestHandler2.class);
    }

    public List<RequestHandler2> newRequestHandlerChain(String str) {
        return createRequestHandlerChain(str, RequestHandler.class);
    }
}
