package com.example.lab5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        // Áp dụng hiệu ứng từ XML cho từng nút
        findViewById(R.id.btn_fade_in_xml).setOnClickListener(view -> {
            Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
            imageView.startAnimation(fadeIn);
        });

        findViewById(R.id.btn_fade_out_xml).setOnClickListener(view -> {
            Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
            imageView.startAnimation(fadeOut);
        });

        findViewById(R.id.btn_blink_xml).setOnClickListener(view -> {
            Animation blink = AnimationUtils.loadAnimation(this, R.anim.blink);
            imageView.startAnimation(blink);
        });

        findViewById(R.id.btn_zoom_in_xml).setOnClickListener(view -> {
            Animation zoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
            imageView.startAnimation(zoomIn);
        });

        findViewById(R.id.btn_zoom_out_xml).setOnClickListener(view -> {
            Animation zoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out);
            imageView.startAnimation(zoomOut);
        });

        findViewById(R.id.btn_rotate_xml).setOnClickListener(view -> {
            Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
            imageView.startAnimation(rotate);
        });

        findViewById(R.id.btn_move_xml).setOnClickListener(view -> {
            Animation move = AnimationUtils.loadAnimation(this, R.anim.move);
            imageView.startAnimation(move);
        });

        findViewById(R.id.btn_slide_up_xml).setOnClickListener(view -> {
            Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);
            imageView.startAnimation(slideUp);
        });

        findViewById(R.id.btn_bounce_xml).setOnClickListener(view -> {
            Animation bounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
            imageView.startAnimation(bounce);
        });

        findViewById(R.id.btn_combine_xml).setOnClickListener(view -> {
            Animation combine = AnimationUtils.loadAnimation(this, R.anim.combine);
            imageView.startAnimation(combine);
        });

        // FADE IN bằng code
        Button btnFadeInCode = findViewById(R.id.btn_fade_in_code);
        btnFadeInCode.setOnClickListener(view -> {
            AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
            fadeIn.setDuration(1000);
            imageView.startAnimation(fadeIn);
        });

        // FADE OUT bằng code
        Button btnFadeOutCode = findViewById(R.id.btn_fade_out_code);
        btnFadeOutCode.setOnClickListener(view -> {
            AlphaAnimation fadeOut = new AlphaAnimation(1.0f, 0.0f);
            fadeOut.setDuration(1000);
            imageView.startAnimation(fadeOut);
        });

        // BLINK bằng code
        Button btnBlinkCode = findViewById(R.id.btn_blink_code);
        btnBlinkCode.setOnClickListener(view -> {
            AlphaAnimation blink = new AlphaAnimation(1.0f, 0.0f);
            blink.setDuration(300);
            blink.setRepeatMode(Animation.REVERSE);
            blink.setRepeatCount(Animation.INFINITE);
            imageView.startAnimation(blink);
        });

        // ZOOM IN bằng code
        Button btnZoomInCode = findViewById(R.id.btn_zoom_in_code);
        btnZoomInCode.setOnClickListener(view -> {
            ScaleAnimation zoomIn = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            zoomIn.setDuration(500);
            imageView.startAnimation(zoomIn);
        });

        // ZOOM OUT bằng code
        Button btnZoomOutCode = findViewById(R.id.btn_zoom_out_code);
        btnZoomOutCode.setOnClickListener(view -> {
            ScaleAnimation zoomOut = new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            zoomOut.setDuration(500);
            imageView.startAnimation(zoomOut);
        });

        // ROTATE bằng code
        Button btnRotateCode = findViewById(R.id.btn_rotate_code);
        btnRotateCode.setOnClickListener(view -> {
            RotateAnimation rotate = new RotateAnimation(0, 360,
                    Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            rotate.setDuration(1000);
            imageView.startAnimation(rotate);
        });

        // MOVE bằng code
        Button btnMoveCode = findViewById(R.id.btn_move_code);
        btnMoveCode.setOnClickListener(view -> {
            TranslateAnimation move = new TranslateAnimation(0, 300, 0, 0);
            move.setDuration(1000);
            imageView.startAnimation(move);
        });

        // SLIDE UP bằng code
        Button btnSlideUpCode = findViewById(R.id.btn_slide_up_code);
        btnSlideUpCode.setOnClickListener(view -> {
            TranslateAnimation slideUp = new TranslateAnimation(0, 0, imageView.getHeight(), 0);
            slideUp.setDuration(1000);
            imageView.startAnimation(slideUp);
        });

        // BOUNCE bằng code
        Button btnBounceCode = findViewById(R.id.btn_bounce_code);
        btnBounceCode.setOnClickListener(view -> {
            ScaleAnimation bounce = new ScaleAnimation(0.7f, 1.0f, 0.7f, 1.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            bounce.setDuration(500);
            bounce.setInterpolator(new BounceInterpolator());
            imageView.startAnimation(bounce);
        });

        // COMBINE (kết hợp ZOOM và ROTATE) bằng code
        Button btnCombineCode = findViewById(R.id.btn_combine_code);
        btnCombineCode.setOnClickListener(view -> {
            AnimationSet combine = new AnimationSet(true);

            // Zoom
            ScaleAnimation zoom = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            zoom.setDuration(500);

            // Rotate
            RotateAnimation rotate = new RotateAnimation(0, 360,
                    Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            rotate.setDuration(500);

            combine.addAnimation(zoom);
            combine.addAnimation(rotate);
            imageView.startAnimation(combine);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}