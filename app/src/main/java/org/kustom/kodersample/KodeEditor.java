package org.kustom.kodersample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class KodeEditor extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_editor);
        // When Send Kode button is clicked we send the data back to Kustom
        findViewById(R.id.kode_send).setOnClickListener(this);
        // Set current text from source activity and change it a bit
        if (getIntent() != null) {
            String text = getIntent().getStringExtra("org.kustom.extra.KODE");
            if (text != null) {
                ((TextView) findViewById(R.id.kode_edit)).setText(text + " EDITED!");
            }
        }
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        String kode = ((TextView) findViewById(R.id.kode_edit)).getEditableText().toString();
        i.putExtra("org.kustom.KODE", kode);
        setResult(RESULT_OK, i);
        finish();
    }
}
