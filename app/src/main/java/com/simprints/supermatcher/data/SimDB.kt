package com.simprints.supermatcher.data

import android.os.Parcelable
import com.github.javafaker.Faker
import kotlinx.android.parcel.Parcelize

/**
 * In the Code Review, ignore the methods implementation. It's a simple
 * database mock.
 */
class SimDB {
    private val faker = Faker()

    fun getAllCandidatesFromDatabase(): List<Candidate> = (1..100).map {
        Candidate(
            it,
            faker.name().firstName(),
            faker.name().lastName()
        )
    }
}

@Parcelize
data class Candidate(val id: Int, val name: String, val surname: String) : Parcelable