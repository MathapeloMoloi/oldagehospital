package Hospital;
// Generated Jul 6, 2016 9:46:59 PM by Hibernate Tools 4.3.1



/**
 * Room generated by hbm2java
 */
public class Room  implements java.io.Serializable {


     private RoomId id;
     private Nurse nurse;
     private Integer telExtNo;
     private Integer patientBedNo;

    public Room() {
    }

	
    public Room(RoomId id, Nurse nurse) {
        this.id = id;
        this.nurse = nurse;
    }
    public Room(RoomId id, Nurse nurse, Integer telExtNo, Integer patientBedNo) {
       this.id = id;
       this.nurse = nurse;
       this.telExtNo = telExtNo;
       this.patientBedNo = patientBedNo;
    }
   
    public RoomId getId() {
        return this.id;
    }
    
    public void setId(RoomId id) {
        this.id = id;
    }
    public Nurse getNurse() {
        return this.nurse;
    }
    
    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
    public Integer getTelExtNo() {
        return this.telExtNo;
    }
    
    public void setTelExtNo(Integer telExtNo) {
        this.telExtNo = telExtNo;
    }
    public Integer getPatientBedNo() {
        return this.patientBedNo;
    }
    
    public void setPatientBedNo(Integer patientBedNo) {
        this.patientBedNo = patientBedNo;
    }




}


