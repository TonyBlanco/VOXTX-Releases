package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzca extends zzbm implements zzcc {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void beginAdUnitExposure(String str, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j9);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zzd(parcelZza, bundle);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearMeasurementEnabled(long j9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j9);
        zzc(43, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void endAdUnitExposure(String str, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j9);
        zzc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void generateEventId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, zzcfVar);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getAppInstanceId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, zzcfVar);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCachedAppInstanceId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, zzcfVar);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zze(parcelZza, zzcfVar);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenClass(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, zzcfVar);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenName(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, zzcfVar);
        zzc(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getGmpAppId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, zzcfVar);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getMaxUserProperties(String str, zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbo.zze(parcelZza, zzcfVar);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getSessionId(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, zzcfVar);
        zzc(46, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getTestFlag(zzcf zzcfVar, int i9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, zzcfVar);
        parcelZza.writeInt(i9);
        zzc(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getUserProperties(String str, String str2, boolean z9, zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        int i9 = zzbo.zza;
        parcelZza.writeInt(z9 ? 1 : 0);
        zzbo.zze(parcelZza, zzcfVar);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initialize(F4.a aVar, zzcl zzclVar, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, aVar);
        zzbo.zzd(parcelZza, zzclVar);
        parcelZza.writeLong(j9);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void isDataCollectionEnabled(zzcf zzcfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zzd(parcelZza, bundle);
        parcelZza.writeInt(z9 ? 1 : 0);
        parcelZza.writeInt(z10 ? 1 : 0);
        parcelZza.writeLong(j9);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j9) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logHealthData(int i9, String str, F4.a aVar, F4.a aVar2, F4.a aVar3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(5);
        parcelZza.writeString(str);
        zzbo.zze(parcelZza, aVar);
        zzbo.zze(parcelZza, aVar2);
        zzbo.zze(parcelZza, aVar3);
        zzc(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityCreated(F4.a aVar, Bundle bundle, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, aVar);
        zzbo.zzd(parcelZza, bundle);
        parcelZza.writeLong(j9);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityDestroyed(F4.a aVar, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, aVar);
        parcelZza.writeLong(j9);
        zzc(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityPaused(F4.a aVar, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, aVar);
        parcelZza.writeLong(j9);
        zzc(29, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityResumed(F4.a aVar, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, aVar);
        parcelZza.writeLong(j9);
        zzc(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivitySaveInstanceState(F4.a aVar, zzcf zzcfVar, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, aVar);
        zzbo.zze(parcelZza, zzcfVar);
        parcelZza.writeLong(j9);
        zzc(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStarted(F4.a aVar, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, aVar);
        parcelZza.writeLong(j9);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStopped(F4.a aVar, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, aVar);
        parcelZza.writeLong(j9);
        zzc(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void performAction(Bundle bundle, zzcf zzcfVar, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, bundle);
        zzbo.zze(parcelZza, zzcfVar);
        parcelZza.writeLong(j9);
        zzc(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void registerOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, zzciVar);
        zzc(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void resetAnalyticsData(long j9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j9);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConditionalUserProperty(Bundle bundle, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, bundle);
        parcelZza.writeLong(j9);
        zzc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsent(Bundle bundle, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, bundle);
        parcelZza.writeLong(j9);
        zzc(44, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsentThirdParty(Bundle bundle, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, bundle);
        parcelZza.writeLong(j9);
        zzc(45, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setCurrentScreen(F4.a aVar, String str, String str2, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeLong(j9);
        zzc(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDataCollectionEnabled(boolean z9) throws RemoteException {
        Parcel parcelZza = zza();
        int i9 = zzbo.zza;
        parcelZza.writeInt(z9 ? 1 : 0);
        zzc(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, bundle);
        zzc(42, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setEventInterceptor(zzci zzciVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, zzciVar);
        zzc(34, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setInstanceIdProvider(zzck zzckVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMeasurementEnabled(boolean z9, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        int i9 = zzbo.zza;
        parcelZza.writeInt(z9 ? 1 : 0);
        parcelZza.writeLong(j9);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMinimumSessionDuration(long j9) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setSessionTimeoutDuration(long j9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j9);
        zzc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserId(String str, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j9);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserProperty(String str, String str2, F4.a aVar, boolean z9, long j9) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zze(parcelZza, aVar);
        parcelZza.writeInt(z9 ? 1 : 0);
        parcelZza.writeLong(j9);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void unregisterOnMeasurementEventListener(zzci zzciVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, zzciVar);
        zzc(36, parcelZza);
    }
}
