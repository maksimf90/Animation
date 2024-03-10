package com.example.animation;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // При нажатии на кнопку
                imageView.setVisibility(View.VISIBLE); // Показываем изображение
                rotateImage(); // Запускаем анимацию вращения
            }
        });
    }

    private void rotateImage() {
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(3000); // Длительность анимации - 3 секунды
        rotateAnimation.setRepeatCount(Animation.INFINITE); // Бесконечное повторение анимации
        imageView.startAnimation(rotateAnimation); // Запускаем анимацию на изображении
    }
}