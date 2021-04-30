package com.example.hw5;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ColorPicture extends AppCompatActivity {

    ImageView image;
    Button b1;
    Button b2;
    Button b3;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_picture);
        b1 = (Button)findViewById(R.id.button2);
        b2 = (Button)findViewById(R.id.button3);
        b3 = (Button)findViewById(R.id.button4);
        b4 = (Button)findViewById(R.id.button5);
        image = (ImageView) findViewById(R.id.picture);
        Bundle extras = getIntent().getExtras();
        Bitmap picture = (Bitmap) extras.get("picture");
        image.setImageBitmap(picture);
        Drawer draw = new Drawer(this);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                draw.setColor("Red");
                setContentView(draw);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                draw.setColor("Blue");
                setContentView(draw);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                draw.setColor("Green");
                setContentView(draw);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ColorPicture.this, MainActivity.class);
                ColorPicture.this.startActivity(intent);
            }
        });
    }

    public ImageView getImage(){
        return image;
    }
}
