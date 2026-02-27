package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.firebase-auth-api.zzajc.zza;
import com.google.android.gms.internal.p001firebaseauthapi.zzajc;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzajc<MessageType extends zzajc<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzahf<MessageType, BuilderType> {
    private static Map<Object, zzajc<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzamd zzb = zzamd.zzc();

    public static abstract class zza<MessageType extends zzajc<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzahe<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzu()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzo();
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzalb.zza().zza(messagetype).zza(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahe
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.zzb.zza(zzf.zze, null, null);
            zzaVar.zza = (MessageType) zzg();
            return zzaVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzu()) {
                zzj();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahe
        /* JADX INFO: renamed from: zzc */
        public final /* synthetic */ zzahe clone() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakm
        /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public final MessageType zzf() {
            MessageType messagetype = (MessageType) zzg();
            if (messagetype.zzk()) {
                return messagetype;
            }
            throw new zzamc(messagetype);
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakm
        /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
        public MessageType zzg() {
            if (!this.zza.zzu()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakp
        public final /* synthetic */ zzakn zzh() {
            return this.zzb;
        }

        public final void zzi() {
            if (this.zza.zzu()) {
                return;
            }
            zzj();
        }

        public void zzj() {
            MessageType messagetype = (MessageType) this.zzb.zzo();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakp
        public final boolean zzk() {
            return zzajc.zza(this.zza, false);
        }
    }

    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzajc<MessageType, BuilderType> implements zzakp {
        protected zzaiv<zze> zzc = zzaiv.zzb();

        public final zzaiv<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzaiv) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static class zzc<T extends zzajc<T, ?>> extends zzahg<T> {
        private final T zza;

        public zzc(T t9) {
            this.zza = t9;
        }
    }

    public static class zzd<ContainingType extends zzakn, Type> extends zzaip<ContainingType, Type> {
    }

    public static final class zze implements zzaix<zze> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaix
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaix
        public final zzakm zza(zzakm zzakmVar, zzakn zzaknVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaix
        public final zzaks zza(zzaks zzaksVar, zzaks zzaksVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaix
        public final zzamr zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaix
        public final zzanb zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaix
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaix
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    public enum zzf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    private final int zza() {
        return zzalb.zza().zza(this).zzb(this);
    }

    private static <T extends zzajc<T, ?>> T zza(T t9) throws zzaji {
        if (t9 == null || t9.zzk()) {
            return t9;
        }
        throw new zzamc(t9).zza().zza(t9);
    }

    public static <T extends zzajc<T, ?>> T zza(T t9, zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        return (T) zza(zzb(t9, zzahpVar, zzaioVar));
    }

    private static <T extends zzajc<T, ?>> T zza(T t9, zzaia zzaiaVar, zzaio zzaioVar) throws zzaji {
        T t10 = (T) t9.zzo();
        try {
            zzalf zzalfVarZza = zzalb.zza().zza(t10);
            zzalfVarZza.zza(t10, zzaij.zza(zzaiaVar), zzaioVar);
            zzalfVarZza.zzc(t10);
            return t10;
        } catch (zzaji e9) {
            e = e9;
            if (e.zzk()) {
                e = new zzaji(e);
            }
            throw e.zza(t10);
        } catch (zzamc e10) {
            throw e10.zza().zza(t10);
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzaji) {
                throw ((zzaji) e11.getCause());
            }
            throw new zzaji(e11).zza(t10);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzaji) {
                throw ((zzaji) e12.getCause());
            }
            throw e12;
        }
    }

    public static <T extends zzajc<T, ?>> T zza(T t9, InputStream inputStream, zzaio zzaioVar) throws zzaji {
        zzaia zzaifVar;
        if (inputStream == null) {
            byte[] bArr = zzajf.zzb;
            zzaifVar = zzaia.zza(bArr, 0, bArr.length, false);
        } else {
            zzaifVar = new zzaif(inputStream);
        }
        return (T) zza(zza(t9, zzaifVar, zzaioVar));
    }

    private static <T extends zzajc<T, ?>> T zza(T t9, byte[] bArr, int i9, int i10, zzaio zzaioVar) throws zzaji {
        T t10 = (T) t9.zzo();
        try {
            zzalf zzalfVarZza = zzalb.zza().zza(t10);
            zzalfVarZza.zza(t10, bArr, 0, i10, new zzahk(zzaioVar));
            zzalfVarZza.zzc(t10);
            return t10;
        } catch (zzaji e9) {
            e = e9;
            if (e.zzk()) {
                e = new zzaji(e);
            }
            throw e.zza(t10);
        } catch (zzamc e10) {
            throw e10.zza().zza(t10);
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzaji) {
                throw ((zzaji) e11.getCause());
            }
            throw new zzaji(e11).zza(t10);
        } catch (IndexOutOfBoundsException unused) {
            throw zzaji.zzi().zza(t10);
        }
    }

    public static <T extends zzajc<T, ?>> T zza(T t9, byte[] bArr, zzaio zzaioVar) throws zzaji {
        return (T) zza(zza(t9, bArr, 0, bArr.length, zzaioVar));
    }

    public static <T extends zzajc<?, ?>> T zza(Class<T> cls) {
        zzajc<?, ?> zzajcVar = zzc.get(cls);
        if (zzajcVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzajcVar = zzc.get(cls);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException("Class initialization cannot fail.", e9);
            }
        }
        if (zzajcVar == null) {
            zzajcVar = (T) ((zzajc) zzamk.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (zzajcVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzajcVar);
        }
        return (T) zzajcVar;
    }

    public static <E> zzajj<E> zza(zzajj<E> zzajjVar) {
        int size = zzajjVar.size();
        return zzajjVar.zza(size == 0 ? 10 : size << 1);
    }

    public static Object zza(zzakn zzaknVar, String str, Object[] objArr) {
        return new zzald(zzaknVar, str, objArr);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
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

    public static <T extends zzajc<?, ?>> void zza(Class<T> cls, T t9) {
        t9.zzt();
        zzc.put(cls, t9);
    }

    public static final <T extends zzajc<T, ?>> boolean zza(T t9, boolean z9) {
        byte bByteValue = ((Byte) t9.zza(zzf.zza, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzd = zzalb.zza().zza(t9).zzd(t9);
        if (z9) {
            t9.zza(zzf.zzb, zZzd ? t9 : null, null);
        }
        return zZzd;
    }

    private final int zzb(zzalf<?> zzalfVar) {
        return zzalfVar == null ? zzalb.zza().zza(this).zza(this) : zzalfVar.zza(this);
    }

    private static <T extends zzajc<T, ?>> T zzb(T t9, zzahp zzahpVar, zzaio zzaioVar) throws zzaji {
        zzaia zzaiaVarZzc = zzahpVar.zzc();
        T t10 = (T) zza(t9, zzaiaVarZzc, zzaioVar);
        try {
            zzaiaVarZzc.zzc(0);
            return t10;
        } catch (zzaji e9) {
            throw e9.zza(t10);
        }
    }

    public static <E> zzajj<E> zzp() {
        return zzala.zzd();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahf
    public final int a_() {
        return this.zzd & a.e.API_PRIORITY_OTHER;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzalb.zza().zza(this).zzb(this, (zzajc) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzu()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzako.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahf
    public final int zza(zzalf zzalfVar) {
        if (!zzu()) {
            if (a_() != Integer.MAX_VALUE) {
                return a_();
            }
            int iZzb = zzb((zzalf<?>) zzalfVar);
            zzb(iZzb);
            return iZzb;
        }
        int iZzb2 = zzb((zzalf<?>) zzalfVar);
        if (iZzb2 >= 0) {
            return iZzb2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZzb2);
    }

    public abstract Object zza(int i9, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakn
    public final void zza(zzaik zzaikVar) throws IOException {
        zzalb.zza().zza(this).zza(this, zzain.zza(zzaikVar));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahf
    public final void zzb(int i9) {
        if (i9 >= 0) {
            this.zzd = (i9 & a.e.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i9);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakp
    public final /* synthetic */ zzakn zzh() {
        return (zzajc) zza(zzf.zzf, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakp
    public final boolean zzk() {
        return zza(this, true);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakn
    public final int zzl() {
        return zza((zzalf) null);
    }

    public final <MessageType extends zzajc<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzm() {
        return (BuilderType) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return (BuilderType) ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzo() {
        return (MessageType) zza(zzf.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakn
    public final /* synthetic */ zzakm zzq() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzakn
    public final /* synthetic */ zzakm zzr() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    public final void zzs() {
        zzalb.zza().zza(this).zzc(this);
        zzt();
    }

    public final void zzt() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    public final boolean zzu() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
