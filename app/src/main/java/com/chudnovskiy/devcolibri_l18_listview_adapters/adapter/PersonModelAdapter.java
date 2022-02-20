package com.chudnovskiy.devcolibri_l18_listview_adapters.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.chudnovskiy.devcolibri_l18_listview_adapters.R;
import com.chudnovskiy.devcolibri_l18_listview_adapters.pogo.PersonModel;

import java.util.List;

public class PersonModelAdapter extends BaseAdapter {
    private final List<PersonModel> personModelList;
    private final LayoutInflater layoutInflater;

    public PersonModelAdapter(Context context, List<PersonModel> personModelList) {
        this.personModelList = personModelList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return personModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return personModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View contentView, ViewGroup viewGroup) {
        View view = contentView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_layout, viewGroup, false);
        }
        PersonModel personModel = getPersonModel(position);

        TextView textViewId = (TextView) view.findViewById(R.id.text_view_id);
        TextView textViewName = (TextView) view.findViewById(R.id.text_view_name);
        TextView textViewPatronymic = (TextView) view.findViewById(R.id.text_view_patronymic);
        TextView textViewSurname = (TextView) view.findViewById(R.id.text_view_surname);

        textViewId.setText(String.valueOf(personModel.getId()));
        textViewName.setText(personModel.getName());
        textViewPatronymic.setText(personModel.getPatronymic());
        textViewSurname.setText(personModel.getSurname());

        return view;
    }

    private PersonModel getPersonModel(int position) {
        return (PersonModel) getItem(position);
    }
}
