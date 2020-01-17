package ru.startandroid.develop.fit_quest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityStart extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);

        Button buttonRules = (Button)findViewById(R.id.buttonRules);
        buttonRules.setOnClickListener(this);
    }

    public void onClick(View view){
        String alert1 = "asf";

        switch (view.getId()) {

            case R.id.buttonRules:
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivityStart.this);
                builder.setTitle("Совсем-совсем немножко правил:")
                        .setMessage("Вся 'карта' состоит из трёх видов теста:" + "\n" +
                                "1. Выбор одного варианта ответа - всегда один вариант, без обмана;" + "\n" +
                                "2. Выбор нескольких вариантов ответа - кто знает сколько их там..;" + "\n" +
                                "3. Вопрос-испытание - чтобы получить ответ на такой вопрос - необходимо посетить соответствующий 'Участок', где бравые студенты заставят тебя попотеть над получением ответа (поиск местонахождения участка так же является испытанием)." + "\n" +
                                "Как только ты ответишь на все вопросы, то смело нажимай на кнопку 'Проверить', это даст тебе понять какой процент ответов у тебя правильный." + "\n" +
                                "В случае если у тебя все ответы будут правильными, то смело действуй указанным там инструкциям, герой." + "\n" +
                                "Действуй так, как считаешь нужным, главное, чтобы ты получил как можно больше веселья в этом приключении!" + "\n" +
                                "Удачи!")
                        .setCancelable(false)
                        .setNegativeButton("Понял-принял",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
                break;

            case R.id.button:
                Intent i;
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
        }

    }

    public void onClick2(View view){


    }

}
