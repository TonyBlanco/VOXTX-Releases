package org.achartengine;

import android.app.Activity;
import android.os.Bundle;
import org.achartengine.chart.AbstractChart;

/* JADX INFO: loaded from: classes4.dex */
public class GraphicalActivity extends Activity {
    private AbstractChart mChart;
    private GraphicalView mView;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        this.mChart = (AbstractChart) extras.getSerializable(ChartFactory.CHART);
        this.mView = new GraphicalView(this, this.mChart);
        String string = extras.getString(ChartFactory.TITLE);
        if (string == null) {
            requestWindowFeature(1);
        } else if (string.length() > 0) {
            setTitle(string);
        }
        setContentView(this.mView);
    }
}
