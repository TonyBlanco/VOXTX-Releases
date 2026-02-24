package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface zzcc extends IInterface {
    void beginAdUnitExposure(String str, long j9) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j9) throws RemoteException;

    void endAdUnitExposure(String str, long j9) throws RemoteException;

    void generateEventId(zzcf zzcfVar) throws RemoteException;

    void getAppInstanceId(zzcf zzcfVar) throws RemoteException;

    void getCachedAppInstanceId(zzcf zzcfVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) throws RemoteException;

    void getCurrentScreenClass(zzcf zzcfVar) throws RemoteException;

    void getCurrentScreenName(zzcf zzcfVar) throws RemoteException;

    void getGmpAppId(zzcf zzcfVar) throws RemoteException;

    void getMaxUserProperties(String str, zzcf zzcfVar) throws RemoteException;

    void getSessionId(zzcf zzcfVar) throws RemoteException;

    void getTestFlag(zzcf zzcfVar, int i9) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z9, zzcf zzcfVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(F4.a aVar, zzcl zzclVar, long j9) throws RemoteException;

    void isDataCollectionEnabled(zzcf zzcfVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j9) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j9) throws RemoteException;

    void logHealthData(int i9, String str, F4.a aVar, F4.a aVar2, F4.a aVar3) throws RemoteException;

    void onActivityCreated(F4.a aVar, Bundle bundle, long j9) throws RemoteException;

    void onActivityDestroyed(F4.a aVar, long j9) throws RemoteException;

    void onActivityPaused(F4.a aVar, long j9) throws RemoteException;

    void onActivityResumed(F4.a aVar, long j9) throws RemoteException;

    void onActivitySaveInstanceState(F4.a aVar, zzcf zzcfVar, long j9) throws RemoteException;

    void onActivityStarted(F4.a aVar, long j9) throws RemoteException;

    void onActivityStopped(F4.a aVar, long j9) throws RemoteException;

    void performAction(Bundle bundle, zzcf zzcfVar, long j9) throws RemoteException;

    void registerOnMeasurementEventListener(zzci zzciVar) throws RemoteException;

    void resetAnalyticsData(long j9) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j9) throws RemoteException;

    void setConsent(Bundle bundle, long j9) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j9) throws RemoteException;

    void setCurrentScreen(F4.a aVar, String str, String str2, long j9) throws RemoteException;

    void setDataCollectionEnabled(boolean z9) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(zzci zzciVar) throws RemoteException;

    void setInstanceIdProvider(zzck zzckVar) throws RemoteException;

    void setMeasurementEnabled(boolean z9, long j9) throws RemoteException;

    void setMinimumSessionDuration(long j9) throws RemoteException;

    void setSessionTimeoutDuration(long j9) throws RemoteException;

    void setUserId(String str, long j9) throws RemoteException;

    void setUserProperty(String str, String str2, F4.a aVar, boolean z9, long j9) throws RemoteException;

    void unregisterOnMeasurementEventListener(zzci zzciVar) throws RemoteException;
}
