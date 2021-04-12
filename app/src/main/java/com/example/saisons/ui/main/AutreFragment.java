package com.example.saisons.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.saisons.MainActivity;
import com.example.saisons.R;

public class AutreFragment extends Fragment {
    int image,image1,image2,image3;
    private int page;
    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_SECTION_NUMBER = "numero_page";
    private static final String ARG_SECTION_IMAGE = "titre_image";
    private static final String ARG_SECTION_IMAGE1 = "titre_image1";
    private static final String ARG_SECTION_IMAGE2 = "titre_image2";
    private static final String ARG_SECTION_IMAGE3 = "titre_image3";
    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de section donné.
     */
    public static AutreFragment newInstance(int position, String string, int image, int image1, int image2, int image3) {
        AutreFragment fragment = new AutreFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, position);
        args.putInt(ARG_SECTION_IMAGE,image);
        args.putInt(ARG_SECTION_IMAGE1,image1);
        args.putInt(ARG_SECTION_IMAGE2,image2);
        args.putInt(ARG_SECTION_IMAGE3,image3);
        fragment.setArguments(args);
        return fragment;
    }
    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(ARG_SECTION_NUMBER, 0);
        image = getArguments().getInt(ARG_SECTION_IMAGE);
        image1 = getArguments().getInt(ARG_SECTION_IMAGE1);
        image2 = getArguments().getInt(ARG_SECTION_IMAGE2);
        image3 = getArguments().getInt(ARG_SECTION_IMAGE3);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.autre_main, container, false);
        ImageView image_ = (ImageView) view.findViewById(R.id.imageView1);
        ImageView image_1 = (ImageView) view.findViewById(R.id.imageView2);
        ImageView image_2 = (ImageView) view.findViewById(R.id.imageView3);
        ImageView image_3 = (ImageView) view.findViewById(R.id.imageView4);
        image_.setImageResource(image);
        image_1.setImageResource(image1);
        image_2.setImageResource(image2);
        image_3.setImageResource(image3);

        image_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity=(MainActivity)getActivity();
                activity.viewPager.setCurrentItem(1);
            }
        });

        image_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity=(MainActivity)getActivity();
                activity.viewPager.setCurrentItem(2);
            }
        });


        image_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity=(MainActivity)getActivity();
                activity.viewPager.setCurrentItem(3);
            }
        });

        image_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity=(MainActivity)getActivity();
                activity.viewPager.setCurrentItem(4);
            }
        });
        return view;
    }
}


