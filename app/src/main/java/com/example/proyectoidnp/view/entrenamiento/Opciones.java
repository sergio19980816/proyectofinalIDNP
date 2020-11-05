package com.example.proyectoidnp.view.entrenamiento;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.proyectoidnp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Opciones#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Opciones extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private final int[] BOTONESMENU={R.id.caminar, R.id.correr,R.id.bicicleta};
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Opciones() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Opciones.
     */
    // TODO: Rename and change types and number of parameters
    public static Opciones newInstance(String param1, String param2) {
        Opciones fragment = new Opciones();
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
        View mimenu=inflater.inflate(R.layout.fragment_opciones, container, false);
        Button botonmenu;
        for(int i=0;i<BOTONESMENU.length;i++){
            botonmenu=(Button)mimenu.findViewById(BOTONESMENU[i]);
            final int queboton=i;
            botonmenu.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Activity estaActividad=getActivity();
                    ((ComunicaMenu)estaActividad).menu(queboton);
                }
            });
        }
        return mimenu;
    }
}