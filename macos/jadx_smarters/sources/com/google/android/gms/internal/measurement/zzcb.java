package com.google.android.gms.internal.measurement;

import F4.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcb extends zzbn implements zzcc {
    public zzcb() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzcc asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof zzcc ? (zzcc) iInterfaceQueryLocalInterface : new zzca(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i9, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzcf zzcdVar;
        zzcf zzcdVar2 = null;
        zzcf zzcdVar3 = null;
        zzcf zzcdVar4 = null;
        zzcf zzcdVar5 = null;
        zzci zzcgVar = null;
        zzci zzcgVar2 = null;
        zzci zzcgVar3 = null;
        zzcf zzcdVar6 = null;
        zzcf zzcdVar7 = null;
        zzcf zzcdVar8 = null;
        zzcf zzcdVar9 = null;
        zzcf zzcdVar10 = null;
        zzcf zzcdVar11 = null;
        zzck zzcjVar = null;
        zzcf zzcdVar12 = null;
        zzcf zzcdVar13 = null;
        zzcf zzcdVar14 = null;
        zzcf zzcdVar15 = null;
        switch (i9) {
            case 1:
                F4.a aVarA = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                zzcl zzclVar = (zzcl) zzbo.zza(parcel, zzcl.CREATOR);
                long j9 = parcel.readLong();
                zzbo.zzc(parcel);
                initialize(aVarA, zzclVar, j9);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                boolean zZzf = zzbo.zzf(parcel);
                boolean zZzf2 = zzbo.zzf(parcel);
                long j10 = parcel.readLong();
                zzbo.zzc(parcel);
                logEvent(string, string2, bundle, zZzf, zZzf2, j10);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzcdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar = iInterfaceQueryLocalInterface instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface : new zzcd(strongBinder);
                }
                long j11 = parcel.readLong();
                zzbo.zzc(parcel);
                logEventAndBundle(string3, string4, bundle2, zzcdVar, j11);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                F4.a aVarA2 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                boolean zZzf3 = zzbo.zzf(parcel);
                long j12 = parcel.readLong();
                zzbo.zzc(parcel);
                setUserProperty(string5, string6, aVarA2, zZzf3, j12);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zZzf4 = zzbo.zzf(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar2 = iInterfaceQueryLocalInterface2 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface2 : new zzcd(strongBinder2);
                }
                zzbo.zzc(parcel);
                getUserProperties(string7, string8, zZzf4, zzcdVar2);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar15 = iInterfaceQueryLocalInterface3 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface3 : new zzcd(strongBinder3);
                }
                zzbo.zzc(parcel);
                getMaxUserProperties(string9, zzcdVar15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j13 = parcel.readLong();
                zzbo.zzc(parcel);
                setUserId(string10, j13);
                break;
            case 8:
                Bundle bundle3 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                long j14 = parcel.readLong();
                zzbo.zzc(parcel);
                setConditionalUserProperty(bundle3, j14);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                zzbo.zzc(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar14 = iInterfaceQueryLocalInterface4 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface4 : new zzcd(strongBinder4);
                }
                zzbo.zzc(parcel);
                getConditionalUserProperties(string13, string14, zzcdVar14);
                break;
            case 11:
                boolean zZzf5 = zzbo.zzf(parcel);
                long j15 = parcel.readLong();
                zzbo.zzc(parcel);
                setMeasurementEnabled(zZzf5, j15);
                break;
            case 12:
                long j16 = parcel.readLong();
                zzbo.zzc(parcel);
                resetAnalyticsData(j16);
                break;
            case 13:
                long j17 = parcel.readLong();
                zzbo.zzc(parcel);
                setMinimumSessionDuration(j17);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                long j18 = parcel.readLong();
                zzbo.zzc(parcel);
                setSessionTimeoutDuration(j18);
                break;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                F4.a aVarA3 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j19 = parcel.readLong();
                zzbo.zzc(parcel);
                setCurrentScreen(aVarA3, string15, string16, j19);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar13 = iInterfaceQueryLocalInterface5 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface5 : new zzcd(strongBinder5);
                }
                zzbo.zzc(parcel);
                getCurrentScreenName(zzcdVar13);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar12 = iInterfaceQueryLocalInterface6 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface6 : new zzcd(strongBinder6);
                }
                zzbo.zzc(parcel);
                getCurrentScreenClass(zzcdVar12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzcjVar = iInterfaceQueryLocalInterface7 instanceof zzck ? (zzck) iInterfaceQueryLocalInterface7 : new zzcj(strongBinder7);
                }
                zzbo.zzc(parcel);
                setInstanceIdProvider(zzcjVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar11 = iInterfaceQueryLocalInterface8 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface8 : new zzcd(strongBinder8);
                }
                zzbo.zzc(parcel);
                getCachedAppInstanceId(zzcdVar11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar10 = iInterfaceQueryLocalInterface9 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface9 : new zzcd(strongBinder9);
                }
                zzbo.zzc(parcel);
                getAppInstanceId(zzcdVar10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar9 = iInterfaceQueryLocalInterface10 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface10 : new zzcd(strongBinder10);
                }
                zzbo.zzc(parcel);
                getGmpAppId(zzcdVar9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar8 = iInterfaceQueryLocalInterface11 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface11 : new zzcd(strongBinder11);
                }
                zzbo.zzc(parcel);
                generateEventId(zzcdVar8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j20 = parcel.readLong();
                zzbo.zzc(parcel);
                beginAdUnitExposure(string17, j20);
                break;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                String string18 = parcel.readString();
                long j21 = parcel.readLong();
                zzbo.zzc(parcel);
                endAdUnitExposure(string18, j21);
                break;
            case 25:
                F4.a aVarA4 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityStarted(aVarA4, j22);
                break;
            case 26:
                F4.a aVarA5 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityStopped(aVarA5, j23);
                break;
            case 27:
                F4.a aVarA6 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityCreated(aVarA6, bundle5, j24);
                break;
            case 28:
                F4.a aVarA7 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityDestroyed(aVarA7, j25);
                break;
            case 29:
                F4.a aVarA8 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityPaused(aVarA8, j26);
                break;
            case 30:
                F4.a aVarA9 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivityResumed(aVarA9, j27);
                break;
            case 31:
                F4.a aVarA10 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar7 = iInterfaceQueryLocalInterface12 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface12 : new zzcd(strongBinder12);
                }
                long j28 = parcel.readLong();
                zzbo.zzc(parcel);
                onActivitySaveInstanceState(aVarA10, zzcdVar7, j28);
                break;
            case 32:
                Bundle bundle6 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar6 = iInterfaceQueryLocalInterface13 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface13 : new zzcd(strongBinder13);
                }
                long j29 = parcel.readLong();
                zzbo.zzc(parcel);
                performAction(bundle6, zzcdVar6, j29);
                break;
            case 33:
                int i11 = parcel.readInt();
                String string19 = parcel.readString();
                F4.a aVarA11 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                F4.a aVarA12 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                F4.a aVarA13 = a.AbstractBinderC0028a.A(parcel.readStrongBinder());
                zzbo.zzc(parcel);
                logHealthData(i11, string19, aVarA11, aVarA12, aVarA13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcgVar3 = iInterfaceQueryLocalInterface14 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface14 : new zzcg(strongBinder14);
                }
                zzbo.zzc(parcel);
                setEventInterceptor(zzcgVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcgVar2 = iInterfaceQueryLocalInterface15 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface15 : new zzcg(strongBinder15);
                }
                zzbo.zzc(parcel);
                registerOnMeasurementEventListener(zzcgVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcgVar = iInterfaceQueryLocalInterface16 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface16 : new zzcg(strongBinder16);
                }
                zzbo.zzc(parcel);
                unregisterOnMeasurementEventListener(zzcgVar);
                break;
            case LangUtils.HASH_OFFSET /* 37 */:
                HashMap mapZzb = zzbo.zzb(parcel);
                zzbo.zzc(parcel);
                initForTests(mapZzb);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar5 = iInterfaceQueryLocalInterface17 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface17 : new zzcd(strongBinder17);
                }
                int i12 = parcel.readInt();
                zzbo.zzc(parcel);
                getTestFlag(zzcdVar5, i12);
                break;
            case 39:
                boolean zZzf6 = zzbo.zzf(parcel);
                zzbo.zzc(parcel);
                setDataCollectionEnabled(zZzf6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar4 = iInterfaceQueryLocalInterface18 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface18 : new zzcd(strongBinder18);
                }
                zzbo.zzc(parcel);
                isDataCollectionEnabled(zzcdVar4);
                break;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                zzbo.zzc(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j30 = parcel.readLong();
                zzbo.zzc(parcel);
                clearMeasurementEnabled(j30);
                break;
            case IjkMediaMeta.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                Bundle bundle8 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                long j31 = parcel.readLong();
                zzbo.zzc(parcel);
                setConsent(bundle8, j31);
                break;
            case 45:
                Bundle bundle9 = (Bundle) zzbo.zza(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                zzbo.zzc(parcel);
                setConsentThirdParty(bundle9, j32);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar3 = iInterfaceQueryLocalInterface19 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface19 : new zzcd(strongBinder19);
                }
                zzbo.zzc(parcel);
                getSessionId(zzcdVar3);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
