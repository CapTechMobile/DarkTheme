package com.captechventures.darktheme.util

import com.captechventures.darktheme.R
import com.captechventures.darktheme.model.User

class MockRepo {

    companion object {
        fun getMessages(): Array<User> {
            return arrayOf(
                User("Alan", "Shih", "FACT: California Tortilla is better than Chipotle.", "9:45 AM", R.drawable.alanshih),
                User("Chris", "Coyle", "I ate delicious food before I went skiing in Denver.", "7:30 AM", R.drawable.coyle),
                User("Clinton", "Teegarden", "Remember that line from The Office?", "Yesterday", R.drawable.tee),
                User("Alex", "Townsend", "I hope the Nats win tonight.", "Friday", R.drawable.alex),
                User("Alisher", "Pazylbekov", "Google IO was awesome!", "Thursday", R.drawable.alisher),
                User("Andrew", "Gray", "Did you read the book on Tim Cook?", "Thursday", R.drawable.gray),
                User("Juan", "Garduno", "Corona is not real Mexican beer.", "Wednesday", R.drawable.juan),
                User(
                    "Parthiv",
                    "Vora",
                    "Be careful of the cloud. They are watching us.",
                    "Tuesday",
                    R.drawable.parthiv
                ),
                User(
                    "Cullen",
                    "Shannon",
                    "About 50% of people pronounce my name incorrectly.",
                    "Tuesday",
                    R.drawable.shannon
                ),
                User("Dylan", "Doggett", "I love my Google IO trucker hat!", "5/10/19", R.drawable.dylan)
            )
        }
    }

}