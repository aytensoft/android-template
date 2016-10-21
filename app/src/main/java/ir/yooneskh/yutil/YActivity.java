package ir.yooneskh.yutil;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.afollestad.materialdialogs.MaterialDialog;

import ir.aytensoft.androidtemplate.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by Yoones on 05/08/2016.
 */

public abstract class YActivity extends AppCompatActivity {

    public final YActivity self = this;
    public Toolbar toolbar;

    MaterialDialog progressDialog = null;

    public void yShowLoading(String title) {
        progressDialog = new MaterialDialog.Builder(this)
                .title(title)
                .progress(true, 0)
                .show();
    }

    public void yShowLoading(String title, String description) {
        progressDialog = new MaterialDialog.Builder(this)
                .title(title)
                .content(description)
                .progress(true, 0)
                .show();
    }

    public void yHideLoading() {
        progressDialog.hide();
        progressDialog = null;
    }

    public void ySetupToolbar() {
        toolbar = (Toolbar)findViewById(R.id._toolbar);
        setSupportActionBar(toolbar);
    }

    public void ySetTitle(String title) {
        getSupportActionBar().setTitle(getString(R.string.app_name) + " - " + title);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/irs.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

}
