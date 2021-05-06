package Generics;

public class User implements Comparable<User>{
    private int points;

    public User(int points){
        this.points = points;
    }
    @Override
    public int compareTo(User other) {
        // this < o -> -1
        // equal -> 0
        // this > 0 -> 1
        return points - other.points;
    }
}
