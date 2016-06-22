package audio.recorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sriya on 6/22/16.
 */
@RestController
@RequestMapping(value="/audio")
public class Controller {
    private RecordRepository recordRepository;
    @Autowired
    public Controller(RecordRepository recordRepository){
        this.recordRepository=recordRepository;
    }

    //Getting the data of all recordings
    @RequestMapping(value="/all" ,method= RequestMethod.GET, produces = "application/json")
    public List<Model> getAll(){
        return recordRepository.findAll();
    }

    //Getting a recording through recordId
    @RequestMapping(value = "/getRecording/{recordId}",method=RequestMethod.GET, produces = "application/json")
    public List<Model> findByrecordId(@PathVariable long recordId){
        return recordRepository.findByrecordId(recordId);
    }

    //Updating a record
    @RequestMapping(value="/update",method = RequestMethod.POST,produces = "application/json")
    public List<Model> create(@RequestBody Model recordModel){
        recordRepository.save(recordModel);
        return recordRepository.findAll();
    }

    //For deleting
    @RequestMapping(value="delete/{recordId}",method=RequestMethod.POST)
    public List<Model> remove(@PathVariable long recordId){
        recordRepository.delete(recordId);
        return recordRepository.findAll();
    }
}
