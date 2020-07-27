package com.simprints.supermatcher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.simprints.supermatcher.data.Candidate
import com.simprints.supermatcher.ui.main.MainFragment

/**
 * 2 Tasks:
 * a) Code Review: do a code review of the current app. Please write your comments in a doc,
 * specifying file and line number for each comment and rank your comments based on the severity.
 *
 * b) Implement and write tests for "SimMatcher": Please see "SimMatcherImpl" for more details.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment.mainFragment(Candidate(1, "Thales", "Lima")))
            .commitNow()
    }
}