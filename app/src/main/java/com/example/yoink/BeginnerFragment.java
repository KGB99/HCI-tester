package com.example.yoink;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.yoink.databinding.FragmentBeginnerBinding;
import com.example.yoink.databinding.FragmentSecondBinding;

public class BeginnerFragment extends Fragment {

    private FragmentBeginnerBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentBeginnerBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                       NavHostFragment.findNavController(BeginnerFragment.this)
                                .navigate(R.id.action_BeginnerFragment_to_ChallengesFragment);

                    }
        });
        binding.buttonChallenge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(BeginnerFragment.this)
                            .navigate(R.id.action_BeginnerFragment_to_DummyTaskFragment);

                }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}