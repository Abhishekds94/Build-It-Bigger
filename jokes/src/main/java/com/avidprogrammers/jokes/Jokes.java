package com.avidprogrammers.jokes;

import java.util.*;

public class Jokes {

    public String getJoke() {

        ArrayList<String> jokes = new ArrayList<String>(
                Arrays.asList(
        "The first computer dates back to Adam and Eve. It was an Apple with limited memory, just one byte. And then everything crashed.",
        "About a month before he died, my uncle had his back covered in lard. After that, he went down hill fast.",
        "I can't believe I got fired from the calendar factory. All I did was take a day off.",
        "Don't spell part backwards. It's a trap.",
        "The future, the present and the past walked into a bar. Things got a little tense."
        ));

        Random rand = new Random();
        int index = rand.nextInt(jokes.size());

        return jokes.get(index);
    }

}
