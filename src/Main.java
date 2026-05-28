import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

public class Main {

    protected static class MyThread extends Thread {

        public String taskName;

        public MyThread(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("Executing task " + this.taskName);
            } catch (InterruptedException err) {
                System.out.println("Something interrupted the process: " + err.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println("Black Hole Simulation");
        
        // String BH = "Sagittarius A*";
        // final double massKg = massFromOrbit(1e9, 2e7);
        // final double solarMasses = toSolarMass(massKg);
        // final double sr = getSchwarzschildRadius(massKg);
        
        // System.out.printf("Black Hole: %s\n", BH);
        // System.out.printf("Mass of Black Hole: %f KG\n", massKg);
        // System.out.printf("Mass of Black Hole: %f SM\n", solarMasses);
        // System.out.printf("Schwarzschild Radius: %f M\n", sr);
        System.out.println("Run `mac test` to run unittest");
    }

    public static boolean either24(int[] nums) {
      boolean is2 = false;
      boolean is4 = false;

      for (int i = 0; i < nums.length-1; i++) {
        if (is2 && is4) return false;
        if (nums[i] == 2 && nums[i+1] == 2) is2 = true;
        if (nums[i] == 4 && nums[i+1] == 4) is4 = true;
      }

      return is2 != is4;
    }

    public static boolean isEverywhere(int[] nums, int val)
    {
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] != val && nums[i+1] != val)
                return false;

        return true;
    }

    public static boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;

        for (int n : nums) {
            if (n == 1) has1 = true;
            if (n == 4) has4 = true;
            if (has1 && has4) return false;
        }

        return !(has1 && has4);
    }

    public static String[] fizzArray2(int n) {
        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = String.valueOf(i);

        return arr;
    }

    public static boolean only14(int[] nums) {
        for (int n : nums)
            if (n != 1 && n != 4)
                return false;

        return true;
    }

    public static int[] fizzArray(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = i;

        return arr;
    }

    public static boolean more14(int[] nums) {
        int count = 0;

        for (int n : nums) {
            if (n == 1) count++;
            if (n == 4) count--;
        }

        return count > 0;
    }

    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 1 || nums[i] == 3)
                return false;
        return true;
    }

    public static boolean sum28(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2) sum += nums[i];
        
        return sum == 8;
    }

    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length-1; i++)
            if (nums[i] == 2 && nums[i+1] == 2)
                return true;

        return false;
    }

    public static int sum67(int[] nums) {
        if (nums.length == 0) return 0;

        int sum = 0;
        boolean skip = false;

        for (int n : nums) {
            if (n == 6)                 skip = true;
            else if (n == 7 && skip)    skip = false;
            else if (!skip)             sum += n;
        }

        return sum;
    }

    public static int centeredAverage(int[] nums) {
        int sum = 0, min = nums[0], max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        return (sum - min - max) / (nums.length - 2);
    }

    public static int sum13(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1 && nums[0] == 13) return 0;

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
                continue;
            }

            sum += nums[i];
        }

        return sum;
    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }

        return max - min;
    }

    public static boolean shareDigit(int a, int b) {
        return a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10;
    }

    public static int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10) return 10;
        if (a + b == b + c + 10 || a + b == a + c + 10) return 5;
        return 0;
    }

    public static int greenTicket(int a, int b, int c) {
        return a == b && b == c ? 20 : a == b || a == c || b == c ? 10 : 0;
    }

    public static int redTicket(int a, int b, int c) {
        return a == 2 && b == 2 && c == 2 ? 10 : a == b && b == c ? 5 : a != b && b != c ? 1 : 0;
    }

    public static int maxMod5(int a, int b) {
        return a == b ? 0 : a % 5 == b % 5 ? Math.min(a, b) : Math.max(a, b);
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        return noDoubles && die1 == die2
            ? (die1 == 6 ? 1 : die1 + 1) + die2
            : die1 + die2;
    }

    public static boolean lessBy10(int a, int b, int c) {
        return (
            Math.abs(a - b) >= 10 ||
            Math.abs(b - c) >= 10 ||
            Math.abs(a - c) >= 10
        );
    }

    public static int teaParty(int tea, int candy) {
        return (tea < 5 || candy < 5) ? 0 : (tea >= (candy * 2) || candy >= (tea * 2)) ? 2 : 1;
    }

    public static void systemInfo() {
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.library.path"));

        OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
        
        System.out.println(os.getAvailableProcessors());
        System.out.println(os.getSystemLoadAverage());

        com.sun.management.OperatingSystemMXBean sunOS =
            (com.sun.management.OperatingSystemMXBean) os;

        System.out.println(sunOS.getTotalMemorySize());
        System.out.println(sunOS.getFreeMemorySize());
        System.out.println(sunOS.getCpuLoad());
        System.out.println(sunOS.getProcessCpuLoad());
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return (equalOk && a <= b && b <= c) || (a < b && b < c);
    }

    public static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        return (bOk || b > a) && c > b;
    }

    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public static String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz!";
        if (n % 3 == 0) return "Fizz!";
        if (n % 5 == 0) return "Buzz!";
        return n + "!";
    }

    public static String fizzString(String str) {
        int size = str.length();

        if (
            str.charAt(0) == 'f' && str.charAt(size - 1) == 'b'
        ) return "FizzBuzz";
        if (str.charAt(0) == 'f') return "Fizz";
        if (str.charAt(size - 1) == 'b') return "Buzz";

        return str;
    }

    public static boolean near10(int n) {
        int mod = Math.abs(n % 10);
        return mod <= 2 || mod >= 8;
    }

    public static int[] front11(int[] a, int[] b) {
        int size = (a.length > 0 ? 1 : 0) + (b.length > 0 ? 1 : 0);
        int[] arr = new int[size];
        int i = 0;

        if (a.length > 0) arr[i++] = a[0];
        if (b.length > 0) arr[i] = b[0];

        return arr;
    }

    public static boolean hasBad(String str) {
        return (
            str.length() >= 3 &&
            (str.startsWith("bad") || str.startsWith("bad", 1))
        );
    }

    public static void runThreadExample() throws FileNotFoundException {
        List<MyThread> threads = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            MyThread thread = new MyThread("Task: " + i);
            threads.add(thread);
            System.out.println(
                "Creating a new thread task: " + thread.getName()
            );
        }

        for (Thread thread : threads) {
            thread.start();
            System.out.println("Started thread " + thread.getName());
        }

        for (Thread thread : threads) {
            try {
                if (thread.isAlive()) {
                    System.out.println(
                        "Killing the thread " +
                            thread.getName() +
                            " since its alive"
                    );
                    thread.join();
                }
            } catch (InterruptedException err) {
                System.out.println("Error: " + err.getMessage());
                err.printStackTrace(new PrintStream("thread_error.log"));
            }
        }
    }

    public static void threadTask(int n) {
        System.out.println(n);
    }

    public static String withoutX2(String str) {
        int size = str.length();

        if (size <= 2) return str.replace("x", "");

        return str.substring(0, 2).replace("x", "") + str.substring(2);
    }

    public static String withoutX(String str) {
        int size = str.length();
        if (size <= 1) return "";

        return (
            (str.charAt(0) == 'x' ? "" : str.charAt(0)) +
            str.substring(1, size - 1) +
            (str.charAt(size - 1) == 'x' ? "" : str.charAt(size - 1))
        );
    }

    public static String startWord(String str, String word) {
        int strSize = str.length();
        int wordSize = word.length();

        if (strSize < wordSize) return "";
        if (wordSize == 1) return str.charAt(0) + "";

        return str.substring(1, wordSize).equals(word.substring(1, wordSize))
            ? str.substring(0, wordSize)
            : "";
    }

    public static String deFront(String str) {
        if (str.isEmpty()) return str;
        return (
            (str.charAt(0) == 'a' ? "a" : "") +
            (str.charAt(1) == 'b' ? "b" : "") +
            str.substring(2)
        );
    }

    public static String without2(String str) {
        int size = str.length();
        return size >= 2 && str.substring(0, 2).equals(str.substring(size - 2))
            ? str.substring(2)
            : str;
    }

    public static String minCat(String a, String b) {
        int aSize = a.length();
        int bSize = b.length();

        return aSize > bSize
            ? a.substring(aSize - bSize) + b
            : aSize == bSize
                ? a + b
                : a + b.substring(bSize - aSize);
    }

    public static boolean frontAgain(String str) {
        int size = str.length();
        return (
            size >= 2 &&
            str.charAt(0) == str.charAt(size - 2) &&
            str.charAt(1) == str.charAt(size - 1)
        );
    }

    public static String seeColor(String str) {
        return str.startsWith("red") ? "red" : str.startsWith("blue") ? "blue" : "";
    }

    public static String lastTwo(String str) {
        int size = str.length();

        if (size < 2) return str;

        return size > 2
            ? str.substring(0, size - 2) +
              str.charAt(size - 1) +
              str.charAt(size - 2)
            : str.charAt(1) + "" + str.charAt(0);
    }

    public static String concat(String a, String b) {
        int aSize = a.length();
        int bSize = b.length();

        if (aSize == 0) return b;
        if (bSize == 0) return a;

        return a.charAt(aSize - 1) == b.charAt(0)
            ? a + b.substring(1, bSize)
            : a + b;
    }

    // return true string has "bob" in it except letter 'o' can be anything
    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) if (
            str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'
        ) return true;
        return false;
    }

    // prefixAgain
    public static boolean prefixAgain(String str, int n) {
        String nChar = str.substring(0, n);
        String window;

        for (int i = n; i <= str.length() - n; i++) {
            window = str.substring(i, n + i);
            if (nChar.equals(window)) return true;
        }

        return false;
    }

    // countYZ - count words ending with Y or Z in non-case-sensitive scenario
    // fez day -> 2 since both words ends with z or y
    public static int countYZ(String str) {
        int count = 0;
        int size = str.length();
        char c;

        for (int i = 0; i < size; i++) {
            c = str.charAt(i);
            if (
                (c == 'y' || c == 'Y' || c == 'z' || c == 'Z') &&
                (i == size - 1 || !Character.isLetter(str.charAt(i + 1)))
            ) count++;
        }

        return count;
    }

    // get the sandwich
    public static String getSandwich(String str) {
        int start = firstIndexOf(str, "bread");
        int end = lastIndexOf(str, "bread");

        if (start == -1 || end == -1) return "";

        return str.substring(start + 5, end);
    }

    // get the first Index of a word
    public static int firstIndexOf(String str, String word) {
        int size = str.length();
        int wordSize = word.length();

        for (int i = 0; i < size - wordSize; i++) {
            if (str.substring(i, i + wordSize).equals(word)) return i;
        }

        return -1;
    }

    // get the last index of a word
    public static int lastIndexOf(String str, String word) {
        int size = str.length();
        int wordSize = word.length();

        for (int i = size - wordSize; i >= 0; i--) {
            if (str.substring(i, i + wordSize).equals(word)) return i;
        }
        return -1;
    }

    // find the triple count, which can be overlapped
    public static int tripleCount(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (
                str.charAt(i) == str.charAt(i + 1) &&
                str.charAt(i + 1) == str.charAt(i + 2)
            ) count++;
        }

        return count;
    }

    // sum all the digits present in the given string
    public static int sumDigits(String str) {
        int sum = 0;
        int size = str.length();

        for (int i = 0; i < size; i++) if (
            Character.isDigit(str.charAt(i))
        ) sum += Integer.parseInt(str.charAt(i) + "");

        return sum;
    }

    // same start characters
    public static boolean sameStarChar(String str) {
        int size = str.length();

        for (int i = 0; i < size; i++) if (
            i > 0 &&
            i < size - 1 &&
            str.charAt(i) == '*' &&
            str.charAt(i - 1) != str.charAt(i + 1)
        ) return false;

        return true;
    }

    // append all the first and last character appeared before and after the given word in the string
    // ex: abcxydef -> cd
    public static String wordEnds(String str, String word) {
        int strSize = str.length();
        int wordSize = word.length();

        if (strSize <= wordSize) return "";

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < strSize; i++) {
            if (
                i <= strSize - wordSize &&
                str.substring(i, i + wordSize).equals(word)
            ) {
                if (i > 0) builder.append(str.charAt(i - 1));
                if (i < strSize - wordSize) builder.append(
                    str.charAt(i + wordSize)
                );
                i += wordSize - 1;
            }
        }

        return builder.toString();
    }

    // replace every char with "+" except the given word, ex:123xy456 for word "xy"
    // then output will be +++xy+++
    public static String plusOut(String str, String word) {
        int strSize = str.length();
        int wordSize = word.length();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < strSize; i++) {
            if (
                i <= strSize - wordSize &&
                str.substring(i, i + wordSize).equals(word)
            ) {
                builder.append(word);
                i += wordSize - 1;
            } else {
                builder.append("+");
            }
        }

        return builder.toString();
    }

    // return the longest substring that appears at both ends of the string
    public static String sameEnds(String str) {
        int size = str.length();
        String left,
            right,
            longest = "";

        for (int i = 1; i <= size / 2; i++) {
            left = str.substring(0, i);
            right = str.substring(size - i);

            if (left.equals(right) && left.length() > longest.length()) {
                longest = left;
            }
        }

        return longest;
    }

    public static int sumNumbers(String str) {
        StringBuilder builder = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                builder.append(str.charAt(i));
            } else if (builder.isEmpty()) {
                sum += Integer.parseInt(builder.toString());
                builder = new StringBuilder();
            }
        }

        return builder.isEmpty() ? Integer.parseInt(builder.toString()) : sum;
    }

    public static int stringMatch(String a, String b) {
        int size = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < size - 1; i++) {
            if (
                a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)
            ) count++;
        }

        return count;
    }

    // method to get the common substring from two strings
    public static String getSameSubstring(String a, String b) {
        int size = Math.min(a.length(), b.length());

        for (int i = 0; i < size - 1; i++) {
            if (
                a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)
            ) {
                return (
                    Character.toString(a.charAt(i)) +
                    Character.toString(a.charAt(i + 1))
                );
            }
        }

        return null;
    }

    // check for 271 pattern in the given array
    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (
                nums[i] == nums[i + 1] - 5 && nums[i] == nums[i + 2] + 1
            ) return true;
        }
        return false;
    }

    public static String mixString(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int aSize = a.length();
        int bSize = b.length();

        for (int i = 0; i < aSize || i < bSize; i++) {
            if (i < aSize) builder.append(a.charAt(i));
            if (i < bSize) builder.append(b.charAt(i));
        }

        return builder.toString();
    }

    // ============ BLACK HOLE ============

    // Universal CONSTANTS in SI units
    protected static final double G = 6.67430e-11;              // Gravitational constant (m^3 kg^-1 s^-2)
    protected static final long C = 299792458;                  // Speed of light (m/s)
    protected static final double SOLAR_MASS = 1.98847e30;      // Mass of our sun (kg)

    // convert mass from kg to solar mass
    public static double toSolarMass(double massKg)
    {
        return massKg / SOLAR_MASS;
    }

    // convert mass from solar mass to kg
    public static double toKg(double solarMasses)
    {
        return solarMasses * SOLAR_MASS;
    }

    /*
        Logic1: Mass from Orbital Data (Keplerian)
        This is the "Measurement" method. You can calculate the mass if you know how fast a star
        is moving (v) at a certain distance (r)

        v = velocity in ms
        r = radius in m

        M = (v^2 * r) / G
    */
    public static double massFromOrbit(double r, double v)
    {
        double massKg = ((v * v) * r) / G;
        return massKg;
    }

    /*
        Logic2: Radius from MASS (Schwarzschild)
        If you already have the mass in solar masses, you can calculate the radius of event horizon,
        and you can calculate how much big the black hole actually is

        Rs = (2 * G * M) / C^2
        Rs = schwarzschild radius
        G = gravitational constant
        M = Mass of black hole in kg
        C = speed of light
    */
    public static double getSchwarzschildRadius(double massKg)
    {
        double sr = (2 * G * massKg) / (C * C);
        return sr;
    }

    /*
        Logic3: Time dilation (interstellar effect)
        This method can be used to calculate how much the time got slowed near a certain distance

        t0 = tf * { 1 - (Rs / r) }
    */
    public static double calculateTimeDilation(double massKg, double distanceR, double timeSeconds)
    {
        double sr = getSchwarzschildRadius(massKg);

        if (distanceR <= sr)
        {
            return -1.0;
        }

        double timeDilation = timeSeconds * Math.sqrt( 1 - ( sr / distanceR ) );
        return timeDilation;
    }

    // ============ BLACK HOLE ============
}
