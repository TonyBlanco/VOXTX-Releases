package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzaix;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
final class zzaiv<T extends zzaix<T>> {
    private static final zzaiv zzb = new zzaiv(true);
    final zzalg<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzaiv() {
        this.zza = zzalg.zza(16);
    }

    private zzaiv(zzalg<T, Object> zzalgVar) {
        this.zza = zzalgVar;
        zze();
    }

    private zzaiv(boolean z9) {
        this(zzalg.zza(0));
        zze();
    }

    public static int zza(zzaix<?> zzaixVar, Object obj) {
        zzamr zzamrVarZzb = zzaixVar.zzb();
        int iZza = zzaixVar.zza();
        if (!zzaixVar.zze()) {
            return zza(zzamrVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int iZza2 = 0;
        if (!zzaixVar.zzd()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iZza2 += zza(zzamrVarZzb, iZza, it.next());
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iZza2 += zza(zzamrVarZzb, it2.next());
        }
        return zzaik.zzi(iZza) + iZza2 + zzaik.zzj(iZza2);
    }

    public static int zza(zzamr zzamrVar, int i9, Object obj) {
        int iZzi = zzaik.zzi(i9);
        if (zzamrVar == zzamr.zzj) {
            zzajf.zza((zzakn) obj);
            iZzi <<= 1;
        }
        return iZzi + zza(zzamrVar, obj);
    }

    private static int zza(zzamr zzamrVar, Object obj) {
        switch (zzaiu.zzb[zzamrVar.ordinal()]) {
            case 1:
                return zzaik.zza(((Double) obj).doubleValue());
            case 2:
                return zzaik.zza(((Float) obj).floatValue());
            case 3:
                return zzaik.zzd(((Long) obj).longValue());
            case 4:
                return zzaik.zzg(((Long) obj).longValue());
            case 5:
                return zzaik.zze(((Integer) obj).intValue());
            case 6:
                return zzaik.zzc(((Long) obj).longValue());
            case 7:
                return zzaik.zzd(((Integer) obj).intValue());
            case 8:
                return zzaik.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzaik.zza((zzakn) obj);
            case 10:
                return obj instanceof zzajn ? zzaik.zza((zzajn) obj) : zzaik.zzb((zzakn) obj);
            case 11:
                return obj instanceof zzahp ? zzaik.zza((zzahp) obj) : zzaik.zza((String) obj);
            case 12:
                return obj instanceof zzahp ? zzaik.zza((zzahp) obj) : zzaik.zza((byte[]) obj);
            case 13:
                return zzaik.zzj(((Integer) obj).intValue());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return zzaik.zzg(((Integer) obj).intValue());
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return zzaik.zze(((Long) obj).longValue());
            case 16:
                return zzaik.zzh(((Integer) obj).intValue());
            case LangUtils.HASH_SEED /* 17 */:
                return zzaik.zzf(((Long) obj).longValue());
            case 18:
                return obj instanceof zzaje ? zzaik.zzc(((zzaje) obj).zza()) : zzaik.zzc(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() != zzanb.MESSAGE || key.zze() || key.zzd()) {
            return zza((zzaix<?>) key, value);
        }
        boolean z9 = value instanceof zzajn;
        int iZza = entry.getKey().zza();
        return z9 ? zzaik.zza(iZza, (zzajn) value) : zzaik.zza(iZza, (zzakn) value);
    }

    private final Object zza(T t9) {
        Object obj = this.zza.get(t9);
        return obj instanceof zzajn ? zzajn.zza() : obj;
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzaks) {
            return ((zzaks) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void zza(zzaik zzaikVar, zzamr zzamrVar, int i9, Object obj) throws IOException {
        if (zzamrVar == zzamr.zzj) {
            zzakn zzaknVar = (zzakn) obj;
            zzajf.zza(zzaknVar);
            zzaikVar.zzk(i9, 3);
            zzaknVar.zza(zzaikVar);
            zzaikVar.zzk(i9, 4);
        }
        zzaikVar.zzk(i9, zzamrVar.zza());
        switch (zzaiu.zzb[zzamrVar.ordinal()]) {
            case 1:
                zzaikVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzaikVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzaikVar.zzj(((Long) obj).longValue());
                break;
            case 4:
                zzaikVar.zzj(((Long) obj).longValue());
                break;
            case 5:
                zzaikVar.zzl(((Integer) obj).intValue());
                break;
            case 6:
                zzaikVar.zzh(((Long) obj).longValue());
                break;
            case 7:
                zzaikVar.zzk(((Integer) obj).intValue());
                break;
            case 8:
                zzaikVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzakn) obj).zza(zzaikVar);
                break;
            case 10:
                zzaikVar.zzc((zzakn) obj);
                break;
            case 11:
                if (!(obj instanceof zzahp)) {
                    zzaikVar.zzb((String) obj);
                } else {
                    zzaikVar.zzb((zzahp) obj);
                }
                break;
            case 12:
                if (!(obj instanceof zzahp)) {
                    byte[] bArr = (byte[]) obj;
                    zzaikVar.zzb(bArr, 0, bArr.length);
                } else {
                    zzaikVar.zzb((zzahp) obj);
                }
                break;
            case 13:
                zzaikVar.zzn(((Integer) obj).intValue());
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                zzaikVar.zzk(((Integer) obj).intValue());
                break;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                zzaikVar.zzh(((Long) obj).longValue());
                break;
            case 16:
                zzaikVar.zzm(((Integer) obj).intValue());
                break;
            case LangUtils.HASH_SEED /* 17 */:
                zzaikVar.zzi(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof zzaje)) {
                    zzaikVar.zzl(((Integer) obj).intValue());
                } else {
                    zzaikVar.zzl(((zzaje) obj).zza());
                }
                break;
        }
    }

    public static <T extends zzaix<T>> zzaiv<T> zzb() {
        return zzb;
    }

    private final void zzb(T t9, Object obj) {
        if (!t9.zze()) {
            zzc(t9, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj2 = arrayList.get(i9);
                i9++;
                zzc(t9, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzajn) {
            this.zzd = true;
        }
        this.zza.put(t9, obj);
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z9 = value instanceof zzajn;
        if (key.zze()) {
            if (z9) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZza = zza((zzaix) key);
            if (objZza == null) {
                objZza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZza).add(zza(it.next()));
            }
            this.zza.put(key, objZza);
            return;
        }
        if (key.zzc() != zzanb.MESSAGE) {
            if (z9) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(key, zza(value));
            return;
        }
        Object objZza2 = zza((zzaix) key);
        if (objZza2 != null) {
            if (z9) {
                value = zzajn.zza();
            }
            this.zza.put(key, objZza2 instanceof zzaks ? key.zza((zzaks) objZza2, (zzaks) value) : key.zza(((zzakn) objZza2).zzr(), (zzakn) value).zzf());
        } else {
            this.zza.put(key, zza(value));
            if (z9) {
                this.zzd = true;
            }
        }
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzakp) {
            return ((zzakp) obj).zzk();
        }
        if (obj instanceof zzajn) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzc(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.firebase-auth-api.zzamr r0 = r5.zzb()
            com.google.android.gms.internal.p001firebaseauthapi.zzajf.zza(r6)
            int[] r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaiu.zza
            com.google.android.gms.internal.firebase-auth-api.zzanb r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2d;
                case 8: goto L24;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = 0
            goto L47
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzakn
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzajn
            if (r0 == 0) goto L18
        L22:
            r0 = 1
            goto L47
        L24:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzaje
            if (r0 == 0) goto L18
            goto L22
        L2d:
            boolean r0 = r6 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzahp
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
            goto L22
        L36:
            boolean r0 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r3 = r5.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.firebase-auth-api.zzamr r5 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzanb r5 = r5.zzb()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            r4[r1] = r5
            r5 = 2
            r4[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaiv.zzc(com.google.android.gms.internal.firebase-auth-api.zzaix, java.lang.Object):void");
    }

    private static <T extends zzaix<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzanb.MESSAGE) {
            return true;
        }
        boolean zZze = key.zze();
        Object value = entry.getValue();
        if (!zZze) {
            return zzb(value);
        }
        Iterator it = ((List) value).iterator();
        while (it.hasNext()) {
            if (!zzb(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzaiv zzaivVar = new zzaiv();
        for (int i9 = 0; i9 < this.zza.zza(); i9++) {
            Map.Entry<K, Object> entryZzb = this.zza.zzb(i9);
            zzaivVar.zzb((zzaix) entryZzb.getKey(), entryZzb.getValue());
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzaivVar.zzb((zzaix) entry.getKey(), entry.getValue());
        }
        zzaivVar.zzd = this.zzd;
        return zzaivVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaiv) {
            return this.zza.equals(((zzaiv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zza() {
        int iZza = 0;
        for (int i9 = 0; i9 < this.zza.zza(); i9++) {
            iZza += zza((Map.Entry) this.zza.zzb(i9));
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            iZza += zza((Map.Entry) it.next());
        }
        return iZza;
    }

    public final void zza(zzaiv<T> zzaivVar) {
        for (int i9 = 0; i9 < zzaivVar.zza.zza(); i9++) {
            zzb((Map.Entry) zzaivVar.zza.zzb(i9));
        }
        Iterator it = zzaivVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zzd ? new zzajo(this.zza.zzc().iterator()) : this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zzd ? new zzajo(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        for (int i9 = 0; i9 < this.zza.zza(); i9++) {
            Map.Entry<K, Object> entryZzb = this.zza.zzb(i9);
            if (entryZzb.getValue() instanceof zzajc) {
                ((zzajc) entryZzb.getValue()).zzs();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i9 = 0; i9 < this.zza.zza(); i9++) {
            if (!zzc(this.zza.zzb(i9))) {
                return false;
            }
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (!zzc((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
