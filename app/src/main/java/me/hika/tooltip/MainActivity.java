package me.hika.tooltip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnTooltip;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        btnTooltip = findViewById( R.id.btnTooltip );
        btnTooltip.setOnClickListener( this );
    }

    @Override
    public void onClick( View view ) {

    }
}