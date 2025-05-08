import java.util.Date;
import java.util.List;

public class Prescription {
    private String prescriptionId; // ID bta3 el prescription
    private String patientName; // Esm el patient
    private String doctorName; // Esm el doctor
    private Date dateIssued; // Tareekh el prescription
    private List<Medicine> medicineList; // List bta3et el adwya

    public Prescription(String id, String patient, String doctor, Date dateIssued, List<Medicine> meds) {
        this.prescriptionId = id; // 7ot el ID
        this.patientName = patient; // 7ot esm el patient
        this.doctorName = doctor; // 7ot esm el doctor
        this.dateIssued = dateIssued; // 7ot tareekh el prescription
        this.medicineList = meds; // 7ot list el adwya
    }

    public boolean validatePrescription() {
        return !medicineList.isEmpty(); // Shoof law el prescription feh adwya
    }

    public String getPrescriptionId() {
        return prescriptionId; // Gyb el ID bta3 el prescription
    }
}
