package com.captechventures.darktheme.util

import com.captechventures.darktheme.R
import com.captechventures.darktheme.model.User

class MockRepo {

    companion object {
        fun getMessages(): Array<User> {
            return arrayOf(
                User(
                    "Alan",
                    "Shih",
                    "FACT: California Tortilla is better than Chipotle.",
                    false,
                    "9:45 AM",
                    R.drawable.alanshih
                ),
                User(
                    "Chris",
                    "Coyle",
                    "I am the next Michael Bay & Steven Spielberg. #academyawardwinner2020",
                    true,
                    "7:30 AM",
                    R.drawable.coyle
                ),
                User(
                    "Clinton",
                    "Teegarden",
                    "Oh, it is on, like a prawn who yawns at dawn.",
                    false,
                    "Yesterday",
                    R.drawable.tee
                ),
                User("Alex", "Townsend", "I hope the Nats win tonight.", true, "Friday", R.drawable.alex),
                User("Alisher", "Pazylbekov", "Google IO was awesome!", true, "Thursday", R.drawable.alisher),
                User(
                    "Andrew",
                    "Gray",
                    "Did you read the book on Tim Cook? It's even better than Steve Job's biography",
                    true,
                    "Thursday",
                    R.drawable.gray
                ),
                User("Juan", "Garduno", "Corona is not real Mexican beer.", false, "Wednesday", R.drawable.juan),
                User(
                    "Parthiv",
                    "Vora",
                    "Be careful of the cloud. They are watching us.",
                    false,
                    "Tuesday",
                    R.drawable.parthiv
                ),
                User(
                    "Cullen",
                    "Shannon",
                    "About 50% of people pronounce my name incorrectly.",
                    true,
                    "Tuesday",
                    R.drawable.shannon
                ),
                User("Dylan", "Doggett", "I love my Google IO trucker hat!", true, "5/10/19", R.drawable.dylan)
            )
        }
    }

}