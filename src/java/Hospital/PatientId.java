package Hospital;
// Generated Jul 6, 2016 9:46:59 PM by Hibernate Tools 4.3.1



/**
 * PatientId generated by hbm2java
 */
public class PatientId  implements java.io.Serializable {


     private String inPatientNo;
     private String doctorDocNo;
     private int patientMedicationDrugNo;
     private String receptionistRecepNo;
     private String nurseNurseId;

    public PatientId() {
    }

    public PatientId(String inPatientNo, String doctorDocNo, int patientMedicationDrugNo, String receptionistRecepNo, String nurseNurseId) {
       this.inPatientNo = inPatientNo;
       this.doctorDocNo = doctorDocNo;
       this.patientMedicationDrugNo = patientMedicationDrugNo;
       this.receptionistRecepNo = receptionistRecepNo;
       this.nurseNurseId = nurseNurseId;
    }
   
    public String getInPatientNo() {
        return this.inPatientNo;
    }
    
    public void setInPatientNo(String inPatientNo) {
        this.inPatientNo = inPatientNo;
    }
    public String getDoctorDocNo() {
        return this.doctorDocNo;
    }
    
    public void setDoctorDocNo(String doctorDocNo) {
        this.doctorDocNo = doctorDocNo;
    }
    public int getPatientMedicationDrugNo() {
        return this.patientMedicationDrugNo;
    }
    
    public void setPatientMedicationDrugNo(int patientMedicationDrugNo) {
        this.patientMedicationDrugNo = patientMedicationDrugNo;
    }
    public String getReceptionistRecepNo() {
        return this.receptionistRecepNo;
    }
    
    public void setReceptionistRecepNo(String receptionistRecepNo) {
        this.receptionistRecepNo = receptionistRecepNo;
    }
    public String getNurseNurseId() {
        return this.nurseNurseId;
    }
    
    public void setNurseNurseId(String nurseNurseId) {
        this.nurseNurseId = nurseNurseId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PatientId) ) return false;
		 PatientId castOther = ( PatientId ) other; 
         
		 return ( (this.getInPatientNo()==castOther.getInPatientNo()) || ( this.getInPatientNo()!=null && castOther.getInPatientNo()!=null && this.getInPatientNo().equals(castOther.getInPatientNo()) ) )
 && ( (this.getDoctorDocNo()==castOther.getDoctorDocNo()) || ( this.getDoctorDocNo()!=null && castOther.getDoctorDocNo()!=null && this.getDoctorDocNo().equals(castOther.getDoctorDocNo()) ) )
 && (this.getPatientMedicationDrugNo()==castOther.getPatientMedicationDrugNo())
 && ( (this.getReceptionistRecepNo()==castOther.getReceptionistRecepNo()) || ( this.getReceptionistRecepNo()!=null && castOther.getReceptionistRecepNo()!=null && this.getReceptionistRecepNo().equals(castOther.getReceptionistRecepNo()) ) )
 && ( (this.getNurseNurseId()==castOther.getNurseNurseId()) || ( this.getNurseNurseId()!=null && castOther.getNurseNurseId()!=null && this.getNurseNurseId().equals(castOther.getNurseNurseId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getInPatientNo() == null ? 0 : this.getInPatientNo().hashCode() );
         result = 37 * result + ( getDoctorDocNo() == null ? 0 : this.getDoctorDocNo().hashCode() );
         result = 37 * result + this.getPatientMedicationDrugNo();
         result = 37 * result + ( getReceptionistRecepNo() == null ? 0 : this.getReceptionistRecepNo().hashCode() );
         result = 37 * result + ( getNurseNurseId() == null ? 0 : this.getNurseNurseId().hashCode() );
         return result;
   }   


}

