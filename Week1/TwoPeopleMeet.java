package Week1;

public class TwoPeopleMeet {

    public static void main(String[] args) {
        int positionOfA, positionOfB, speedOfA, speedOfB;
        positionOfA = 2;
        speedOfA = 6;
        positionOfB = 12;
        speedOfB = 1;

        boolean ans =  meetOrNot(positionOfA, positionOfB,speedOfA,speedOfB);
        System.out.println(ans);
    }

    private static boolean meetOrNot(int positionOfA, int positionOfB, int speedOfA, int speedOfB) {
        if (positionOfA > positionOfB && speedOfA > speedOfB)
            return false;

        if(positionOfB > positionOfA && speedOfB > speedOfA)
            return false;

        if (positionOfA > positionOfB){
            int t = positionOfB;
            positionOfB = positionOfA;
            positionOfA = t;

            t = speedOfB;
            speedOfB = speedOfA;
            speedOfA = t;
        }
        if ((positionOfB-positionOfA) % (speedOfA-speedOfB) == 0){
            return true;
        }

        return false;
    }
}
