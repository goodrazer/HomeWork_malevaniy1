package HomeWork_5_Hospital;

public class Patient {
    int treatmentPlan;
    Doctor doctor;
       public Patient(int treatmentPlan) {
           this.treatmentPlan = treatmentPlan;
       }
       public int getTreatmentPlan() {
           return treatmentPlan;
       }
       public Doctor getDoctor() {
           return doctor;
       }
       public void setDoctor(Doctor doctor) {
          this.doctor = doctor;
    }
}
