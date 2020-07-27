package com.simprints.supermatcher.ui.main

import androidx.lifecycle.ViewModel
import com.simprints.supermatcher.data.Candidate
import com.simprints.supermatcher.data.SimDB
import com.simprints.supermatcher.matcher.SimMatcherImpl
import kotlinx.android.synthetic.main.main_fragment.*

class MainViewModel : ViewModel() {
    private val database = SimDB()
    private val matcher = SimMatcherImpl()

    fun matchCandidateAgainstOthers(
        candidate: Candidate,
        mainFragment: MainFragment
    ) {
        val candidates = database.getAllCandidatesFromDatabase()
        for (it in candidates) {
            matcher.compareCandidates(candidate, it)
        }
        mainFragment.message.text = "Matching done"
    }
}