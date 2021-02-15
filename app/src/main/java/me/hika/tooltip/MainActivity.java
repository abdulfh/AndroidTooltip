package me.hika.tooltip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.ArrowPositionRules;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAnimation;
import com.skydoves.balloon.BalloonSizeSpec;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnTooltip;
    ImageView imageView;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        btnTooltip = findViewById( R.id.btnTooltip );
        btnTooltip.setOnClickListener( this );

        imageView = findViewById( R.id.imgView );
        imageView.setOnClickListener( this );
    }

    @Override
    public void onClick( View view ) {
        switch (view.getId()) {
            case R.id.btnTooltip:
                showtooltip(view);
                break;
            case R.id.imgView:
                showtooltip( view );
                break;
        }
    }

    private void showtooltip(View view) {
        Context context = MainActivity.this;
        Balloon balloon = new Balloon.Builder( context )
                .setArrowSize(10)
                .setArrowOrientation( ArrowOrientation.TOP)
                .setArrowPositionRules( ArrowPositionRules.ALIGN_ANCHOR)
                .setArrowPosition(0.5f)
                .setWidth( BalloonSizeSpec.WRAP)
                .setHeight(65)
                .setTextSize(15f)
                .setCornerRadius(4f)
                .setAlpha(0.9f)
                .setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum ")
                .setTextIsHtml(true)
                .setBalloonAnimation( BalloonAnimation.FADE)
                .build();
        balloon.showAlignTop( view, 0, -30 );
    }
}