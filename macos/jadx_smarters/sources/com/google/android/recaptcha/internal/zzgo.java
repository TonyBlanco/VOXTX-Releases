package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.a;
import com.google.android.recaptcha.internal.zzgi;
import com.google.android.recaptcha.internal.zzgo;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgo<MessageType extends zzgo<MessageType, BuilderType>, BuilderType extends zzgi<MessageType, BuilderType>> extends zzei<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzjg zzc = zzjg.zzc();

    public static void zzC(Class cls, zzgo zzgoVar) {
        zzgoVar.zzB();
        zzb.put(cls, zzgoVar);
    }

    public static final boolean zzE(zzgo zzgoVar, boolean z9) {
        byte bByteValue = ((Byte) zzgoVar.zzh(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzih.zza().zzb(zzgoVar.getClass()).zzl(zzgoVar);
        if (z9) {
            zzgoVar.zzh(2, true != zZzl ? null : zzgoVar, null);
        }
        return zZzl;
    }

    private final int zzf(zzil zzilVar) {
        if (zzilVar != null) {
            return zzilVar.zza(this);
        }
        return zzih.zza().zzb(getClass()).zza(this);
    }

    private static zzgo zzg(zzgo zzgoVar) throws zzgy {
        if (zzgoVar == null || zzgoVar.zzo()) {
            return zzgoVar;
        }
        zzgy zzgyVarZza = new zzje(zzgoVar).zza();
        zzgyVarZza.zzh(zzgoVar);
        throw zzgyVarZza;
    }

    private static zzgo zzi(zzgo zzgoVar, byte[] bArr, int i9, int i10, zzfz zzfzVar) throws zzgy {
        zzgo zzgoVarZzs = zzgoVar.zzs();
        try {
            zzil zzilVarZzb = zzih.zza().zzb(zzgoVarZzs.getClass());
            zzilVarZzb.zzi(zzgoVarZzs, bArr, 0, i10, new zzem(zzfzVar));
            zzilVarZzb.zzf(zzgoVarZzs);
            return zzgoVarZzs;
        } catch (zzgy e9) {
            e = e9;
            if (e.zzl()) {
                e = new zzgy(e);
            }
            e.zzh(zzgoVarZzs);
            throw e;
        } catch (zzje e10) {
            zzgy zzgyVarZza = e10.zza();
            zzgyVarZza.zzh(zzgoVarZzs);
            throw zzgyVarZza;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzgy) {
                throw ((zzgy) e11.getCause());
            }
            zzgy zzgyVar = new zzgy(e11);
            zzgyVar.zzh(zzgoVarZzs);
            throw zzgyVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgy zzgyVarZzj = zzgy.zzj();
            zzgyVarZzj.zzh(zzgoVarZzs);
            throw zzgyVarZzj;
        }
    }

    public static zzgm zzq(zzhy zzhyVar, Object obj, zzhy zzhyVar2, zzgr zzgrVar, int i9, zzjv zzjvVar, Class cls) {
        return new zzgm(zzhyVar, "", null, new zzgl(null, i9, zzjvVar, false, false), cls);
    }

    public static zzgo zzr(Class cls) {
        Map map = zzb;
        zzgo zzgoVar = (zzgo) map.get(cls);
        if (zzgoVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgoVar = (zzgo) map.get(cls);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException("Class initialization cannot fail.", e9);
            }
        }
        if (zzgoVar == null) {
            zzgoVar = (zzgo) ((zzgo) zzjp.zze(cls)).zzh(6, null, null);
            if (zzgoVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzgoVar);
        }
        return zzgoVar;
    }

    public static zzgo zzt(zzgo zzgoVar, InputStream inputStream) throws zzgy {
        zzff zzfdVar;
        int i9 = zzff.zzd;
        if (inputStream == null) {
            byte[] bArr = zzgw.zzd;
            int length = bArr.length;
            zzfdVar = zzff.zzH(bArr, 0, 0, false);
        } else {
            zzfdVar = new zzfd(inputStream, 4096, null);
        }
        zzfz zzfzVar = zzfz.zza;
        zzgo zzgoVarZzs = zzgoVar.zzs();
        try {
            zzil zzilVarZzb = zzih.zza().zzb(zzgoVarZzs.getClass());
            zzilVarZzb.zzh(zzgoVarZzs, zzfg.zzq(zzfdVar), zzfzVar);
            zzilVarZzb.zzf(zzgoVarZzs);
            zzg(zzgoVarZzs);
            return zzgoVarZzs;
        } catch (zzgy e9) {
            e = e9;
            if (e.zzl()) {
                e = new zzgy(e);
            }
            e.zzh(zzgoVarZzs);
            throw e;
        } catch (zzje e10) {
            zzgy zzgyVarZza = e10.zza();
            zzgyVarZza.zzh(zzgoVarZzs);
            throw zzgyVarZza;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzgy) {
                throw ((zzgy) e11.getCause());
            }
            zzgy zzgyVar = new zzgy(e11);
            zzgyVar.zzh(zzgoVarZzs);
            throw zzgyVar;
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzgy) {
                throw ((zzgy) e12.getCause());
            }
            throw e12;
        }
    }

    public static zzgo zzu(zzgo zzgoVar, byte[] bArr) throws zzgy {
        zzgo zzgoVarZzi = zzi(zzgoVar, bArr, 0, bArr.length, zzfz.zza);
        zzg(zzgoVarZzi);
        return zzgoVarZzi;
    }

    public static zzgt zzv() {
        return zzgp.zzf();
    }

    public static zzgv zzw() {
        return zzii.zze();
    }

    public static zzgv zzx(zzgv zzgvVar) {
        int size = zzgvVar.size();
        return zzgvVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzy(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e9);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzz(zzhy zzhyVar, String str, Object[] objArr) {
        return new zzij(zzhyVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzih.zza().zzb(getClass()).zzk(this, (zzgo) obj);
    }

    public final int hashCode() {
        if (zzF()) {
            return zzm();
        }
        int i9 = this.zza;
        if (i9 != 0) {
            return i9;
        }
        int iZzm = zzm();
        this.zza = iZzm;
        return iZzm;
    }

    public final String toString() {
        return zzia.zza(this, super.toString());
    }

    public final void zzA() {
        zzih.zza().zzb(getClass()).zzf(this);
        zzB();
    }

    public final void zzB() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    public final void zzD(int i9) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | a.e.API_PRIORITY_OTHER;
    }

    public final boolean zzF() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzhy
    public final /* synthetic */ zzhx zzV() {
        return (zzgi) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzhy
    public final /* synthetic */ zzhx zzW() {
        zzgi zzgiVar = (zzgi) zzh(5, null, null);
        zzgiVar.zzg(this);
        return zzgiVar;
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final /* synthetic */ zzhy zzX() {
        return (zzgo) zzh(6, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzei
    public final int zza(zzil zzilVar) {
        if (zzF()) {
            int iZzf = zzf(zzilVar);
            if (iZzf >= 0) {
                return iZzf;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZzf);
        }
        int i9 = this.zzd & a.e.API_PRIORITY_OTHER;
        if (i9 != Integer.MAX_VALUE) {
            return i9;
        }
        int iZzf2 = zzf(zzilVar);
        if (iZzf2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzf2;
            return iZzf2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZzf2);
    }

    @Override // com.google.android.recaptcha.internal.zzhy
    public final void zze(zzfk zzfkVar) throws IOException {
        zzih.zza().zzb(getClass()).zzj(this, zzfl.zza(zzfkVar));
    }

    public abstract Object zzh(int i9, Object obj, Object obj2);

    public final int zzm() {
        return zzih.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzhy
    public final int zzn() {
        int iZzf;
        if (zzF()) {
            iZzf = zzf(null);
            if (iZzf < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iZzf);
            }
        } else {
            iZzf = this.zzd & a.e.API_PRIORITY_OTHER;
            if (iZzf == Integer.MAX_VALUE) {
                iZzf = zzf(null);
                if (iZzf < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iZzf);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzf;
            }
        }
        return iZzf;
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final boolean zzo() {
        return zzE(this, true);
    }

    public final zzgi zzp() {
        return (zzgi) zzh(5, null, null);
    }

    public final zzgo zzs() {
        return (zzgo) zzh(4, null, null);
    }
}
