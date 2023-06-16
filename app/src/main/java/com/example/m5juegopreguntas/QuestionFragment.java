package com.example.m5juegopreguntas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.m5juegopreguntas.databinding.FragmentQuestionBinding;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link QuestionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuestionFragment extends Fragment {
    private FragmentQuestionBinding mBinding;
    TextView etname;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public QuestionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment QuestionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QuestionFragment newInstance(String param1, String param2) {
        QuestionFragment fragment = new QuestionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().setFragmentResultListener("key", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
                String name = bundle.getString("name");
                etname.setText("Hola "+name);

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentQuestionBinding.inflate(inflater,container,false);
        FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        mBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mBinding.rbFace.isChecked()==true){
                    fragmentTransaction.replace(R.id.fragmentQuestion,WinnerFragment.newInstance("Hola","Hola"));
                    fragmentTransaction.commit();
                    mBinding.button.setVisibility(View.GONE);
                    mBinding.imageView2.setVisibility(View.GONE);
                    mBinding.radiogroup.setVisibility(View.GONE);
                    mBinding.bienvenido.setVisibility(View.GONE);
                } else if (mBinding.rbi.isChecked()==true) {
                    fragmentTransaction.replace(R.id.fragmentQuestion,LoserFragment.newInstance("Hola","Hola"));
                    fragmentTransaction.commit();
                    mBinding.button.setVisibility(View.GONE);
                    mBinding.imageView2.setVisibility(View.GONE);
                    mBinding.radiogroup.setVisibility(View.GONE);
                    mBinding.bienvenido.setVisibility(View.GONE);

                }else if (mBinding.rbw.isChecked()==true) {
                    fragmentTransaction.replace(R.id.fragmentQuestion,LoserFragment.newInstance("Hola","Hola"));
                    fragmentTransaction.commit();
                    mBinding.button.setVisibility(View.GONE);
                    mBinding.imageView2.setVisibility(View.GONE);
                    mBinding.radiogroup.setVisibility(View.GONE);
                    mBinding.bienvenido.setVisibility(View.GONE);

                }else if (mBinding.rbt.isChecked()==true) {
                    fragmentTransaction.replace(R.id.fragmentQuestion,LoserFragment.newInstance("Hola","Hola"));
                    fragmentTransaction.commit();
                    mBinding.button.setVisibility(View.GONE);
                    mBinding.imageView2.setVisibility(View.GONE);
                    mBinding.radiogroup.setVisibility(View.GONE);
                    mBinding.bienvenido.setVisibility(View.GONE);

                }

            }
        });
        return mBinding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle saverdInstanceState){
        super.onViewCreated(view,saverdInstanceState);
        etname=view.findViewById(R.id.bienvenido);


    }
}