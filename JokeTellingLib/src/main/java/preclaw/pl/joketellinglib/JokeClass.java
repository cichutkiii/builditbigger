package preclaw.pl.joketellinglib;

import java.util.ArrayList;

public class JokeClass {
    ArrayList<String> jokes = new ArrayList<String>();
    int numOfJokes=0;
    public JokeClass(){
        jokes.add("Q: What does networking seal say?\n" +
                "\n" +
                "A: Arp! Arp! Arp!");
        jokes.add("Q: How many programmers does it take to change a light bulb?\n" +
                "\n" +
                "A: None, that's a hardware problem.");
        jokes.add("There are only 10 types of people in the world: those who understand binary, and those who don't.");
    }

        public String GetJokes(){
        numOfJokes = jokes.size();
        return jokes.get((int) (Math.random()* numOfJokes));
        }
}
