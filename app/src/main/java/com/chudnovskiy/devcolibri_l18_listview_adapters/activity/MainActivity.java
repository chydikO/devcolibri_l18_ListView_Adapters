package com.chudnovskiy.devcolibri_l18_listview_adapters.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.chudnovskiy.devcolibri_l18_listview_adapters.R;
import com.chudnovskiy.devcolibri_l18_listview_adapters.adapter.PersonModelAdapter;
import com.chudnovskiy.devcolibri_l18_listview_adapters.pogo.PersonModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        listView = (ListView) findViewById(R.id.listView);

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                getApplicationContext(),
//                android.R.layout.simple_list_item_1, initData());

        PersonModelAdapter personModelAdapter =
                new PersonModelAdapter(getApplicationContext(), initData());
        listView.setAdapter(personModelAdapter);
    }

    private ArrayList<PersonModel> initData() {
        PersonModel[] personModels = {
                new PersonModel("Смирнова", "Полина", "Александровна"),
                        new PersonModel("Белкин", "Артемий", "Дмитриевич"),
                        new PersonModel("Балашов", "Мирон", "Михайлович"),
                        new PersonModel("Агеева", "Татьяна", "Константиновна"),
                        new PersonModel("Миронов", "Дмитрий", "Савельевич"),
                        new PersonModel("Данилов", "Максим", "Маркович"),
                        new PersonModel("Петров", "Игорь", "Данилович"),
                        new PersonModel("Давыдов", "Иван", "Александрович"),
                        new PersonModel("Шубина", "София", "Дмитриевна"),
                        new PersonModel("Павлова", "Анастасия", "Александровна")
        };
        return new ArrayList<>(Arrays.asList(personModels));
    }
}