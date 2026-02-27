package com.google.android.recaptcha.internal;

import B8.h;
import java.util.ArrayList;
import java.util.Iterator;
import l8.l;
import l8.s;
import l8.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcg implements zzby {

    @NotNull
    public static final zzcg zza = new zzcg();

    private zzcg() {
    }

    private final Object zzb(Object obj, Object obj2) throws zzt, ArithmeticException {
        boolean z9;
        boolean z10;
        boolean z11 = obj instanceof Byte;
        if ((z11 && (obj2 instanceof Byte)) || ((((z9 = obj instanceof Short)) && (obj2 instanceof Short)) || (((z10 = obj instanceof Integer)) && (obj2 instanceof Integer)))) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z12 = obj instanceof Long;
        if (z12 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z13 = obj instanceof Float;
        if (z13 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z14 = obj instanceof Double;
        if (z14 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i9 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(E8.c.f1714b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i9 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i9] % ((Number) obj2).intValue())));
                    i9++;
                }
                return new String(s.I(arrayList), E8.c.f1714b);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i9 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i9] % ((Number) obj2).intValue()));
                    i9++;
                }
                return s.K(arrayList2);
            }
        }
        if (z11 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b9 : bArr) {
                arrayList3.add(Integer.valueOf(b9 % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z9 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s9 : sArr) {
                arrayList4.add(Integer.valueOf(s9 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z10 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i10 : iArr) {
                arrayList5.add(Integer.valueOf(i10 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z12 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j9 : jArr) {
                arrayList6.add(Long.valueOf(j9 % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z13 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f9 : fArr) {
                arrayList7.add(Float.valueOf(f9 % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z14 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d9 : dArr) {
                arrayList8.add(Double.valueOf(d9 % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z15 = obj instanceof byte[];
        if (z15 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b10 : bArr2) {
                arrayList9.add(Integer.valueOf(b10 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z16 = obj instanceof short[];
        if (z16 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s10 : sArr2) {
                arrayList10.add(Integer.valueOf(s10 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z17 = obj instanceof int[];
        if (z17 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i9 < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i9] % ((Number) obj2).intValue()));
                i9++;
            }
            return s.K(arrayList11);
        }
        boolean z18 = obj instanceof long[];
        if (z18 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j10 : jArr2) {
                arrayList12.add(Long.valueOf(j10 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z19 = obj instanceof float[];
        if (z19 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f10 : fArr2) {
                arrayList13.add(Float.valueOf(f10 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z20 = obj instanceof double[];
        if (z20 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d10 : dArr2) {
                arrayList14.add(Double.valueOf(d10 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z15 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzbx.zzb(this, length4, bArr4.length);
            B8.c cVarM = h.m(0, length4);
            ArrayList arrayList15 = new ArrayList(l.o(cVarM, 10));
            Iterator it = cVarM.iterator();
            while (it.hasNext()) {
                int iB = ((x) it).b();
                arrayList15.add(Integer.valueOf(bArr3[iB] % bArr4[iB]));
            }
            return arrayList15.toArray(new Integer[0]);
        }
        if (z16 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzbx.zzb(this, length5, sArr4.length);
            B8.c cVarM2 = h.m(0, length5);
            ArrayList arrayList16 = new ArrayList(l.o(cVarM2, 10));
            Iterator it2 = cVarM2.iterator();
            while (it2.hasNext()) {
                int iB2 = ((x) it2).b();
                arrayList16.add(Integer.valueOf(sArr3[iB2] % sArr4[iB2]));
            }
            return arrayList16.toArray(new Integer[0]);
        }
        if (z17 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzbx.zzb(this, length6, iArr4.length);
            B8.c cVarM3 = h.m(0, length6);
            ArrayList arrayList17 = new ArrayList(l.o(cVarM3, 10));
            Iterator it3 = cVarM3.iterator();
            while (it3.hasNext()) {
                int iB3 = ((x) it3).b();
                arrayList17.add(Integer.valueOf(iArr3[iB3] % iArr4[iB3]));
            }
            return arrayList17.toArray(new Integer[0]);
        }
        if (z18 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzbx.zzb(this, length7, jArr4.length);
            B8.c cVarM4 = h.m(0, length7);
            ArrayList arrayList18 = new ArrayList(l.o(cVarM4, 10));
            Iterator it4 = cVarM4.iterator();
            while (it4.hasNext()) {
                int iB4 = ((x) it4).b();
                arrayList18.add(Long.valueOf(jArr3[iB4] % jArr4[iB4]));
            }
            return arrayList18.toArray(new Long[0]);
        }
        if (z19 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzbx.zzb(this, length8, fArr4.length);
            B8.c cVarM5 = h.m(0, length8);
            ArrayList arrayList19 = new ArrayList(l.o(cVarM5, 10));
            Iterator it5 = cVarM5.iterator();
            while (it5.hasNext()) {
                int iB5 = ((x) it5).b();
                arrayList19.add(Float.valueOf(fArr3[iB5] % fArr4[iB5]));
            }
            return arrayList19.toArray(new Float[0]);
        }
        if (!z20 || !(obj2 instanceof double[])) {
            throw new zzt(4, 5, null);
        }
        double[] dArr3 = (double[]) obj;
        int length9 = dArr3.length;
        double[] dArr4 = (double[]) obj2;
        zzbx.zzb(this, length9, dArr4.length);
        B8.c cVarM6 = h.m(0, length9);
        ArrayList arrayList20 = new ArrayList(l.o(cVarM6, 10));
        Iterator it6 = cVarM6.iterator();
        while (it6.hasNext()) {
            int iB6 = ((x) it6).b();
            arrayList20.add(Double.valueOf(dArr3[iB6] % dArr4[iB6]));
        }
        return arrayList20.toArray(new Double[0]);
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
        try {
            zzblVar.zzc().zzf(i9, zzb(obj, obj2));
        } catch (ArithmeticException e9) {
            throw new zzt(4, 6, e9);
        }
    }
}
