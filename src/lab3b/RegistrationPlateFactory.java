package lab3b;

public class RegistrationPlateFactory {

    private static String[] registrationPlates = { 
            "LA05 XYZ", // London
            "NG58 JKL", // Nottingham
            "MA13 HYP", // Manchester
            "BX06 TUV", // Birmingham
            "CF67 QRS", // Cardiff
            "YS09 PQR", // Yorkshire
            "WD21 NML", // Exeter area (Western region)
            "KR16 FGH", // Northampton
            "SJ04 UVW", // Glasgow
            "LV22 ABC", // Liverpool
            "WX19 XYZ"  // Bristol
    };
    
    private static int nextPlate = 0;
    
    // 1. Declare that this method throws the custom exception
    public static RegistrationPlate getNextRegistrationPlate() throws RegistrationPlatesException {
        // 2. Check if all plates have been used
        if (nextPlate >= registrationPlates.length) {
            throw new RegistrationPlatesException("Registration plate supply exhausted! No remaining plates.");
        }

        // 3. Increment sequentially instead of using modulo %
        String plateNumber = registrationPlates[nextPlate];
        nextPlate++;
        return new RegistrationPlate(plateNumber);
    }
}


