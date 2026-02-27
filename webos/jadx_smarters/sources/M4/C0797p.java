package M4;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.achartengine.chart.TimeChart;

/* JADX INFO: renamed from: M4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0797p extends F2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AccountManager f4983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f4984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4985g;

    public C0797p(C0776l2 c0776l2) {
        super(c0776l2);
    }

    @Override // M4.F2
    public final boolean j() {
        Calendar calendar = Calendar.getInstance();
        this.f4981c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f4982d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    public final long o() {
        h();
        return this.f4985g;
    }

    public final long p() {
        k();
        return this.f4981c;
    }

    public final String q() {
        k();
        return this.f4982d;
    }

    public final void r() {
        h();
        this.f4984f = null;
        this.f4985g = 0L;
    }

    public final boolean s() {
        h();
        long jA = this.f4245a.a().a();
        if (jA - this.f4985g > TimeChart.DAY) {
            this.f4984f = null;
        }
        Boolean bool = this.f4984f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (E.b.checkSelfPermission(this.f4245a.c(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f4245a.d().y().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f4983e == null) {
                this.f4983e = AccountManager.get(this.f4245a.c());
            }
            try {
                Account[] result = this.f4983e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.f4984f = Boolean.TRUE;
                    this.f4985g = jA;
                    return true;
                }
                Account[] result2 = this.f4983e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f4984f = Boolean.TRUE;
                    this.f4985g = jA;
                    return true;
                }
            } catch (AuthenticatorException e9) {
                e = e9;
                this.f4245a.d().t().b("Exception checking account types", e);
            } catch (OperationCanceledException e10) {
                e = e10;
                this.f4245a.d().t().b("Exception checking account types", e);
            } catch (IOException e11) {
                e = e11;
                this.f4245a.d().t().b("Exception checking account types", e);
            }
        }
        this.f4985g = jA;
        this.f4984f = Boolean.FALSE;
        return false;
    }
}
