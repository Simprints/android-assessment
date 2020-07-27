package com.simprints.supermatcher.ui.main

import android.os.Bundle
import android.view.View
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.matchCandidateAgainstOthers(
            arguments!!.getParcelable("candidate")!!,
            this@MainFragment
        )
    }

}