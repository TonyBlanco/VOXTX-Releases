package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class h extends BaseAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27279e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f27280a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27282d;

    static {
        f27279e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public h() {
        Calendar calendarK = v.k();
        this.f27280a = calendarK;
        this.f27281c = calendarK.getMaximum(7);
        this.f27282d = calendarK.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i9) {
        if (i9 >= this.f27281c) {
            return null;
        }
        return Integer.valueOf(b(i9));
    }

    public final int b(int i9) {
        int i10 = i9 + this.f27282d;
        int i11 = this.f27281c;
        return i10 > i11 ? i10 - i11 : i10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f27281c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i9, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R4.h.f8819n, viewGroup, false);
        }
        this.f27280a.set(7, b(i9));
        textView.setText(this.f27280a.getDisplayName(7, f27279e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R4.j.f8840n), this.f27280a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
