package com.kubetskiy.workout.colordescriptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerColors;
    private TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      Найти элемент графического интерфейса по его ID
        spinnerColors = findViewById(R.id.spinner); // ID спиннера из формы
        textViewDescription = findViewById(R.id.textView); // ID текст-бокса из формы
    }

    // Вызывается по нажатию кнопки
    public void colorSelected(View view) {
         int position = spinnerColors.getSelectedItemPosition();
         String description = getDescriptionByPosition(position);
         textViewDescription.setText(description);
    }
    String getDescriptionByPosition(int position) {
        String[] description = getResources().getStringArray(R.array.colorDescription);
        return description[position];
    }
}