public class BMICalculator {
    
    /**
     * calculateBmiImperial - Calcula el IMC en Sistema imperial
     */
    public double calculateBmiImperial(double weightInPounds, double heightInInches) {
        return weightInPounds / (heightInInches * heightInInches) * 703;
    }

    /**
     * calculateBmiMetric - Calcula el IMC en Sistema métrico
     */
    public double calculateBmiMetric(double weightInKilos, double heightInMeters) {
        return weightInKilos / (heightInMeters * heightInMeters);
    }
}
