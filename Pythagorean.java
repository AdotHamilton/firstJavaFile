public class Pythagorean {
    public Double getHypoteneuse(int legA, int legB) {
        System.out.println("done");
        return Math.sqrt( Math.pow(legA, 2) + Math.pow(legB, 2) );
    }

    public Double rightTriangleHypoteneuse(double leg) {
        return Math.sqrt( Math.pow(leg, 2) * 2 );
    }

};
