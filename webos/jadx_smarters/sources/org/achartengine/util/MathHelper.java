package org.achartengine.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MathHelper {
    private static final NumberFormat FORMAT = NumberFormat.getNumberInstance();
    public static final double NULL_VALUE = Double.MAX_VALUE;

    private MathHelper() {
    }

    private static double[] computeLabels(double d9, double d10, int i9) {
        boolean z9;
        if (Math.abs(d9 - d10) < 1.0000000116860974E-7d) {
            return new double[]{d9, d9, 0.0d};
        }
        if (d9 > d10) {
            z9 = true;
            d9 = d10;
            d10 = d9;
        } else {
            z9 = false;
        }
        double dRoundUp = roundUp(Math.abs(d9 - d10) / ((double) i9));
        double dCeil = Math.ceil(d9 / dRoundUp) * dRoundUp;
        double dFloor = Math.floor(d10 / dRoundUp) * dRoundUp;
        return z9 ? new double[]{dFloor, dCeil, dRoundUp * (-1.0d)} : new double[]{dCeil, dFloor, dRoundUp};
    }

    public static List<Double> getLabels(double d9, double d10, int i9) {
        ArrayList arrayList = new ArrayList();
        if (i9 <= 0) {
            return arrayList;
        }
        FORMAT.setMaximumFractionDigits(5);
        double[] dArrComputeLabels = computeLabels(d9, d10, i9);
        int i10 = ((int) ((dArrComputeLabels[1] - dArrComputeLabels[0]) / dArrComputeLabels[2])) + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            double dDoubleValue = dArrComputeLabels[0] + (((double) i11) * dArrComputeLabels[2]);
            try {
                NumberFormat numberFormat = FORMAT;
                dDoubleValue = numberFormat.parse(numberFormat.format(dDoubleValue)).doubleValue();
            } catch (ParseException unused) {
            }
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    public static double[] minmax(List<Double> list) {
        if (list.size() == 0) {
            return new double[2];
        }
        double dDoubleValue = list.get(0).doubleValue();
        int size = list.size();
        double dMax = dDoubleValue;
        for (int i9 = 1; i9 < size; i9++) {
            double dDoubleValue2 = list.get(i9).doubleValue();
            dDoubleValue = Math.min(dDoubleValue, dDoubleValue2);
            dMax = Math.max(dMax, dDoubleValue2);
        }
        return new double[]{dDoubleValue, dMax};
    }

    private static double roundUp(double d9) {
        int iFloor = (int) Math.floor(Math.log10(d9));
        double dPow = d9 * Math.pow(10.0d, -iFloor);
        if (dPow > 5.0d) {
            dPow = 10.0d;
        } else if (dPow > 2.0d) {
            dPow = 5.0d;
        } else if (dPow > 1.0d) {
            dPow = 2.0d;
        }
        return dPow * Math.pow(10.0d, iFloor);
    }
}
