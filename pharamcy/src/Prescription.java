import java.util.Date;
import java.util.List;

public class Prescription {
    private String prescriptionId;
    private String patientName;
    private String doctorName;
    private Date dateIssued;
    private List<Medicine> medicineList;

    public Prescription(String id, String patient, String doctor, Date dateIssued, List<Medicine> meds) {
        this.prescriptionId = id;
        this.patientName = patient;
        this.doctorName = doctor;
        this.dateIssued = dateIssued;
        this.medicineList = meds;
    }

    public boolean validatePrescription() {
        return !medicineList.isEmpty();
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }
}
