package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public class zzamr {
    public static final zzamr zza;
    public static final zzamr zzb;
    public static final zzamr zzc;
    public static final zzamr zzd;
    public static final zzamr zze;
    public static final zzamr zzf;
    public static final zzamr zzg;
    public static final zzamr zzh;
    public static final zzamr zzi;
    public static final zzamr zzj;
    public static final zzamr zzk;
    public static final zzamr zzl;
    public static final zzamr zzm;
    public static final zzamr zzn;
    public static final zzamr zzo;
    public static final zzamr zzp;
    public static final zzamr zzq;
    public static final zzamr zzr;
    private static final /* synthetic */ zzamr[] zzs;
    private final zzanb zzt;
    private final int zzu;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        zzamr zzamrVar = new zzamr("DOUBLE", 0, zzanb.DOUBLE, 1);
        zza = zzamrVar;
        zzamr zzamrVar2 = new zzamr("FLOAT", 1, zzanb.FLOAT, 5);
        zzb = zzamrVar2;
        zzanb zzanbVar = zzanb.LONG;
        zzamr zzamrVar3 = new zzamr("INT64", 2, zzanbVar, 0);
        zzc = zzamrVar3;
        zzamr zzamrVar4 = new zzamr("UINT64", 3, zzanbVar, 0);
        zzd = zzamrVar4;
        zzanb zzanbVar2 = zzanb.INT;
        zzamr zzamrVar5 = new zzamr("INT32", 4, zzanbVar2, 0);
        zze = zzamrVar5;
        zzamr zzamrVar6 = new zzamr("FIXED64", 5, zzanbVar, 1);
        zzf = zzamrVar6;
        zzamr zzamrVar7 = new zzamr("FIXED32", 6, zzanbVar2, 5);
        zzg = zzamrVar7;
        zzamr zzamrVar8 = new zzamr("BOOL", 7, zzanb.BOOLEAN, 0);
        zzh = zzamrVar8;
        int i9 = 2;
        zzamq zzamqVar = new zzamq("STRING", zzanb.STRING);
        zzi = zzamqVar;
        zzanb zzanbVar3 = zzanb.MESSAGE;
        zzams zzamsVar = new zzams("GROUP", zzanbVar3);
        zzj = zzamsVar;
        zzamu zzamuVar = new zzamu("MESSAGE", zzanbVar3);
        zzk = zzamuVar;
        zzamw zzamwVar = new zzamw("BYTES", zzanb.BYTE_STRING);
        zzl = zzamwVar;
        zzamr zzamrVar9 = new zzamr("UINT32", 12, zzanbVar2, 0);
        zzm = zzamrVar9;
        zzamr zzamrVar10 = new zzamr("ENUM", 13, zzanb.ENUM, 0);
        zzn = zzamrVar10;
        zzamr zzamrVar11 = new zzamr("SFIXED32", 14, zzanbVar2, 5);
        zzo = zzamrVar11;
        zzamr zzamrVar12 = new zzamr("SFIXED64", 15, zzanbVar, 1);
        zzp = zzamrVar12;
        zzamr zzamrVar13 = new zzamr("SINT32", 16, zzanbVar2, 0);
        zzq = zzamrVar13;
        zzamr zzamrVar14 = new zzamr("SINT64", 17, zzanbVar, 0);
        zzr = zzamrVar14;
        zzs = new zzamr[]{zzamrVar, zzamrVar2, zzamrVar3, zzamrVar4, zzamrVar5, zzamrVar6, zzamrVar7, zzamrVar8, zzamqVar, zzamsVar, zzamuVar, zzamwVar, zzamrVar9, zzamrVar10, zzamrVar11, zzamrVar12, zzamrVar13, zzamrVar14};
    }

    private zzamr(String str, int i9, zzanb zzanbVar, int i10) {
        this.zzt = zzanbVar;
        this.zzu = i10;
    }

    public static zzamr[] values() {
        return (zzamr[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzanb zzb() {
        return this.zzt;
    }
}
