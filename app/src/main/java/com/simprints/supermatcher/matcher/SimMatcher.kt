package com.simprints.supermatcher.matcher

import com.simprints.supermatcher.data.Candidate

interface SimMatcher {
    fun compareCandidates(param1: Candidate, param2: Candidate): Int
}