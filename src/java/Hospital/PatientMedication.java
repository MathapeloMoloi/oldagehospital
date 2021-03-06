package Hospital;
// Generated Jul 6, 2016 9:46:59 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PatientMedication generated by hbm2java
 */
public class PatientMedication  implements java.io.Serializable {


     private int drugNo;
     private String drugName;
     private Integer unitPerDay;
     private String dosage;
     private Date startDate;
     private Date finishDate;
     private Set patients = new HashSet(0);

    public PatientMedication() {
    }

	
    public PatientMedication(int drugNo) {
        this.drugNo = drugNo;
    }
    public PatientMedication(int drugNo, String drugName, Integer unitPerDay, String dosage, Date startDate, Date finishDate, Set patients) {
       this.drugNo = drugNo;
       this.drugName = drugName;
       this.unitPerDay = unitPerDay;
       this.dosage = dosage;
       this.startDate = startDate;
       this.finishDate = finishDate;
       this.patients = patients;
    }
   
    public int getDrugNo() {
        return this.drugNo;
    }
    
    public void setDrugNo(int drugNo) {
        this.drugNo = drugNo;
    }
    public String getDrugName() {
        return this.drugName;
    }
    
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
    public Integer getUnitPerDay() {
        return this.unitPerDay;
    }
    
    public void setUnitPerDay(Integer unitPerDay) {
        this.unitPerDay = unitPerDay;
    }
    public String getDosage() {
        return this.dosage;
    }
    
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getFinishDate() {
        return this.finishDate;
    }
    
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
    public Set getPatients() {
        return this.patients;
    }
    
    public void setPatients(Set patients) {
        this.patients = patients;
    }




}


