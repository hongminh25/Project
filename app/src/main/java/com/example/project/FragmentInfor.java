package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentInfor extends Fragment {
    TextView txtTen, txtNamThanhLap, txtLinhVuc, txtTruSo;
    View view;

    @Override
    public View onCreateView( LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_infor, container, false);
        AnhXa();
        return view;
    }
    public void SetInfor(SV sv) {
        txtTen.setText("Tên : " + sv.getTen());

        txtNamThanhLap.setText("Nam thanh lap : " + sv.getNamThanhLap());

        txtLinhVuc.setText("Linh vuc : " + sv.getLinhVuc());

        txtTruSo.setText("Tru so : " + sv.getTruSo());
    }
    private void AnhXa(){
        txtTen = (TextView) view.findViewById(R.id.textViewName);
        txtNamThanhLap = (TextView) view.findViewById(R.id.textViewNamThanhLap);
        txtLinhVuc = (TextView) view.findViewById(R.id.textViewLinhVuc);
        txtTruSo = (TextView) view.findViewById(R.id.textViewTruSo);
    }
}
