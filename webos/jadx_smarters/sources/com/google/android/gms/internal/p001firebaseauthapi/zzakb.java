package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzakb implements zzale {
    private static final zzakk zza = new zzaka();
    private final zzakk zzb;

    public zzakb() {
        this(new zzakc(zzaja.zza(), zza()));
    }

    private zzakb(zzakk zzakkVar) {
        this.zzb = (zzakk) zzajf.zza(zzakkVar, "messageInfoFactory");
    }

    private static zzakk zza() {
        try {
            return (zzakk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return zza;
        }
    }

    private static boolean zza(zzakl zzaklVar) {
        return zzakd.zza[zzaklVar.zzb().ordinal()] != 1;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzale
    public final <T> zzalf<T> zza(Class<T> cls) {
        zzalh.zza((Class<?>) cls);
        zzakl zzaklVarZza = this.zzb.zza(cls);
        if (zzaklVarZza.zzc()) {
            return zzajc.class.isAssignableFrom(cls) ? zzakt.zza(zzalh.zzb(), zzais.zzb(), zzaklVarZza.zza()) : zzakt.zza(zzalh.zza(), zzais.zza(), zzaklVarZza.zza());
        }
        if (zzajc.class.isAssignableFrom(cls)) {
            boolean zZza = zza(zzaklVarZza);
            zzakv zzakvVarZzb = zzakx.zzb();
            zzajs zzajsVarZzb = zzajs.zzb();
            zzame<?, ?> zzameVarZzb = zzalh.zzb();
            return zZza ? zzakr.zza(cls, zzaklVarZza, zzakvVarZzb, zzajsVarZzb, zzameVarZzb, zzais.zzb(), zzaki.zzb()) : zzakr.zza(cls, zzaklVarZza, zzakvVarZzb, zzajsVarZzb, zzameVarZzb, (zzaiq<?>) null, zzaki.zzb());
        }
        boolean zZza2 = zza(zzaklVarZza);
        zzakv zzakvVarZza = zzakx.zza();
        zzajs zzajsVarZza = zzajs.zza();
        zzame<?, ?> zzameVarZza = zzalh.zza();
        return zZza2 ? zzakr.zza(cls, zzaklVarZza, zzakvVarZza, zzajsVarZza, zzameVarZza, zzais.zza(), zzaki.zza()) : zzakr.zza(cls, zzaklVarZza, zzakvVarZza, zzajsVarZza, zzameVarZza, (zzaiq<?>) null, zzaki.zza());
    }
}
