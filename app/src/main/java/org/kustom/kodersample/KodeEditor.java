package org.kustom.kodersample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KodeEditor extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_editor);
        // When Send Kode button is clicked we send the data back to Kustom
        findViewById(R.id.kode_send).setOnClickListener(this);
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
