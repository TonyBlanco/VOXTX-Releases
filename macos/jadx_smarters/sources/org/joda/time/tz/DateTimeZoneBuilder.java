package org.joda.time.tz;

import com.google.android.gms.common.api.a;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes4.dex */
public class DateTimeZoneBuilder {
    private final ArrayList<RuleSet> iRuleSets = new ArrayList<>(10);

    public static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        final Recurrence iEndRecurrence;
        final int iStandardOffset;
        final Recurrence iStartRecurrence;

        public DSTZone(String str, int i9, Recurrence recurrence, Recurrence recurrence2) {
            super(str);
            this.iStandardOffset = i9;
            this.iStartRecurrence = recurrence;
            this.iEndRecurrence = recurrence2;
        }

        private Recurrence findMatchingRecurrence(long j9) {
            long next;
            int i9 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                next = recurrence.next(j9, i9, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                next = j9;
            }
            try {
                j9 = recurrence2.next(j9, i9, recurrence.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return next > j9 ? recurrence : recurrence2;
        }

        public static DSTZone readFrom(DataInput dataInput, String str) throws IOException {
            return new DSTZone(str, (int) DateTimeZoneBuilder.readMillis(dataInput), Recurrence.readFrom(dataInput), Recurrence.readFrom(dataInput));
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DSTZone)) {
                return false;
            }
            DSTZone dSTZone = (DSTZone) obj;
            return getID().equals(dSTZone.getID()) && this.iStandardOffset == dSTZone.iStandardOffset && this.iStartRecurrence.equals(dSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dSTZone.iEndRecurrence);
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j9) {
            return findMatchingRecurrence(j9).getNameKey();
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j9) {
            return this.iStandardOffset + findMatchingRecurrence(j9).getSaveMillis();
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j9) {
            return this.iStandardOffset;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j9) {
            long next;
            int i9 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                next = recurrence.next(j9, i9, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            if (j9 > 0 && next < 0) {
                next = j9;
            }
            try {
                long next2 = recurrence2.next(j9, i9, recurrence.getSaveMillis());
                if (j9 <= 0 || next2 >= 0) {
                    j9 = next2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return next > j9 ? j9 : next;
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j9) {
            long jPrevious;
            long j10 = j9 + 1;
            int i9 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                jPrevious = recurrence.previous(j10, i9, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            if (j10 < 0 && jPrevious > 0) {
                jPrevious = j10;
            }
            try {
                long jPrevious2 = recurrence2.previous(j10, i9, recurrence.getSaveMillis());
                if (j10 >= 0 || jPrevious2 <= 0) {
                    j10 = jPrevious2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (jPrevious <= j10) {
                jPrevious = j10;
            }
            return jPrevious - 1;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffset);
            this.iStartRecurrence.writeTo(dataOutput);
            this.iEndRecurrence.writeTo(dataOutput);
        }
    }

    public static final class OfYear {
        final boolean iAdvance;
        final int iDayOfMonth;
        final int iDayOfWeek;
        final int iMillisOfDay;
        final char iMode;
        final int iMonthOfYear;

        public OfYear(char c9, int i9, int i10, int i11, boolean z9, int i12) {
            if (c9 != 'u' && c9 != 'w' && c9 != 's') {
                throw new IllegalArgumentException("Unknown mode: " + c9);
            }
            this.iMode = c9;
            this.iMonthOfYear = i9;
            this.iDayOfMonth = i10;
            this.iDayOfWeek = i11;
            this.iAdvance = z9;
            this.iMillisOfDay = i12;
        }

        public static OfYear readFrom(DataInput dataInput) throws IOException {
            return new OfYear((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        private long setDayOfMonth(Chronology chronology, long j9) {
            if (this.iDayOfMonth >= 0) {
                return chronology.dayOfMonth().set(j9, this.iDayOfMonth);
            }
            return chronology.dayOfMonth().add(chronology.monthOfYear().add(chronology.dayOfMonth().set(j9, 1), 1), this.iDayOfMonth);
        }

        private long setDayOfMonthNext(Chronology chronology, long j9) {
            try {
                return setDayOfMonth(chronology, j9);
            } catch (IllegalArgumentException e9) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e9;
                }
                while (!chronology.year().isLeap(j9)) {
                    j9 = chronology.year().add(j9, 1);
                }
                return setDayOfMonth(chronology, j9);
            }
        }

        private long setDayOfMonthPrevious(Chronology chronology, long j9) {
            try {
                return setDayOfMonth(chronology, j9);
            } catch (IllegalArgumentException e9) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e9;
                }
                while (!chronology.year().isLeap(j9)) {
                    j9 = chronology.year().add(j9, -1);
                }
                return setDayOfMonth(chronology, j9);
            }
        }

        private long setDayOfWeek(Chronology chronology, long j9) {
            int i9 = this.iDayOfWeek - chronology.dayOfWeek().get(j9);
            if (i9 == 0) {
                return j9;
            }
            if (this.iAdvance) {
                if (i9 < 0) {
                    i9 += 7;
                }
            } else if (i9 > 0) {
                i9 -= 7;
            }
            return chronology.dayOfWeek().add(j9, i9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfYear)) {
                return false;
            }
            OfYear ofYear = (OfYear) obj;
            return this.iMode == ofYear.iMode && this.iMonthOfYear == ofYear.iMonthOfYear && this.iDayOfMonth == ofYear.iDayOfMonth && this.iDayOfWeek == ofYear.iDayOfWeek && this.iAdvance == ofYear.iAdvance && this.iMillisOfDay == ofYear.iMillisOfDay;
        }

        public long next(long j9, int i9, int i10) {
            char c9 = this.iMode;
            if (c9 == 'w') {
                i9 += i10;
            } else if (c9 != 's') {
                i9 = 0;
            }
            long j10 = i9;
            long j11 = j9 + j10;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j11, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonthNext = setDayOfWeek(instanceUTC, dayOfMonthNext);
                if (dayOfMonthNext <= j11) {
                    dayOfMonthNext = setDayOfWeek(instanceUTC, setDayOfMonthNext(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthNext, 1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthNext <= j11) {
                dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.year().add(dayOfMonthNext, 1));
            }
            return dayOfMonthNext - j10;
        }

        public long previous(long j9, int i9, int i10) {
            char c9 = this.iMode;
            if (c9 == 'w') {
                i9 += i10;
            } else if (c9 != 's') {
                i9 = 0;
            }
            long j10 = i9;
            long j11 = j9 + j10;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j11, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonthPrevious = setDayOfWeek(instanceUTC, dayOfMonthPrevious);
                if (dayOfMonthPrevious >= j11) {
                    dayOfMonthPrevious = setDayOfWeek(instanceUTC, setDayOfMonthPrevious(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthPrevious, -1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthPrevious >= j11) {
                dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.year().add(dayOfMonthPrevious, -1));
            }
            return dayOfMonthPrevious - j10;
        }

        public long setInstant(int i9, int i10, int i11) {
            char c9 = this.iMode;
            if (c9 == 'w') {
                i10 += i11;
            } else if (c9 != 's') {
                i10 = 0;
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonth = setDayOfMonth(instanceUTC, instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(instanceUTC.year().set(0L, i9), this.iMonthOfYear), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonth = setDayOfWeek(instanceUTC, dayOfMonth);
            }
            return dayOfMonth - ((long) i10);
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(this.iMode);
            dataOutput.writeByte(this.iMonthOfYear);
            dataOutput.writeByte(this.iDayOfMonth);
            dataOutput.writeByte(this.iDayOfWeek);
            dataOutput.writeBoolean(this.iAdvance);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iMillisOfDay);
        }
    }

    public static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        public static PrecalculatedZone create(String str, boolean z9, ArrayList<Transition> arrayList, DSTZone dSTZone) {
            DSTZone dSTZone2;
            DSTZone dSTZone3 = dSTZone;
            int size = arrayList.size();
            if (size == 0) {
                throw new IllegalArgumentException();
            }
            long[] jArr = new long[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            String[] strArr = new String[size];
            int i9 = 0;
            Transition transition = null;
            int i10 = 0;
            while (i10 < size) {
                Transition transition2 = arrayList.get(i10);
                if (!transition2.isTransitionFrom(transition)) {
                    throw new IllegalArgumentException(str);
                }
                jArr[i10] = transition2.getMillis();
                iArr[i10] = transition2.getWallOffset();
                iArr2[i10] = transition2.getStandardOffset();
                strArr[i10] = transition2.getNameKey();
                i10++;
                transition = transition2;
            }
            String[] strArr2 = new String[5];
            for (String[] strArr3 : new DateFormatSymbols(Locale.ENGLISH).getZoneStrings()) {
                if (strArr3 != null && strArr3.length == 5 && str.equals(strArr3[0])) {
                    strArr2 = strArr3;
                }
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            while (i9 < size - 1) {
                String str2 = strArr[i9];
                int i11 = i9 + 1;
                String str3 = strArr[i11];
                long j9 = iArr[i9];
                long j10 = iArr[i11];
                String[] strArr4 = strArr;
                String[] strArr5 = strArr2;
                long j11 = iArr2[i9];
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j12 = iArr2[i11];
                int i12 = size;
                Period period = new Period(jArr[i9], jArr[i11], PeriodType.yearMonthDay(), instanceUTC);
                if (j9 != j10 && j11 == j12 && str2.equals(str3) && period.getYears() == 0 && period.getMonths() > 4 && period.getMonths() < 8 && str2.equals(strArr5[2]) && str2.equals(strArr5[4])) {
                    if (ZoneInfoCompiler.verbose()) {
                        PrintStream printStream = System.out;
                        printStream.println("Fixing duplicate name key - " + str3);
                        printStream.println("     - " + new DateTime(jArr[i9], instanceUTC) + " - " + new DateTime(jArr[i11], instanceUTC));
                    }
                    if (j9 > j10) {
                        strArr4[i9] = (str2 + "-Summer").intern();
                    } else if (j9 < j10) {
                        strArr4[i11] = (str3 + "-Summer").intern();
                        i9 = i11;
                    }
                }
                i9++;
                strArr2 = strArr5;
                dSTZone3 = dSTZone;
                strArr = strArr4;
                iArr = iArr3;
                iArr2 = iArr4;
                size = i12;
            }
            DSTZone dSTZone4 = dSTZone3;
            int[] iArr5 = iArr;
            int[] iArr6 = iArr2;
            String[] strArr6 = strArr;
            if (dSTZone4 == null || !dSTZone4.iStartRecurrence.getNameKey().equals(dSTZone4.iEndRecurrence.getNameKey())) {
                dSTZone2 = dSTZone4;
            } else {
                if (ZoneInfoCompiler.verbose()) {
                    System.out.println("Fixing duplicate recurrent name key - " + dSTZone4.iStartRecurrence.getNameKey());
                }
                dSTZone2 = dSTZone4.iStartRecurrence.getSaveMillis() > 0 ? new DSTZone(dSTZone.getID(), dSTZone4.iStandardOffset, dSTZone4.iStartRecurrence.renameAppend("-Summer"), dSTZone4.iEndRecurrence) : new DSTZone(dSTZone.getID(), dSTZone4.iStandardOffset, dSTZone4.iStartRecurrence, dSTZone4.iEndRecurrence.renameAppend("-Summer"));
            }
            return new PrecalculatedZone(z9 ? str : "", jArr, iArr5, iArr6, strArr6, dSTZone2);
        }

        public static PrecalculatedZone readFrom(DataInput dataInput, String str) throws IOException {
            int unsignedByte;
            int unsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[unsignedShort];
            for (int i9 = 0; i9 < unsignedShort; i9++) {
                strArr[i9] = dataInput.readUTF();
            }
            int i10 = dataInput.readInt();
            long[] jArr = new long[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            String[] strArr2 = new String[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                jArr[i11] = DateTimeZoneBuilder.readMillis(dataInput);
                iArr[i11] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                iArr2[i11] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                if (unsignedShort < 256) {
                    try {
                        unsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    unsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i11] = strArr[unsignedByte];
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? DSTZone.readFrom(dataInput, str) : null);
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrecalculatedZone)) {
                return false;
            }
            PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
            if (getID().equals(precalculatedZone.getID()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                DSTZone dSTZone = this.iTailZone;
                DSTZone dSTZone2 = precalculatedZone.iTailZone;
                if (dSTZone == null) {
                    if (dSTZone2 == null) {
                        return true;
                    }
                } else if (dSTZone.equals(dSTZone2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j9) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j9);
            if (iBinarySearch >= 0) {
                return this.iNameKeys[iBinarySearch];
            }
            int i9 = ~iBinarySearch;
            if (i9 < jArr.length) {
                return i9 > 0 ? this.iNameKeys[i9 - 1] : "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            return dSTZone == null ? this.iNameKeys[i9 - 1] : dSTZone.getNameKey(j9);
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j9) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j9);
            if (iBinarySearch >= 0) {
                return this.iWallOffsets[iBinarySearch];
            }
            int i9 = ~iBinarySearch;
            if (i9 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iWallOffsets[i9 - 1] : dSTZone.getOffset(j9);
            }
            if (i9 > 0) {
                return this.iWallOffsets[i9 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j9) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j9);
            if (iBinarySearch >= 0) {
                return this.iStandardOffsets[iBinarySearch];
            }
            int i9 = ~iBinarySearch;
            if (i9 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iStandardOffsets[i9 - 1] : dSTZone.getStandardOffset(j9);
            }
            if (i9 > 0) {
                return this.iStandardOffsets[i9 - 1];
            }
            return 0;
        }

        public boolean isCachable() {
            if (this.iTailZone != null) {
                return true;
            }
            long[] jArr = this.iTransitions;
            if (jArr.length <= 1) {
                return false;
            }
            double d9 = 0.0d;
            int i9 = 0;
            for (int i10 = 1; i10 < jArr.length; i10++) {
                long j9 = jArr[i10] - jArr[i10 - 1];
                if (j9 < 63158400000L) {
                    d9 += j9;
                    i9++;
                }
            }
            return i9 > 0 && (d9 / ((double) i9)) / 8.64E7d >= 25.0d;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j9) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j9);
            int i9 = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
            if (i9 < jArr.length) {
                return jArr[i9];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j9;
            }
            long j10 = jArr[jArr.length - 1];
            if (j9 < j10) {
                j9 = j10;
            }
            return dSTZone.nextTransition(j9);
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j9) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j9);
            if (iBinarySearch >= 0) {
                return j9 > Long.MIN_VALUE ? j9 - 1 : j9;
            }
            int i9 = ~iBinarySearch;
            if (i9 < jArr.length) {
                if (i9 > 0) {
                    long j10 = jArr[i9 - 1];
                    if (j10 > Long.MIN_VALUE) {
                        return j10 - 1;
                    }
                }
                return j9;
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                long jPreviousTransition = dSTZone.previousTransition(j9);
                if (jPreviousTransition < j9) {
                    return jPreviousTransition;
                }
            }
            long j11 = jArr[i9 - 1];
            return j11 > Long.MIN_VALUE ? j11 - 1 : j9;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            int length = this.iTransitions.length;
            HashSet hashSet = new HashSet();
            for (int i9 = 0; i9 < length; i9++) {
                hashSet.add(this.iNameKeys[i9]);
            }
            int size = hashSet.size();
            if (size > 65535) {
                throw new UnsupportedOperationException("String pool is too large");
            }
            String[] strArr = new String[size];
            Iterator it = hashSet.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                strArr[i10] = (String) it.next();
                i10++;
            }
            dataOutput.writeShort(size);
            for (int i11 = 0; i11 < size; i11++) {
                dataOutput.writeUTF(strArr[i11]);
            }
            dataOutput.writeInt(length);
            for (int i12 = 0; i12 < length; i12++) {
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iTransitions[i12]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iWallOffsets[i12]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffsets[i12]);
                String str = this.iNameKeys[i12];
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        break;
                    }
                    if (!strArr[i13].equals(str)) {
                        i13++;
                    } else if (size < 256) {
                        dataOutput.writeByte(i13);
                    } else {
                        dataOutput.writeShort(i13);
                    }
                }
            }
            dataOutput.writeBoolean(this.iTailZone != null);
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                dSTZone.writeTo(dataOutput);
            }
        }
    }

    public static final class Recurrence {
        final String iNameKey;
        final OfYear iOfYear;
        final int iSaveMillis;

        public Recurrence(OfYear ofYear, String str, int i9) {
            this.iOfYear = ofYear;
            this.iNameKey = str;
            this.iSaveMillis = i9;
        }

        public static Recurrence readFrom(DataInput dataInput) throws IOException {
            return new Recurrence(OfYear.readFrom(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Recurrence)) {
                return false;
            }
            Recurrence recurrence = (Recurrence) obj;
            return this.iSaveMillis == recurrence.iSaveMillis && this.iNameKey.equals(recurrence.iNameKey) && this.iOfYear.equals(recurrence.iOfYear);
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public OfYear getOfYear() {
            return this.iOfYear;
        }

        public int getSaveMillis() {
            return this.iSaveMillis;
        }

        public long next(long j9, int i9, int i10) {
            return this.iOfYear.next(j9, i9, i10);
        }

        public long previous(long j9, int i9, int i10) {
            return this.iOfYear.previous(j9, i9, i10);
        }

        public Recurrence rename(String str) {
            return new Recurrence(this.iOfYear, str, this.iSaveMillis);
        }

        public Recurrence renameAppend(String str) {
            return rename((this.iNameKey + str).intern());
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            this.iOfYear.writeTo(dataOutput);
            dataOutput.writeUTF(this.iNameKey);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iSaveMillis);
        }
    }

    public static final class Rule {
        final int iFromYear;
        final Recurrence iRecurrence;
        final int iToYear;

        public Rule(Recurrence recurrence, int i9, int i10) {
            this.iRecurrence = recurrence;
            this.iFromYear = i9;
            this.iToYear = i10;
        }

        public int getFromYear() {
            return this.iFromYear;
        }

        public String getNameKey() {
            return this.iRecurrence.getNameKey();
        }

        public OfYear getOfYear() {
            return this.iRecurrence.getOfYear();
        }

        public int getSaveMillis() {
            return this.iRecurrence.getSaveMillis();
        }

        public int getToYear() {
            return this.iToYear;
        }

        public long next(long j9, int i9, int i10) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            int i11 = i9 + i10;
            long next = this.iRecurrence.next(((j9 > Long.MIN_VALUE ? 1 : (j9 == Long.MIN_VALUE ? 0 : -1)) == 0 ? Integer.MIN_VALUE : instanceUTC.year().get(((long) i11) + j9)) < this.iFromYear ? (instanceUTC.year().set(0L, this.iFromYear) - ((long) i11)) - 1 : j9, i9, i10);
            return (next <= j9 || instanceUTC.year().get(((long) i11) + next) <= this.iToYear) ? next : j9;
        }
    }

    public static final class RuleSet {
        private static final int YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(DateTimeUtils.currentTimeMillis()) + 100;
        private String iInitialNameKey;
        private int iInitialSaveMillis;
        private ArrayList<Rule> iRules;
        private int iStandardOffset;
        private OfYear iUpperOfYear;
        private int iUpperYear;

        public RuleSet() {
            this.iRules = new ArrayList<>(10);
            this.iUpperYear = a.e.API_PRIORITY_OTHER;
        }

        public RuleSet(RuleSet ruleSet) {
            this.iStandardOffset = ruleSet.iStandardOffset;
            this.iRules = new ArrayList<>(ruleSet.iRules);
            this.iInitialNameKey = ruleSet.iInitialNameKey;
            this.iInitialSaveMillis = ruleSet.iInitialSaveMillis;
            this.iUpperYear = ruleSet.iUpperYear;
            this.iUpperOfYear = ruleSet.iUpperOfYear;
        }

        public void addRule(Rule rule) {
            if (this.iRules.contains(rule)) {
                return;
            }
            this.iRules.add(rule);
        }

        public DSTZone buildTailZone(String str) {
            if (this.iRules.size() != 2) {
                return null;
            }
            Rule rule = this.iRules.get(0);
            Rule rule2 = this.iRules.get(1);
            if (rule.getToYear() == Integer.MAX_VALUE && rule2.getToYear() == Integer.MAX_VALUE) {
                return new DSTZone(str, this.iStandardOffset, rule.iRecurrence, rule2.iRecurrence);
            }
            return null;
        }

        public Transition firstTransition(long j9) {
            String str = this.iInitialNameKey;
            if (str != null) {
                int i9 = this.iStandardOffset;
                return new Transition(j9, str, i9 + this.iInitialSaveMillis, i9);
            }
            ArrayList<Rule> arrayList = new ArrayList<>(this.iRules);
            long j10 = Long.MIN_VALUE;
            int saveMillis = 0;
            Transition transition = null;
            while (true) {
                Transition transitionNextTransition = nextTransition(j10, saveMillis);
                if (transitionNextTransition == null) {
                    break;
                }
                long millis = transitionNextTransition.getMillis();
                if (millis == j9) {
                    transition = new Transition(j9, transitionNextTransition);
                    break;
                }
                if (millis > j9) {
                    if (transition == null) {
                        Iterator<Rule> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Rule next = it.next();
                            if (next.getSaveMillis() == 0) {
                                transition = new Transition(j9, next, this.iStandardOffset);
                                break;
                            }
                        }
                    }
                    if (transition == null) {
                        String nameKey = transitionNextTransition.getNameKey();
                        int i10 = this.iStandardOffset;
                        transition = new Transition(j9, nameKey, i10, i10);
                    }
                } else {
                    transition = new Transition(j9, transitionNextTransition);
                    saveMillis = transitionNextTransition.getSaveMillis();
                    j10 = millis;
                }
            }
            this.iRules = arrayList;
            return transition;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public long getUpperLimit(int i9) {
            int i10 = this.iUpperYear;
            if (i10 == Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            return this.iUpperOfYear.setInstant(i10, this.iStandardOffset, i9);
        }

        public Transition nextTransition(long j9, int i9) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            Iterator<Rule> it = this.iRules.iterator();
            long j10 = Long.MAX_VALUE;
            Rule rule = null;
            while (it.hasNext()) {
                Rule next = it.next();
                long next2 = next.next(j9, this.iStandardOffset, i9);
                if (next2 <= j9) {
                    it.remove();
                } else if (next2 <= j10) {
                    rule = next;
                    j10 = next2;
                }
            }
            if (rule == null || instanceUTC.year().get(j10) >= YEAR_LIMIT) {
                return null;
            }
            int i10 = this.iUpperYear;
            if (i10 >= Integer.MAX_VALUE || j10 < this.iUpperOfYear.setInstant(i10, this.iStandardOffset, i9)) {
                return new Transition(j10, rule, this.iStandardOffset);
            }
            return null;
        }

        public void setFixedSavings(String str, int i9) {
            this.iInitialNameKey = str;
            this.iInitialSaveMillis = i9;
        }

        public void setStandardOffset(int i9) {
            this.iStandardOffset = i9;
        }

        public void setUpperLimit(int i9, OfYear ofYear) {
            this.iUpperYear = i9;
            this.iUpperOfYear = ofYear;
        }
    }

    public static final class Transition {
        private final long iMillis;
        private final String iNameKey;
        private final int iStandardOffset;
        private final int iWallOffset;

        public Transition(long j9, String str, int i9, int i10) {
            this.iMillis = j9;
            this.iNameKey = str;
            this.iWallOffset = i9;
            this.iStandardOffset = i10;
        }

        public Transition(long j9, Rule rule, int i9) {
            this.iMillis = j9;
            this.iNameKey = rule.getNameKey();
            this.iWallOffset = rule.getSaveMillis() + i9;
            this.iStandardOffset = i9;
        }

        public Transition(long j9, Transition transition) {
            this.iMillis = j9;
            this.iNameKey = transition.iNameKey;
            this.iWallOffset = transition.iWallOffset;
            this.iStandardOffset = transition.iStandardOffset;
        }

        public long getMillis() {
            return this.iMillis;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public int getSaveMillis() {
            return this.iWallOffset - this.iStandardOffset;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public int getWallOffset() {
            return this.iWallOffset;
        }

        public boolean isTransitionFrom(Transition transition) {
            if (transition == null) {
                return true;
            }
            return this.iMillis > transition.iMillis && !(this.iWallOffset == transition.iWallOffset && this.iNameKey.equals(transition.iNameKey));
        }
    }

    private boolean addTransition(ArrayList<Transition> arrayList, Transition transition) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(transition);
            return true;
        }
        int i9 = size - 1;
        Transition transition2 = arrayList.get(i9);
        if (!transition.isTransitionFrom(transition2)) {
            return false;
        }
        if (transition.getMillis() + ((long) transition2.getWallOffset()) != transition2.getMillis() + ((long) (size >= 2 ? arrayList.get(size - 2).getWallOffset() : 0))) {
            arrayList.add(transition);
            return true;
        }
        arrayList.remove(i9);
        return addTransition(arrayList, transition);
    }

    private static DateTimeZone buildFixedZone(String str, String str2, int i9, int i10) {
        return ("UTC".equals(str) && str.equals(str2) && i9 == 0 && i10 == 0) ? DateTimeZone.UTC : new FixedDateTimeZone(str, str2, i9, i10);
    }

    private RuleSet getLastRuleSet() {
        if (this.iRuleSets.size() == 0) {
            addCutover(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        }
        return this.iRuleSets.get(r0.size() - 1);
    }

    public static DateTimeZone readFrom(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(dataInput, str));
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return PrecalculatedZone.readFrom(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) readMillis(dataInput), (int) readMillis(dataInput));
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DateTimeZone readFrom(InputStream inputStream, String str) throws IOException {
        return inputStream instanceof DataInput ? readFrom((DataInput) inputStream, str) : readFrom((DataInput) new DataInputStream(inputStream), str);
    }

    public static long readMillis(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j9;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i9 = unsignedByte2 >> 6;
        if (i9 == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j9 = 60000;
        } else if (i9 == 2) {
            unsignedByte = ((((long) unsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j9 = 1000;
        } else {
            if (i9 == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j9 = 1800000;
        }
        return unsignedByte * j9;
    }

    public static void writeMillis(DataOutput dataOutput, long j9) throws IOException {
        if (j9 % 1800000 == 0) {
            long j10 = j9 / 1800000;
            if (((j10 << 58) >> 58) == j10) {
                dataOutput.writeByte((int) (j10 & 63));
                return;
            }
        }
        if (j9 % 60000 == 0) {
            long j11 = j9 / 60000;
            if (((j11 << 34) >> 34) == j11) {
                dataOutput.writeInt(1073741824 | ((int) (1073741823 & j11)));
                return;
            }
        }
        if (j9 % 1000 == 0) {
            long j12 = j9 / 1000;
            if (((j12 << 26) >> 26) == j12) {
                dataOutput.writeByte(((int) ((j12 >> 32) & 63)) | 128);
                dataOutput.writeInt((int) j12);
                return;
            }
        }
        dataOutput.writeByte(j9 < 0 ? 255 : 192);
        dataOutput.writeLong(j9);
    }

    public DateTimeZoneBuilder addCutover(int i9, char c9, int i10, int i11, int i12, boolean z9, int i13) {
        if (this.iRuleSets.size() > 0) {
            this.iRuleSets.get(r10.size() - 1).setUpperLimit(i9, new OfYear(c9, i10, i11, i12, z9, i13));
        }
        this.iRuleSets.add(new RuleSet());
        return this;
    }

    public DateTimeZoneBuilder addRecurringSavings(String str, int i9, int i10, int i11, char c9, int i12, int i13, int i14, boolean z9, int i15) {
        if (i10 <= i11) {
            getLastRuleSet().addRule(new Rule(new Recurrence(new OfYear(c9, i12, i13, i14, z9, i15), str, i9), i10, i11));
        }
        return this;
    }

    public DateTimeZoneBuilder setFixedSavings(String str, int i9) {
        getLastRuleSet().setFixedSavings(str, i9);
        return this;
    }

    public DateTimeZoneBuilder setStandardOffset(int i9) {
        getLastRuleSet().setStandardOffset(i9);
        return this;
    }

    public DateTimeZone toDateTimeZone(String str, boolean z9) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        ArrayList<Transition> arrayList = new ArrayList<>();
        int size = this.iRuleSets.size();
        DSTZone dSTZoneBuildTailZone = null;
        long upperLimit = Long.MIN_VALUE;
        for (int i9 = 0; i9 < size; i9++) {
            RuleSet ruleSet = this.iRuleSets.get(i9);
            Transition transitionFirstTransition = ruleSet.firstTransition(upperLimit);
            if (transitionFirstTransition != null) {
                addTransition(arrayList, transitionFirstTransition);
                long millis = transitionFirstTransition.getMillis();
                int saveMillis = transitionFirstTransition.getSaveMillis();
                RuleSet ruleSet2 = new RuleSet(ruleSet);
                while (true) {
                    Transition transitionNextTransition = ruleSet2.nextTransition(millis, saveMillis);
                    if (transitionNextTransition == null || (addTransition(arrayList, transitionNextTransition) && dSTZoneBuildTailZone != null)) {
                        break;
                    }
                    long millis2 = transitionNextTransition.getMillis();
                    int saveMillis2 = transitionNextTransition.getSaveMillis();
                    if (dSTZoneBuildTailZone == null && i9 == size - 1) {
                        dSTZoneBuildTailZone = ruleSet2.buildTailZone(str);
                    }
                    saveMillis = saveMillis2;
                    millis = millis2;
                }
                upperLimit = ruleSet2.getUpperLimit(saveMillis);
            }
        }
        if (arrayList.size() == 0) {
            return dSTZoneBuildTailZone != null ? dSTZoneBuildTailZone : buildFixedZone(str, "UTC", 0, 0);
        }
        if (arrayList.size() == 1 && dSTZoneBuildTailZone == null) {
            Transition transition = arrayList.get(0);
            return buildFixedZone(str, transition.getNameKey(), transition.getWallOffset(), transition.getStandardOffset());
        }
        PrecalculatedZone precalculatedZoneCreate = PrecalculatedZone.create(str, z9, arrayList, dSTZoneBuildTailZone);
        return precalculatedZoneCreate.isCachable() ? CachedDateTimeZone.forZone(precalculatedZoneCreate) : precalculatedZoneCreate;
    }

    public void writeTo(String str, DataOutput dataOutput) throws IOException {
        DateTimeZone dateTimeZone = toDateTimeZone(str, false);
        if (dateTimeZone instanceof FixedDateTimeZone) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(dateTimeZone.getNameKey(0L));
            writeMillis(dataOutput, dateTimeZone.getOffset(0L));
            writeMillis(dataOutput, dateTimeZone.getStandardOffset(0L));
            return;
        }
        if (dateTimeZone instanceof CachedDateTimeZone) {
            dataOutput.writeByte(67);
            dateTimeZone = ((CachedDateTimeZone) dateTimeZone).getUncachedZone();
        } else {
            dataOutput.writeByte(80);
        }
        ((PrecalculatedZone) dateTimeZone).writeTo(dataOutput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeTo(String str, OutputStream outputStream) throws IOException {
        if (outputStream instanceof DataOutput) {
            writeTo(str, (DataOutput) outputStream);
        } else {
            writeTo(str, (DataOutput) new DataOutputStream(outputStream));
        }
    }
}
