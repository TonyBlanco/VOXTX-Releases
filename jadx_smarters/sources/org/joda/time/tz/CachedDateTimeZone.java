package org.joda.time.tz;

import org.joda.time.DateTimeZone;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public class CachedDateTimeZone extends DateTimeZone {
    private static final int cInfoCacheMask;
    private static final long serialVersionUID = 5472298452022250685L;
    private final transient Info[] iInfoCache;
    private final DateTimeZone iZone;

    public static final class Info {
        private String iNameKey;
        Info iNextInfo;
        public final long iPeriodStart;
        public final DateTimeZone iZoneRef;
        private int iOffset = Integer.MIN_VALUE;
        private int iStandardOffset = Integer.MIN_VALUE;

        public Info(DateTimeZone dateTimeZone, long j9) {
            this.iPeriodStart = j9;
            this.iZoneRef = dateTimeZone;
        }

        public String getNameKey(long j9) {
            Info info = this.iNextInfo;
            if (info != null && j9 >= info.iPeriodStart) {
                return info.getNameKey(j9);
            }
            if (this.iNameKey == null) {
                this.iNameKey = this.iZoneRef.getNameKey(this.iPeriodStart);
            }
            return this.iNameKey;
        }

        public int getOffset(long j9) {
            Info info = this.iNextInfo;
            if (info != null && j9 >= info.iPeriodStart) {
                return info.getOffset(j9);
            }
            if (this.iOffset == Integer.MIN_VALUE) {
                this.iOffset = this.iZoneRef.getOffset(this.iPeriodStart);
            }
            return this.iOffset;
        }

        public int getStandardOffset(long j9) {
            Info info = this.iNextInfo;
            if (info != null && j9 >= info.iPeriodStart) {
                return info.getStandardOffset(j9);
            }
            if (this.iStandardOffset == Integer.MIN_VALUE) {
                this.iStandardOffset = this.iZoneRef.getStandardOffset(this.iPeriodStart);
            }
            return this.iStandardOffset;
        }
    }

    static {
        Integer integer;
        int i9;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i9 = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        } else {
            int i10 = 0;
            for (int iIntValue = integer.intValue() - 1; iIntValue > 0; iIntValue >>= 1) {
                i10++;
            }
            i9 = 1 << i10;
        }
        cInfoCacheMask = i9 - 1;
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.getID());
        this.iInfoCache = new Info[cInfoCacheMask + 1];
        this.iZone = dateTimeZone;
    }

    private Info createInfo(long j9) {
        long j10 = j9 & (-4294967296L);
        Info info = new Info(this.iZone, j10);
        long j11 = 4294967295L | j10;
        Info info2 = info;
        while (true) {
            long jNextTransition = this.iZone.nextTransition(j10);
            if (jNextTransition == j10 || jNextTransition > j11) {
                break;
            }
            Info info3 = new Info(this.iZone, jNextTransition);
            info2.iNextInfo = info3;
            info2 = info3;
            j10 = jNextTransition;
        }
        return info;
    }

    public static CachedDateTimeZone forZone(DateTimeZone dateTimeZone) {
        return dateTimeZone instanceof CachedDateTimeZone ? (CachedDateTimeZone) dateTimeZone : new CachedDateTimeZone(dateTimeZone);
    }

    private Info getInfo(long j9) {
        int i9 = (int) (j9 >> 32);
        Info[] infoArr = this.iInfoCache;
        int i10 = cInfoCacheMask & i9;
        Info info = infoArr[i10];
        if (info != null && ((int) (info.iPeriodStart >> 32)) == i9) {
            return info;
        }
        Info infoCreateInfo = createInfo(j9);
        infoArr[i10] = infoCreateInfo;
        return infoCreateInfo;
    }

    @Override // org.joda.time.DateTimeZone
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public String getNameKey(long j9) {
        return getInfo(j9).getNameKey(j9);
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j9) {
        return getInfo(j9).getOffset(j9);
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j9) {
        return getInfo(j9).getStandardOffset(j9);
    }

    public DateTimeZone getUncachedZone() {
        return this.iZone;
    }

    @Override // org.joda.time.DateTimeZone
    public int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public boolean isFixed() {
        return this.iZone.isFixed();
    }

    @Override // org.joda.time.DateTimeZone
    public long nextTransition(long j9) {
        return this.iZone.nextTransition(j9);
    }

    @Override // org.joda.time.DateTimeZone
    public long previousTransition(long j9) {
        return this.iZone.previousTransition(j9);
    }
}
