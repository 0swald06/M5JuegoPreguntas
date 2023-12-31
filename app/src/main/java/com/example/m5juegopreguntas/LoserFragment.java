package com.example.m5juegopreguntas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m5juegopreguntas.databinding.FragmentLoserBinding;
import com.example.m5juegopreguntas.databinding.FragmentStartBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoserFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoserFragment extends Fragment {
    private FragmentLoserBinding mBinding;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LoserFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoserFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoserFragment newInstance(String param1, String param2) {
        LoserFragment fragment = new LoserFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentLoserBinding.inflate(inflater,container,false);
        mBinding.denuevo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.loserFragment, QuestionFragment.newInstance("Hola","Hola"));
                fragmentTransaction.commit();

                mBinding.denuevo.setVisibility(View.GONE);
                mBinding.text.setVisibility(View.GONE);

            }
        });
        return mBinding.getRoot();
    }
}