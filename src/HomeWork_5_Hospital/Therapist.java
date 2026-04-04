package HomeWork_5_Hospital;

public class Therapist implements Doctor{
    @Override
    public void treat() {
        System.out.println("Терапевт.");
        System.out.println("Лечение: Первичный и полный осмотр, направляет к другим специалистам. Если хорошо себя будешь вести, то угостит Антирадином.");
    }
    public void assignDoctor(Patient patient) {
        int code = patient.getTreatmentPlan();
        if (code == 1) {
            patient.setDoctor((Doctor) new Surgeon());
        } else if (code == 2) {
            patient.setDoctor((Doctor) new Dentist());
        } else {
            patient.setDoctor((Doctor) new Therapist());
        }
        System.out.print("Пациенту назначен специалист: ");
        patient.getDoctor().treat();
    }
}
