package com.curiosity;

class Movie {
    private String name;
    public Movie(String name)
    {
        this.name = name;
    }
    public String plot()
    {
        return "No plot here";
    }
    public String getName()
    {
        return name;
    }
}
    class Jaws extends Movie {
        public Jaws() {
            super("Jaws");
        }
        public String plot() {
            return "Shark eat a lots of people";

        }
    }
        class IndependenceDay extends Movie {
            public IndependenceDay() {
                super("IndependenceDay");
            }
            @Override
            public String plot() {
                return "The aliens are trying to Video call ";
            }
        }
            class MazeRunner extends Movie {
                public MazeRunner() {
                    super("MazeRunner");
                }
                @Override
                public String plot() {
                    return "The kids are running to escape";
                }
            }
            class LoveStory extends Movie {
            public LoveStory(){
                super("Love Story");
            }
                @Override
                public String plot() {
                    return "Romeo and Juliet falling in love";
                }
            }
            class StarWars extends Movie {
            public StarWars() {
                super("Star Wars");
            }
                @Override
                public String plot() {
                    return "Humans defeat the Invaders";
                }
            }

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i +
                    " : " + movie.getName() + "\n" +
                    "Plot " + movie.plot() + "\n");
        }
    }
public static Movie randomMovie() {
    int randomNumber = (int) (Math.random() * 5) +1;
    System.out.println("Random number generated was " + randomNumber);
    switch (randomNumber) {
        case 1:
            return new Jaws();
        case 2:
            return new IndependenceDay();
        case 3:
            return new MazeRunner();
        case 4:
            return new LoveStory();
        case 5:
            return new StarWars();
    }
    return null;
    }
}
