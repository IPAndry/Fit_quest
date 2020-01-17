package ru.startandroid.develop.fit_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double correctAns = 0;
    int i = 0;

    RadioGroup radioGroupQ1;
    RadioGroup radioGroupQ4;
    RadioGroup radioGroupQ5;
    RadioGroup radioGroupQ6;
    RadioGroup radioGroupQ10;
    RadioGroup radioGroupQ13;
    RadioGroup radioGroupQ18;
    RadioGroup radioGroupQ19;

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;

    EditText writtenAns;
    EditText writtenAns2;
    EditText writtenAns3;
    EditText writtenAns4;
    EditText writtenAns5;

    String selectedAnsQ1 = "";
    String selectedAnsQ4 = "";
    String selectedAnsQ5 = "";
    String selectedAnsQ6 = "";
    String selectedAnsQ10 = "";
    String selectedAnsQ13 = "";
    String selectedAnsQ18 = "";
    String selectedAnsQ19 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSelectedAns();
    }


    public void getScore(View view) {
        if (i < 1) {

            i++;
        }
        checkAns();
        double percentCorrect = (correctAns / 20) * 100;
        if (percentCorrect == 100) {
            Toast.makeText(getApplicationContext(), "Отлично! " + percentCorrect + "% из 100.0%!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ActivityWin.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Всего правильно отвечено: " + percentCorrect + "%", Toast.LENGTH_LONG).show();
        }
    }

    public void getSelectedAns() {

        radioGroupQ1 = (RadioGroup) findViewById(R.id.radioGroupQ1);
        radioGroupQ1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton4Q1) {
                    selectedAnsQ1 = "correct";
                } else {
                    Toast.makeText(getApplicationContext(), "Ну серьёзно?", Toast.LENGTH_LONG).show();
                }

            }
        });

        radioGroupQ4 = (RadioGroup) findViewById(R.id.radioGroupQ4);
        radioGroupQ4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButtonQ4:
                        selectedAnsQ4 = "correct";
                        break;
                }
            }
        });

        radioGroupQ5 = (RadioGroup) findViewById(R.id.radioGroupQ5);
        radioGroupQ5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton3Q5:
                        selectedAnsQ5 = "correct";
                        break;
                }
            }
        });

        radioGroupQ6 = (RadioGroup) findViewById(R.id.radioGroupQ6);
        radioGroupQ6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton3Q6:
                        selectedAnsQ6 = "correct";
                        break;
                }
            }
        });

        radioGroupQ10 = (RadioGroup) findViewById(R.id.radioGroupQ10);
        radioGroupQ10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButtonQ10:
                        selectedAnsQ10 = "correct";
                        break;
                }
            }
        });

        radioGroupQ13 = (RadioGroup) findViewById(R.id.radioGroupQ13);
        radioGroupQ13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButtonQ13:
                        selectedAnsQ13 = "correct";
                        break;
                }
            }
        });

        radioGroupQ18 = (RadioGroup) findViewById(R.id.radioGroupQ18);
        radioGroupQ18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButtonQ18:
                        selectedAnsQ18 = "correct";
                        break;
                }
            }
        });

        radioGroupQ19 = (RadioGroup) findViewById(R.id.radioGroupQ19);
        radioGroupQ19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButtonQ19:
                        selectedAnsQ19 = "correct";
                        break;
                }
            }
        });

    }

    public void checkAns() {

        if (selectedAnsQ1.equals("correct")) {
            correctAns++;
        }

        if (selectedAnsQ4.equals("correct")) {
            correctAns++;
        }

        if (selectedAnsQ5.equals("correct")) {
            correctAns++;
        }

        if (selectedAnsQ6.equals("correct")) {
            correctAns++;
        }

        if (selectedAnsQ10.equals("correct")) {
            correctAns++;
        }

        if (selectedAnsQ13.equals("correct")) {
            correctAns++;
        }

        if (selectedAnsQ18.equals("correct")) {
            correctAns++;
        }

        if (selectedAnsQ19.equals("correct")) {
            correctAns++;
        }

        //Чек-боксы
        checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        if (checkBox1.isChecked() == true && checkBox2.isChecked() == true && checkBox3.isChecked() == true && checkBox4.isChecked() == false) {
            correctAns++;
        }

        checkBox1 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox72);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox73);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox74);
        if (checkBox1.isChecked() == true && checkBox2.isChecked() == true && checkBox3.isChecked() == true && checkBox4.isChecked() == false) {
            correctAns++;
        }

        checkBox1 = (CheckBox) findViewById(R.id.checkBox9);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox92);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox93);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox94);
        if (checkBox1.isChecked() == true && checkBox2.isChecked() == true && checkBox3.isChecked() == true && checkBox4.isChecked() == false) {
            correctAns++;
        }

        checkBox1 = (CheckBox) findViewById(R.id.checkBox11);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox112);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox113);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox114);
        if (checkBox1.isChecked() == true && checkBox2.isChecked() == true && checkBox3.isChecked() == true && checkBox4.isChecked() == false) {
            correctAns++;
        }

        checkBox1 = (CheckBox) findViewById(R.id.checkBox14);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox142);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox143);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox144);
        if (checkBox1.isChecked() == true && checkBox2.isChecked() == true && checkBox3.isChecked() == true && checkBox4.isChecked() == false) {
            correctAns++;
        }

        checkBox1 = (CheckBox) findViewById(R.id.checkBox15);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox152);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox153);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox154);
        if (checkBox1.isChecked() == true && checkBox2.isChecked() == true && checkBox3.isChecked() == true && checkBox4.isChecked() == false) {
            correctAns++;
        }

        checkBox1 = (CheckBox) findViewById(R.id.checkBox17);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox172);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox173);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox174);
        if (checkBox1.isChecked() == true && checkBox2.isChecked() == true && checkBox3.isChecked() == true && checkBox4.isChecked() == false) {
            correctAns++;
        }
        checkBox1 = (CheckBox) findViewById(R.id.checkBox);

        //Поля вводы
        writtenAns = (EditText) findViewById(R.id.writtenAns);
        if ((writtenAns.getText().toString().equalsIgnoreCase("Ответ"))) {
            correctAns++;
        }

        writtenAns2 = (EditText) findViewById(R.id.writtenAns2);
        if ((writtenAns2.getText().toString().equalsIgnoreCase("Ответ"))) {
            correctAns++;
        }

        writtenAns3 = (EditText) findViewById(R.id.writtenAns3);
        if ((writtenAns3.getText().toString().equalsIgnoreCase("Ответ"))) {
            correctAns++;
        }

        writtenAns4 = (EditText) findViewById(R.id.writtenAns4);
        if ((writtenAns4.getText().toString().equalsIgnoreCase("Ответ"))) {
            correctAns++;
        }

        writtenAns5 = (EditText) findViewById(R.id.writtenAns5);
        if ((writtenAns5.getText().toString().equalsIgnoreCase("Ответ"))) {
            correctAns++;
        }
    }
}
