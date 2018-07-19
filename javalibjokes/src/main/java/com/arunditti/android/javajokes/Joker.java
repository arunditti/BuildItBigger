package com.arunditti.android.javajokes;

import java.util.Random;

public class Joker {

        private static String[] jokes = {"Why did John throw the butter out the window? \n He wanted to see the butter fly!",
            "Where can you find an ocean without any water? \n On a map!",
            "Why did the walrus carefully lick the envelope? \n He was looking for a good seal!",
            "What kind of fish is useful in freezing weather? \n Skate!",
            "Why couldn't the astronaut book a room on the moon? \n Because it was full!",
            "What did Neptune say to Saturn? \n Give me a ring sometime!"};

    public static String getJoke() {

        String randomJoke = jokes[new Random().nextInt(jokes.length)];
        return randomJoke;
    }
}
