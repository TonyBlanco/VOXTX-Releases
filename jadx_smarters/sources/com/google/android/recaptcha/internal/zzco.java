package com.google.android.recaptcha.internal;

import B8.h;
import java.util.ArrayList;
import java.util.Iterator;
import l8.l;
import l8.s;
import l8.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzco implements zzby {

    @NotNull
    public static final zzco zza = new zzco();

    private zzco() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i9, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length != 2) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Object)) {
            obj = null;
        }
        if (obj == null) {
            throw new zzt(4, 5, null);
        }
        Object obj2 = objArr[1];
        if (true != (obj2 instanceof Object)) {
            obj2 = null;
        }
        if (obj2 == null) {
            throw new zzt(4, 5, null);
        }
        zzblVar.zzc().zzf(i9, zzb(obj, obj2));
    }

    @NotNull
    public final Object zzb(@NotNull Object obj, @NotNull Object obj2) throws zzt {
        boolean z9 = obj instanceof Byte;
        if (z9 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z10 = obj instanceof Short;
        if (z10 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z11 = obj instanceof Integer;
        if (z11 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z12 = obj instanceof Long;
        if (z12 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
        int i9 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(E8.c.f1714b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i9 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i9] ^ ((Number) obj2).byteValue())));
                    i9++;
                }
                return s.I(arrayList);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i9 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i9] ^ ((Number) obj2).intValue()));
                    i9++;
                }
                return s.K(arrayList2);
            }
        }
        if (z9 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b9 : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b9 ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        }
        if (z10 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s9 : sArr) {
                arrayList4.add(Short.valueOf((short) (s9 ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        }
        if (z11 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i10 : iArr) {
                arrayList5.add(Integer.valueOf(i10 ^ ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z12 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j9 : jArr) {
                arrayList6.add(Long.valueOf(j9 ^ ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        boolean z13 = obj instanceof byte[];
        if (z13 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b10 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b10 ^ ((Number) obj2).byteValue())));
            }
            return arrayList7.toArray(new Byte[0]);
        }
        boolean z14 = obj instanceof short[];
        if (z14 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s10 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s10 ^ ((Number) obj2).shortValue())));
            }
            return arrayList8.toArray(new Short[0]);
        }
        boolean z15 = obj instanceof int[];
        if (z15 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            ArrayList arrayList9 = new ArrayList(iArr2.length);
            for (int i11 : iArr2) {
                arrayList9.add(Integer.valueOf(i11 ^ ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z16 = obj instanceof long[];
        if (z16 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList10 = new ArrayList(jArr2.length);
            for (long j10 : jArr2) {
                arrayList10.add(Long.valueOf(j10 ^ ((Number) obj2).longValue()));
            }
            return arrayList10.toArray(new Long[0]);
        }
        if (z13 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length3 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzbx.zzb(this, length3, bArr4.length);
            B8.c cVarM = h.m(0, length3);
            ArrayList arrayList11 = new ArrayList(l.o(cVarM, 10));
            Iterator it = cVarM.iterator();
            while (it.hasNext()) {
                int iB = ((x) it).b();
                arrayList11.add(Byte.valueOf((byte) (bArr4[iB] ^ bArr3[iB])));
            }
            return arrayList11.toArray(new Byte[0]);
        }
        if (z14 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length4 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzbx.zzb(this, length4, sArr4.length);
            B8.c cVarM2 = h.m(0, length4);
            ArrayList arrayList12 = new ArrayList(l.o(cVarM2, 10));
            Iterator it2 = cVarM2.iterator();
            while (it2.hasNext()) {
                int iB2 = ((x) it2).b();
                arrayList12.add(Short.valueOf((short) (sArr4[iB2] ^ sArr3[iB2])));
            }
            return arrayList12.toArray(new Short[0]);
        }
        if (z15 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length5 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzbx.zzb(this, length5, iArr4.length);
            B8.c cVarM3 = h.m(0, length5);
            ArrayList arrayList13 = new ArrayList(l.o(cVarM3, 10));
            Iterator it3 = cVarM3.iterator();
            while (it3.hasNext()) {
                int iB3 = ((x) it3).b();
                arrayList13.add(Integer.valueOf(iArr4[iB3] ^ iArr3[iB3]));
            }
            return arrayList13.toArray(new Integer[0]);
        }
        if (!z16 || !(obj2 instanceof long[])) {
            throw new zzt(4, 5, null);
        }
        long[] jArr3 = (long[]) obj;
        int length6 = jArr3.length;
        long[] jArr4 = (long[]) obj2;
        zzbx.zzb(this, length6, jArr4.length);
        B8.c cVarM4 = h.m(0, length6);
        ArrayList arrayList14 = new ArrayList(l.o(cVarM4, 10));
        Iterator it4 = cVarM4.iterator();
        while (it4.hasNext()) {
            int iB4 = ((x) it4).b();
            arrayList14.add(Long.valueOf(jArr3[iB4] ^ jArr4[iB4]));
        }
        return arrayList14.toArray(new Long[0]);
    }
}
