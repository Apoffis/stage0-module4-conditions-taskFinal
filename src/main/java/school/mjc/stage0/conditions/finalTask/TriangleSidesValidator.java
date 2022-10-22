package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean isValid = firstSide + secondSide <= thirdSide || secondSide + thirdSide <= firstSide || thirdSide + firstSide <= secondSide;
        if (!isValid) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }
}
