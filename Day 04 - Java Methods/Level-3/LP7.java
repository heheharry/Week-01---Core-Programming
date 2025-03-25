package Day4.LabPractice_L3;
import java.util.HashSet;
import java.util.Random;
public class LP7 {
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000); // Ensures a 6-digit number
    }
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        return otpSet.size() == otps.length; // If set size is equal to array length, all are unique
    }
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
