package U;

import U.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9570a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cursor f9572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f9573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0121a f9575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DataSetObserver f9576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public U.b f9577i;

    /* JADX INFO: renamed from: U.a$a, reason: collision with other inner class name */
    public class C0121a extends ContentObserver {
        public C0121a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9) {
            a.this.i();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f9570a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f9570a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z9) {
        f(context, cursor, z9 ? 1 : 2);
    }

    @Override // U.b.a
    public void a(Cursor cursor) {
        Cursor cursorJ = j(cursor);
        if (cursorJ != null) {
            cursorJ.close();
        }
    }

    @Override // U.b.a
    public abstract CharSequence b(Cursor cursor);

    @Override // U.b.a
    public Cursor d() {
        return this.f9572d;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i9) {
        b bVar;
        if ((i9 & 1) == 1) {
            i9 |= 2;
            this.f9571c = true;
        } else {
            this.f9571c = false;
        }
        boolean z9 = cursor != null;
        this.f9572d = cursor;
        this.f9570a = z9;
        this.f9573e = context;
        this.f9574f = z9 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i9 & 2) == 2) {
            this.f9575g = new C0121a();
            bVar = new b();
        } else {
            bVar = null;
            this.f9575g = null;
        }
        this.f9576h = bVar;
        if (z9) {
            C0121a c0121a = this.f9575g;
            if (c0121a != null) {
                cursor.registerContentObserver(c0121a);
            }
            DataSetObserver dataSetObserver = this.f9576h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f9570a || (cursor = this.f9572d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i9, View view, ViewGroup viewGroup) {
        if (!this.f9570a) {
            return null;
        }
        this.f9572d.moveToPosition(i9);
        if (view == null) {
            view = g(this.f9573e, this.f9572d, viewGroup);
        }
        e(view, this.f9573e, this.f9572d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f9577i == null) {
            this.f9577i = new U.b(this);
        }
        return this.f9577i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i9) {
        Cursor cursor;
        if (!this.f9570a || (cursor = this.f9572d) == null) {
            return null;
        }
        cursor.moveToPosition(i9);
        return this.f9572d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        Cursor cursor;
        if (this.f9570a && (cursor = this.f9572d) != null && cursor.moveToPosition(i9)) {
            return this.f9572d.getLong(this.f9574f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i9, View view, ViewGroup viewGroup) {
        if (!this.f9570a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f9572d.moveToPosition(i9)) {
            if (view == null) {
                view = h(this.f9573e, this.f9572d, viewGroup);
            }
            e(view, this.f9573e, this.f9572d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i9);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (!this.f9571c || (cursor = this.f9572d) == null || cursor.isClosed()) {
            return;
        }
        this.f9570a = this.f9572d.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f9572d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0121a c0121a = this.f9575g;
            if (c0121a != null) {
                cursor2.unregisterContentObserver(c0121a);
            }
            DataSetObserver dataSetObserver = this.f9576h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f9572d = cursor;
        if (cursor != null) {
            C0121a c0121a2 = this.f9575g;
            if (c0121a2 != null) {
                cursor.registerContentObserver(c0121a2);
            }
            DataSetObserver dataSetObserver2 = this.f9576h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f9574f = cursor.getColumnIndexOrThrow("_id");
            this.f9570a = true;
            notifyDataSetChanged();
        } else {
            this.f9574f = -1;
            this.f9570a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
