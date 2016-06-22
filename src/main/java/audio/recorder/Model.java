package audio.recorder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Sriya on 6/22/16.
 */
@Entity
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long recordId;
    String userRecording;
    String subject;
    int numberOfRecordings;
    //important to have default constructor
    public Model(){}
    public Model(String userRecording,String subject,int numberOfRecordings){
        this.userRecording=userRecording;
        this.subject=subject;
        this.numberOfRecordings=numberOfRecordings;
    }

    public String getUserRecording() {
        return userRecording;
    }

    public void setUserRecording(String userRecording) {
        this.userRecording = userRecording;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNumberOfRecordings() {
        return numberOfRecordings;
    }

    public void setNumberOfRecordings(int numberOfRecordings) {
        this.numberOfRecordings = numberOfRecordings;
    }

    public long getRecordId() {
        return recordId;
    }

    public void setRecordId(long recordId) {
        this.recordId = recordId;
    }


}
