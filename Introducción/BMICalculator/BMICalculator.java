// La clase BMICalculator es una clase de utilidad que se utiliza para calcular el valor del IMC tanto en sistemas imperiales como métricos.
public class BMICalculator {
    
    // Variables para el sistema Imperial
    double weightInPounds;
    double heightInInches;

    // Variables para el sistema Metrico
    double weightInKilos;
    double heightInMeters;

    // Constructor No-parameters
    public BMICalculator() {
        this.weightInPounds = 154.0;
        this.heightInInches = 70.0;
        this.weightInKilos = 70;
        this.heightInMeters = 1.82;
    }

    // Metodo que calcula y retorna el IMC (BMI) en sistema Imperial
    public double calculateBmiImperial(double weightInPounds, double heightInInches) {
        return (703 * weightInPounds) / (heightInInches * heightInInches);
    }

    // Metodo que calcula y retorna el IMC (BMI) en sistema Metrico
    public double calculateBmiMetric(double weightInKilos, double heightInMeters) {
        return weightInKilos / (heightInMeters * heightInMeters);
    }
    
    // Metodo que retorna la categoria del IMC (BMI) en el que se encuentra dependiendo del resultado
    public String getBMICategory(double bmi) {
        if (bmi < 18.25) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
}
