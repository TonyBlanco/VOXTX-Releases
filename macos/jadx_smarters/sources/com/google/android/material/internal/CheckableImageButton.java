package com.google.android.material.internal;

import P.C0959a;
import P.L;
import Q.C;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import c.AbstractC1238a;
import k.C2119n;

/* JADX INFO: loaded from: classes3.dex */
public class CheckableImageButton extends C2119n implements Checkable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f27467h = {R.attr.state_checked};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27470g;

    public class a extends C0959a {
        public a() {
        }

        @Override // P.C0959a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // P.C0959a
        public void g(View view, C c9) {
            super.g(view, c9);
            c9.V(CheckableImageButton.this.a());
            c9.W(CheckableImageButton.this.isChecked());
        }
    }

    public static class b extends V.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f27472d;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i9) {
                return new b[i9];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            c(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void c(Parcel parcel) {
            this.f27472d = parcel.readInt() == 1;
        }

        @Override // V.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeInt(this.f27472d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17726C);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f27469f = true;
        this.f27470g = true;
        L.s0(this, new a());
    }

    public boolean a() {
        return this.f27469f;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f27468e;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i9) {
        if (!this.f27468e) {
            return super.onCreateDrawableState(i9);
        }
        int[] iArr = f27467h;
        return View.mergeDrawableStates(super.onCreateDrawableState(i9 + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f27472d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f27472d = this.f27468e;
        return bVar;
    }

    public void setCheckable(boolean z9) {
        if (this.f27469f != z9) {
            this.f27469f = z9;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        if (!this.f27469f || this.f27468e == z9) {
            return;
        }
        this.f27468e = z9;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z9) {
        this.f27470g = z9;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        if (this.f27470g) {
            super.setPressed(z9);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f27468e);
    }
}
