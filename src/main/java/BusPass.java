/**
 * AP CSA Lab 3.4-3.5 - Constructors and Methods
 *
 * Finish the class BusPass. A BusPass is one student's pass for the city
 * bus, counted in rides: each ride uses one. BusPassRunner.java makes
 * BusPass objects and calls their methods, the same way LunchDesk uses
 * LunchAccount in your Unit 3 notes (Appendix A).
 *
 * Do not rename anything, do not change the parameter lists, and do not
 * change the return types. The grader compiles against these exact
 * signatures.
 *
 * The instance variables are declared for you. Together their values are
 * the object's STATE: who the rider is, how many rides are left, and how
 * many rides have been taken.
 *
 * Run the program with:  mvn -q compile exec:java
 * Or from your IDE, run main in BusPassRunner.java.
 */
public class BusPass
{
    private String rider;
    private int ridesLeft;
    private int ridesTaken;

    // ---------------------------------------------------------------
    // PART 1: a constructor with parameters, and the accessors
    //
    // A constructor sets the initial state of a new object, and it should
    // give EVERY instance variable a starting value. Here rider comes from
    // name, ridesLeft comes from rides, and ridesTaken starts at 0.
    //
    // Then finish the three accessor methods. An accessor is a non-void
    // method that returns a copy of an instance variable's value.
    //
    // LunchAccount does the same (LunchAccount lines 19-26 and 33-36):
    //
    //     public LunchAccount(String name, SchoolDate opened)
    //     {
    //         ...
    //         balance = 0;
    //     }
    //
    //     public int getBalance()
    //     {
    //         return balance;
    //     }
    //
    // Example: BusPass pass = new BusPass("Maya", 5);
    //          pass.getRider()       is "Maya"
    //          pass.getRidesLeft()   is 5
    //          pass.getRidesTaken()  is 0
    //
    // Precondition: rides is 0 or more.
    // ---------------------------------------------------------------
    public BusPass(String name, int rides)
    {
        // TODO Part 1: give every instance variable its starting value
    }

    public String getRider()
    {
        // TODO Part 1: return the rider's name
        return "";
    }

    public int getRidesLeft()
    {
        // TODO Part 1: return how many rides are left
        return 0;
    }

    public int getRidesTaken()
    {
        // TODO Part 1: return how many rides have been taken
        return 0;
    }

    // ---------------------------------------------------------------
    // PART 2: a second constructor
    //
    // A class can have more than one constructor, as long as their
    // parameter lists are different. This one makes a standard pass: it
    // takes only the rider's name, and a standard pass starts with 10
    // rides left and 0 rides taken.
    //
    // Example: new BusPass("Leo").getRidesLeft()   is 10
    //
    // Careful: write  ridesLeft = 10;  not  int ridesLeft = 10;
    // Putting a type in front declares a brand-new local variable that
    // disappears when the constructor ends. The instance variable is never
    // set, so it keeps its default value. The default for an int is 0, for
    // a double 0.0, for a boolean false, and for a reference type such as
    // String, null.
    // ---------------------------------------------------------------
    public BusPass(String name)
    {
        // TODO Part 2: a standard pass -- 10 rides left, 0 taken
    }

    // ---------------------------------------------------------------
    // PART 3: addRides -- a void mutator
    //
    // A mutator changes instance variables. addRides is void: it returns
    // nothing. Add rides to ridesLeft. If rides is 0 or negative, ignore it
    // and change nothing.
    //
    // LunchAccount's deposit uses return to leave early (LunchAccount
    // lines 44-52). In a void method, a plain  return;  sends control back
    // to the caller and skips the rest of the method:
    //
    //     public void deposit(int cents)
    //     {
    //         if (cents <= 0)
    //         {
    //             return;
    //         }
    //         balance += cents;
    //     }
    //
    // Example: new BusPass("Maya", 5), then addRides(3):   ridesLeft is 8
    // Example: new BusPass("Maya", 5), then addRides(-4):  ridesLeft is 5
    // ---------------------------------------------------------------
    public void addRides(int rides)
    {
        // TODO Part 3: add rides to ridesLeft, but only if rides is positive
    }

    // ---------------------------------------------------------------
    // PART 4: ride -- a mutator that returns a boolean
    //
    // The rider gets on the bus. If no rides are left, return false and
    // change nothing. Otherwise take one ride: ridesLeft goes down by 1,
    // ridesTaken goes up by 1, and return true.
    //
    // LunchAccount's buy works the same way (LunchAccount lines 56-64):
    //
    //     public boolean buy(int price)
    //     {
    //         if (price > balance)
    //         {
    //             return false;
    //         }
    //         balance -= price;
    //         return true;
    //     }
    //
    // A return statement inside an if ends the whole method, so the lines
    // after it never run.
    //
    // Example: new BusPass("Maya", 2), then ride() three times:
    //          the calls return true, true, false
    //          ridesLeft is 0 and ridesTaken is 2
    //
    // Careful: ridesLeft must never go below 0.
    // ---------------------------------------------------------------
    public boolean ride()
    {
        // TODO Part 4: take one ride if one is left; return whether you did
        return false;
    }

    // ---------------------------------------------------------------
    // PART 5: getStatus -- a non-void method with several returns
    //
    // Return a line that says how many rides are left, written the way a
    // person would say it:
    //
    //     "Maya: 5 rides left"
    //     "Leo: 1 ride left"        (one ride -- "ride", not "rides")
    //     "Ana: no rides left"      (zero rides -- "no", not "0")
    //
    // Each case can return its own String. As soon as one return runs,
    // the method is over.
    // ---------------------------------------------------------------
    public String getStatus()
    {
        // TODO Part 5: return the status line
        return "";
    }

    // ---------------------------------------------------------------
    // PART 6: rideMany -- use a parameter, and reuse your own method
    //
    // The rider wants to take `trips` rides in a row. Call ride() once
    // for each trip, and return how many of the rides actually happened.
    // When the rides run out, ride() returns false and nothing changes.
    //
    // Do not repeat the ride code here -- call ride().
    //
    // Example: new BusPass("Maya", 5), then rideMany(3):  returns 3,
    //          and ridesLeft is 2
    // Example: new BusPass("Leo", 2), then rideMany(5):   returns 2,
    //          and ridesLeft is 0
    //
    // Careful: count only the rides that happened, not the trips asked for.
    // ---------------------------------------------------------------
    public int rideMany(int trips)
    {
        // TODO Part 6: call ride() trips times; count the ones that worked
        return 0;
    }
}
