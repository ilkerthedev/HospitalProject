package entities.concretes;
import entities.abstracts.Users;
import entities.concretes.enums.Gender;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Patients extends Users {
    private String tcNo;
    private LocalDate birthDate;
    private Gender gender;
    private Priorities priority;
    private Complaints complaint;
    private LastStatuses lastStatus;
    public List<Patients> patientsList = new ArrayList<>();
    public Patients(){
    }
    public Patients(String tcNo, LocalDate birthDate, Gender gender, Priorities priority, Complaints complaint, LastStatuses lastStatus) {
        this.tcNo = tcNo;
        this.birthDate = birthDate;
        this.gender = gender;
        this.priority = priority;
        this.complaint = complaint;
        this.lastStatus = lastStatus;
    }
    public Patients(String id, String firstName, String lastName, String tcNo, LocalDate birthDate, Gender gender, Priorities priority, Complaints complaint, LastStatuses lastStatus) {
        super(id, firstName, lastName);
        this.tcNo = tcNo;
        this.birthDate = birthDate;
        this.gender = gender;
        this.priority = priority;
        this.complaint = complaint;
        this.lastStatus = lastStatus;
    }
    public String getTcNo() {
        return tcNo;
    }
    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public Priorities getPriority() {
        return priority;
    }
    public void setPriority(Priorities priority) {
        this.priority = priority;
    }
    public Complaints getComplaint() {
        return complaint;
    }
    public void setComplaint(Complaints complaint) {
        this.complaint = complaint;
    }
    public LastStatuses getLastStatus() {
        return lastStatus;
    }
    public void setLastStatus(LastStatuses lastStatus) {
        this.lastStatus = lastStatus;
    }
    @Override
    public String toString() {
        return
                "id=" + super.getId() +
                        ",adi=" + super.getFirstName() +
                        ",soyadi=" + super.getLastName() +
                        "tcNo='" + tcNo + '\'' +
                        ", birthDate=" + birthDate +
                        ", gender=" + gender +
                        ", priority=" + priority +
                        ", complaint=" + complaint +
                        ", lastStatus=" + lastStatus;
    }
    public void fillPatientsList(){
        Patients patient1 = new Patients("PT1001","Ali","Tekin","tc",1,2,priority.getPrioritiesById(31),complaint.getComplaintById(1),lastStatus.getLastStatusById(1));
        Patients patient2 = new Patients("PT1002","Ramiz","Karaeski","tc",1,2,priority.getPrioritiesById(31),complaint.getComplaintById(2),lastStatus.getLastStatusById(2));
        Patients patient3 = new Patients("PT1003","Enes","Durgun","tc",1,2,priority.getPrioritiesById(31),complaint.getComplaintById(3),lastStatus.getLastStatusById(2));
    }
}