package Polymorphism;


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plots here";
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "All about shark";
    }
}


class Sunday extends Movie {

    public Sunday() {
        super("Sunday");
    }

    @Override
    public String plot() {
        return "Missing Sunday";
    }
}

class Titanic extends Movie {
    public Titanic() {
        super("Titanic");
    }

    @Override
    public String plot() {
        return "Ship sank";
    }
}


class FightClub extends Movie {

    public FightClub() {
        super("FightClub");
    }

    @Override
    public String plot() {
        return "All about Psyche";
    }
}


public class Main {

    public static void main(String[] arg) {

        for (int i = 0; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("\nRandom Movie Selection : " + movie.getName()
                    + "\nPlot of the movie :" + movie.plot());
        }

    }

    public static Movie randomMovie() {
        int randomNumner = (int) (Math.random() * 4) + 1;
        System.out.println("\nRandom number generated was :" + randomNumner);
        switch (randomNumner) {
            case 1:
                return new Jaws();
            case 2:
                return new Titanic();
            case 3:
                return new FightClub();
            case 4:
                return new Sunday();

        }

        return null;
    }
}
