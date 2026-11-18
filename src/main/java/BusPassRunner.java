/**
 * Runs BusPass so you can see your own results.
 *
 * This file is NOT graded and you do not turn it in. Change it however you
 * like -- try your own riders and ride counts.
 *
 * Run it with:  mvn -q compile exec:java
 */
public class BusPassRunner
{
    public static void main(String[] args)
    {
        // Part 1: the constructor with parameters
        BusPass maya = new BusPass("Maya", 2);
        System.out.println("Part 1: " + maya.getRider() + ", "
                           + maya.getRidesLeft() + " left, "
                           + maya.getRidesTaken() + " taken (expect Maya, 2 left, 0 taken)");

        // Part 2: the standard pass
        BusPass leo = new BusPass("Leo");
        System.out.println("Part 2: " + leo.getRider() + ", "
                           + leo.getRidesLeft() + " left (expect Leo, 10 left)");

        // Part 3: addRides (the -4 should be ignored)
        leo.addRides(3);
        leo.addRides(-4);
        System.out.println("Part 3: Leo has " + leo.getRidesLeft()
                           + " left (expect 13)");

        // Part 4: ride
        System.out.println("Part 4: " + maya.ride() + " " + maya.ride() + " "
                           + maya.ride() + " (expect true true false)");

        // Part 5: getStatus
        System.out.println("Part 5: " + maya.getStatus()
                           + " (expect Maya: no rides left)");
        System.out.println("Part 5: " + leo.getStatus()
                           + " (expect Leo: 13 rides left)");

        // Part 6: rideMany
        System.out.println("Part 6: Leo took " + leo.rideMany(12)
                           + " rides (expect 12)");
        System.out.println("Part 5: " + leo.getStatus()
                           + " (expect Leo: 1 ride left)");
    }
}
