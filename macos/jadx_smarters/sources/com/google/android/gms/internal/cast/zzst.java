package com.google.android.gms.internal.cast;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class zzst {
    public static final zzst zza;
    public static final zzst zzb;
    public static final zzst zzc;
    public static final zzst zzd;
    public static final zzst zze;
    public static final zzst zzf;
    public static final zzst zzg;
    public static final zzst zzh;
    public static final zzst zzi;
    public static final zzst zzj;
    private static final /* synthetic */ zzst[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzst zzstVar = new zzst("VOID", 0, Void.class, Void.class, null);
        zza = zzstVar;
        Class cls = Integer.TYPE;
        zzst zzstVar2 = new zzst("INT", 1, cls, Integer.class, 0);
        zzb = zzstVar2;
        zzst zzstVar3 = new zzst("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzstVar3;
        zzst zzstVar4 = new zzst("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzstVar4;
        zzst zzstVar5 = new zzst("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzstVar5;
        zzst zzstVar6 = new zzst("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzstVar6;
        zzst zzstVar7 = new zzst("STRING", 6, String.class, String.class, "");
        zzg = zzstVar7;
        zzst zzstVar8 = new zzst("BYTE_STRING", 7, zzrm.class, zzrm.class, zzrm.zzb);
        zzh = zzstVar8;
        zzst zzstVar9 = new zzst("ENUM", 8, cls, Integer.class, null);
        zzi = zzstVar9;
        zzst zzstVar10 = new zzst("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzstVar10;
        zzk = new zzst[]{zzstVar, zzstVar2, zzstVar3, zzstVar4, zzstVar5, zzstVar6, zzstVar7, zzstVar8, zzstVar9, zzstVar10};
    }

    private zzst(String str, int i9, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzst[] values() {
        return (zzst[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
