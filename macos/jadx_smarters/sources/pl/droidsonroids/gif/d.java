package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[][] f46726a;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i9) {
            return new d[i9];
        }
    }

    public d(Parcel parcel) {
        super(parcel);
        this.f46726a = new long[parcel.readInt()][];
        int i9 = 0;
        while (true) {
            long[][] jArr = this.f46726a;
            if (i9 >= jArr.length) {
                return;
            }
            jArr[i9] = parcel.createLongArray();
            i9++;
        }
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    public d(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f46726a = new long[drawableArr.length][];
        for (int i9 = 0; i9 < drawableArr.length; i9++) {
            Drawable drawable = drawableArr[i9];
            if (drawable instanceof pl.droidsonroids.gif.a) {
                this.f46726a[i9] = ((pl.droidsonroids.gif.a) drawable).f46710h.j();
            } else {
                this.f46726a[i9] = null;
            }
        }
    }

    public void a(Drawable drawable, int i9) {
        if (this.f46726a[i9] == null || !(drawable instanceof pl.droidsonroids.gif.a)) {
            return;
        }
        ((pl.droidsonroids.gif.a) drawable).j(r3.f46710h.t(r4, r3.f46709g));
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f46726a.length);
        for (long[] jArr : this.f46726a) {
            parcel.writeLongArray(jArr);
        }
    }
}
