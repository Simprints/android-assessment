package com.simprints.supermatcher.ui.main

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.simprints.supermatcher.R
import com.simprints.supermatcher.data.Candidate

class MainFragment : Fragment(R.layout.main_fragment) {

    companion object {
        fun mainFragment(candidate: Candidate): MainFragment = MainFragment().apply {
            arguments = bundleOf("candidate" to candidate)
        }
    }

    private val viewModel: MainViewModel = MainViewModel()

    lateinit var message: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        message = view.findViewById(R.id.message)
        viewModel.matchCandidateAgainstOthers(
            requireArguments().getParcelable("candidate")!!,
            this@MainFragment
        )
    }

}