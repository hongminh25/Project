package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class FragmentList extends ListFragment {
    ArrayList<SV> arrayCompany;
    CompanyAdapter adapter;
    Truyen truyen;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        truyen = (Truyen) getActivity();
        arrayCompany = new ArrayList<>();
        AddArraySV();
        adapter = new CompanyAdapter(R.layout.row_cty, getActivity(), arrayCompany);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.fragment_list, container, false);
    }
    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        truyen.DataCompany(arrayCompany.get(position));
    }
    private void AddArraySV(){
        arrayCompany.add(new SV("FPT", 1988, "Công nghệ", "Hà Nội", R.drawable.fpt));
        arrayCompany.add(new SV("Viettel", 1989, "Viễn thông", "Hà Nội",R.drawable.viettel));
        arrayCompany.add(new SV("Apple", 1976, "Công nghệ", "California, Hoa Kỳ",R.drawable.apple));
        arrayCompany.add(new SV("Microsoft", 1975, "Công nghệ", "Washington, Hoa Kỳ",R.drawable.mi));
        arrayCompany.add(new SV("Samsung", 1938, "Đa ngành", "Seoul, Hàn Quốc",R.drawable.ss));
        arrayCompany.add(new SV("Mobifone", 1993, "Viễn thông","Hà Nội", R.drawable.mobi ));
        arrayCompany.add(new SV("Tencent",1998,"Internet","Thâm Quyến, Trung Quốc", R.drawable.tencent));
        arrayCompany.add(new SV("VNPT", 2006,"Công nghệ","Hà Nội", R.drawable.vnpt));
        arrayCompany.add(new SV("Sony", 1946, "Đa ngành", "Tokyo, Nhật Bản",R.drawable.sony));
        arrayCompany.add(new SV("Intel",1968,"Vi mạch","California, Hoa Kỳ",R.drawable.intel));
    }
}
