package com.google.android.gms.internal.firebase_messaging;

import c6.c;
import c6.d;
import c6.e;
import c6.f;
import c6.g;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzu implements f {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final d zzb;
    private static final d zzc;
    private static final e zzd;
    private OutputStream zze;
    private final Map<Class<?>, e> zzf;
    private final Map<Class<?>, g> zzg;
    private final e zzh;
    private final zzy zzi = new zzy(this);

    static {
        d.b bVarA = d.a("key");
        zzo zzoVar = new zzo();
        zzoVar.zza(1);
        zzb = bVarA.b(zzoVar.zzb()).a();
        d.b bVarA2 = d.a("value");
        zzo zzoVar2 = new zzo();
        zzoVar2.zza(2);
        zzc = bVarA2.b(zzoVar2.zzb()).a();
        zzd = new e() { // from class: com.google.android.gms.internal.firebase_messaging.zzt
            @Override // c6.b
            public final void encode(Object obj, Object obj2) throws IOException {
                zzu.zzg((Map.Entry) obj, (f) obj2);
            }
        };
    }

    public zzu(OutputStream outputStream, Map<Class<?>, e> map, Map<Class<?>, g> map2, e eVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = eVar;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, f fVar) throws IOException {
        fVar.add(zzb, entry.getKey());
        fVar.add(zzc, entry.getValue());
    }

    private static int zzh(d dVar) {
        zzs zzsVar = (zzs) dVar.c(zzs.class);
        if (zzsVar != null) {
            return zzsVar.zza();
        }
        throw new c("Field has no @Protobuf config");
    }

    private final <T> long zzi(e eVar, T t9) throws IOException {
        zzp zzpVar = new zzp();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzpVar;
            try {
                eVar.encode(t9, this);
                this.zze = outputStream;
                long jZza = zzpVar.zza();
                zzpVar.close();
                return jZza;
            } catch (Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zzpVar.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    private static zzs zzj(d dVar) {
        zzs zzsVar = (zzs) dVar.c(zzs.class);
        if (zzsVar != null) {
            return zzsVar;
        }
        throw new c("Field has no @Protobuf config");
    }

    private final <T> zzu zzk(e eVar, d dVar, T t9, boolean z9) throws IOException {
        long jZzi = zzi(eVar, t9);
        if (z9 && jZzi == 0) {
            return this;
        }
        zzn((zzh(dVar) << 3) | 2);
        zzo(jZzi);
        eVar.encode(t9, this);
        return this;
    }

    private final <T> zzu zzl(g gVar, d dVar, T t9, boolean z9) throws IOException {
        this.zzi.zza(dVar, z9);
        gVar.encode(t9, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i9) {
        return ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i9) throws IOException {
        while (true) {
            long j9 = i9 & (-128);
            OutputStream outputStream = this.zze;
            if (j9 == 0) {
                outputStream.write(i9 & 127);
                return;
            } else {
                outputStream.write((i9 & 127) | 128);
                i9 >>>= 7;
            }
        }
    }

    private final void zzo(long j9) throws IOException {
        while (true) {
            long j10 = (-128) & j9;
            OutputStream outputStream = this.zze;
            if (j10 == 0) {
                outputStream.write(((int) j9) & 127);
                return;
            } else {
                outputStream.write((((int) j9) & 127) | 128);
                j9 >>>= 7;
            }
        }
    }

    @Override // c6.f
    public final f add(d dVar, double d9) throws IOException {
        zza(dVar, d9, true);
        return this;
    }

    public final f add(d dVar, float f9) throws IOException {
        zzb(dVar, f9, true);
        return this;
    }

    @Override // c6.f
    public final /* synthetic */ f add(d dVar, int i9) throws IOException {
        zzd(dVar, i9, true);
        return this;
    }

    @Override // c6.f
    public final /* synthetic */ f add(d dVar, long j9) throws IOException {
        zze(dVar, j9, true);
        return this;
    }

    @Override // c6.f
    public final f add(d dVar, Object obj) throws IOException {
        zzc(dVar, obj, true);
        return this;
    }

    @Override // c6.f
    public final /* synthetic */ f add(d dVar, boolean z9) throws IOException {
        zzd(dVar, z9 ? 1 : 0, true);
        return this;
    }

    public final f add(String str, double d9) throws IOException {
        zza(d.d(str), d9, true);
        return this;
    }

    public final f add(String str, int i9) throws IOException {
        zzd(d.d(str), i9, true);
        return this;
    }

    public final f add(String str, long j9) throws IOException {
        zze(d.d(str), j9, true);
        return this;
    }

    public final f add(String str, Object obj) throws IOException {
        zzc(d.d(str), obj, true);
        return this;
    }

    public final f add(String str, boolean z9) throws IOException {
        zzd(d.d(str), z9 ? 1 : 0, true);
        return this;
    }

    public final f inline(Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    public final f nested(d dVar) throws IOException {
        throw new c("nested() is not implemented for protobuf encoding.");
    }

    public final f nested(String str) throws IOException {
        return nested(d.d(str));
    }

    public final f zza(d dVar, double d9, boolean z9) throws IOException {
        if (z9 && d9 == 0.0d) {
            return this;
        }
        zzn((zzh(dVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d9).array());
        return this;
    }

    public final f zzb(d dVar, float f9, boolean z9) throws IOException {
        if (z9 && f9 == 0.0f) {
            return this;
        }
        zzn((zzh(dVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f9).array());
        return this;
    }

    public final f zzc(d dVar, Object obj, boolean z9) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z9 && charSequence.length() == 0) {
                return this;
            }
            zzn((zzh(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zze.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                zzc(dVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzk(zzd, dVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            zza(dVar, ((Double) obj).doubleValue(), z9);
            return this;
        }
        if (obj instanceof Float) {
            zzb(dVar, ((Float) obj).floatValue(), z9);
            return this;
        }
        if (obj instanceof Number) {
            zze(dVar, ((Number) obj).longValue(), z9);
            return this;
        }
        if (obj instanceof Boolean) {
            zzd(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z9);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z9 && bArr.length == 0) {
                return this;
            }
            zzn((zzh(dVar) << 3) | 2);
            zzn(bArr.length);
            this.zze.write(bArr);
            return this;
        }
        e eVar = this.zzf.get(obj.getClass());
        if (eVar != null) {
            zzk(eVar, dVar, obj, z9);
            return this;
        }
        g gVar = this.zzg.get(obj.getClass());
        if (gVar != null) {
            zzl(gVar, dVar, obj, z9);
            return this;
        }
        if (obj instanceof zzq) {
            zzd(dVar, ((zzq) obj).getNumber(), true);
            return this;
        }
        if (obj instanceof Enum) {
            zzd(dVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        zzk(this.zzh, dVar, obj, z9);
        return this;
    }

    public final zzu zzd(d dVar, int i9, boolean z9) throws IOException {
        if (z9 && i9 == 0) {
            return this;
        }
        zzs zzsVarZzj = zzj(dVar);
        zzr zzrVar = zzr.DEFAULT;
        int iOrdinal = zzsVarZzj.zzb().ordinal();
        if (iOrdinal == 0) {
            zzn(zzsVarZzj.zza() << 3);
            zzn(i9);
        } else if (iOrdinal == 1) {
            zzn(zzsVarZzj.zza() << 3);
            zzn((i9 + i9) ^ (i9 >> 31));
        } else if (iOrdinal == 2) {
            zzn((zzsVarZzj.zza() << 3) | 5);
            this.zze.write(zzm(4).putInt(i9).array());
        }
        return this;
    }

    public final zzu zze(d dVar, long j9, boolean z9) throws IOException {
        if (z9 && j9 == 0) {
            return this;
        }
        zzs zzsVarZzj = zzj(dVar);
        zzr zzrVar = zzr.DEFAULT;
        int iOrdinal = zzsVarZzj.zzb().ordinal();
        if (iOrdinal == 0) {
            zzn(zzsVarZzj.zza() << 3);
            zzo(j9);
        } else if (iOrdinal == 1) {
            zzn(zzsVarZzj.zza() << 3);
            zzo((j9 >> 63) ^ (j9 + j9));
        } else if (iOrdinal == 2) {
            zzn((zzsVarZzj.zza() << 3) | 1);
            this.zze.write(zzm(8).putLong(j9).array());
        }
        return this;
    }

    public final zzu zzf(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        e eVar = this.zzf.get(obj.getClass());
        if (eVar == null) {
            throw new c("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        eVar.encode(obj, this);
        return this;
    }
}
