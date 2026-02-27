package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.cast.zzse;
import com.google.android.gms.internal.cast.zzsh;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzsh<MessageType extends zzsh<MessageType, BuilderType>, BuilderType extends zzse<MessageType, BuilderType>> extends zzqz<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzus zzc = zzus.zzc();

    public static zzsp zzA(zzsp zzspVar) {
        int size = zzspVar.size();
        return zzspVar.zzg(size == 0 ? 10 : size + size);
    }

    public static Object zzC(Method method, Object obj, Object... objArr) {
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

    public static Object zzD(zztp zztpVar, String str, Object[] objArr) {
        return new zztz(zztpVar, str, objArr);
    }

    public static void zzG(Class cls, zzsh zzshVar) {
        zzshVar.zzF();
        zzb.put(cls, zzshVar);
    }

    private final int zza(zzua zzuaVar) {
        if (zzuaVar != null) {
            return zzuaVar.zza(this);
        }
        return zztx.zza().zzb(getClass()).zza(this);
    }

    public static zzsh zzv(Class cls) {
        Map map = zzb;
        zzsh zzshVar = (zzsh) map.get(cls);
        if (zzshVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzshVar = (zzsh) map.get(cls);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException("Class initialization cannot fail.", e9);
            }
        }
        if (zzshVar == null) {
            zzshVar = (zzsh) ((zzsh) zzvb.zze(cls)).zzb(6, null, null);
            if (zzshVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzshVar);
        }
        return zzshVar;
    }

    public static zzsm zzx() {
        return zzsi.zze();
    }

    public static zzso zzy() {
        return zzte.zze();
    }

    public static zzsp zzz() {
        return zzty.zzd();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zztx.zza().zzb(getClass()).zzg(this, (zzsh) obj);
    }

    public final int hashCode() {
        if (zzJ()) {
            return zzr();
        }
        int i9 = this.zza;
        if (i9 != 0) {
            return i9;
        }
        int iZzr = zzr();
        this.zza = iZzr;
        return iZzr;
    }

    public final String toString() {
        return zztr.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.cast.zztp
    public final /* synthetic */ zzto zzB() {
        return (zzse) zzb(5, null, null);
    }

    public final void zzE() {
        zztx.zza().zzb(getClass()).zzd(this);
        zzF();
    }

    public final void zzF() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    public final void zzH(int i9) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.cast.zztp
    public final void zzI(zzru zzruVar) throws IOException {
        zztx.zza().zzb(getClass()).zzf(this, zzrv.zza(zzruVar));
    }

    public final boolean zzJ() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object zzb(int i9, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.cast.zzqz
    public final int zzp(zzua zzuaVar) {
        if (zzJ()) {
            int iZza = zza(zzuaVar);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i9 = this.zzd & a.e.API_PRIORITY_OTHER;
        if (i9 != Integer.MAX_VALUE) {
            return i9;
        }
        int iZza2 = zza(zzuaVar);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    public final int zzr() {
        return zztx.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.cast.zztq
    public final /* synthetic */ zztp zzs() {
        return (zzsh) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.cast.zztp
    public final int zzt() {
        int iZza;
        if (zzJ()) {
            iZza = zza(null);
            if (iZza < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
            }
        } else {
            iZza = this.zzd & a.e.API_PRIORITY_OTHER;
            if (iZza == Integer.MAX_VALUE) {
                iZza = zza(null);
                if (iZza < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza;
            }
        }
        return iZza;
    }

    public final zzse zzu() {
        return (zzse) zzb(5, null, null);
    }

    public final zzsh zzw() {
        return (zzsh) zzb(4, null, null);
    }
}
