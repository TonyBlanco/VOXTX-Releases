package com.amazonaws.mobileconnectors.appsync;

import B1.d;
import D1.a;
import D1.b;
import android.util.Log;
import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.util.concurrent.Executor;
import v1.InterfaceC2867e;
import v1.InterfaceC2868f;
import v1.p;
import v1.r;

/* JADX INFO: loaded from: classes.dex */
public class AppSyncComplexObjectsInterceptor implements a {
    private static final String TAG = "AppSyncComplexObjectsInterceptor";
    final r s3ObjectManager;

    public AppSyncComplexObjectsInterceptor(r rVar) {
        Log.v(TAG, "Thread:[" + Thread.currentThread().getId() + "]: Instantiating Complex Objects Interceptor");
        this.s3ObjectManager = rVar;
    }

    @Override // D1.a
    public void dispose() {
    }

    @Override // D1.a
    public void interceptAsync(a.c cVar, b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
        InterfaceC2868f interfaceC2868f = cVar.f1314b;
        if (!(interfaceC2868f instanceof InterfaceC2867e)) {
            bVar.a(cVar, executor, interfaceC0015a);
            return;
        }
        p s3ComplexObject = S3ObjectManagerImplementation.getS3ComplexObject(interfaceC2868f.variables().valueMap());
        if (s3ComplexObject == null) {
            Log.v(TAG, "Thread:[" + Thread.currentThread().getId() + "]: No s3 Objects found. Proceeding with the chain");
            bVar.a(cVar, executor, interfaceC0015a);
            return;
        }
        Log.d(TAG, "Thread:[" + Thread.currentThread().getId() + "]: Found S3Object. Performing upload");
        r rVar = this.s3ObjectManager;
        if (rVar == null) {
            interfaceC0015a.onFailure(new B1.b("S3 Object Manager not setup"));
            return;
        }
        try {
            rVar.upload(s3ComplexObject);
            bVar.a(cVar, executor, interfaceC0015a);
        } catch (AmazonClientException e9) {
            if (!(e9.getCause() instanceof IOException)) {
                interfaceC0015a.onFailure(new B1.b("S3 upload failed.", e9.getCause()));
                return;
            }
            Log.v(TAG, "Exception " + e9);
            interfaceC0015a.onFailure(new d("S3 upload failed.", e9.getCause()));
        } catch (Exception e10) {
            interfaceC0015a.onFailure(new B1.b("S3 upload failed.", e10.getCause()));
        }
    }
}
