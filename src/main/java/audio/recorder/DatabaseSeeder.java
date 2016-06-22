package audio.recorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sriya on 6/17/16.
 */
@Component
public class DatabaseSeeder implements CommandLineRunner{
    private RecordRepository recordRepository;
    @Autowired
    public DatabaseSeeder(RecordRepository recordRepository){
        this.recordRepository = recordRepository;
    }
    @Override
    public void run(String... strings) throws Exception {
    List<Model> recordings=new ArrayList<>();
        Model aRecord=new Model("/media/bts.mp3" ,"Science",5);
        Model bRecord=new Model("/media/bts.mp3", "Phyics",3);
        Model cRecord=new Model("/media/bts.mp3","Chemistry",4);
        Model dRecord=new Model("/media/bts.mp3", "Social",2);
        recordings.add(aRecord);
        recordings.add(bRecord);
        recordings.add(cRecord);
        recordings.add(dRecord);
        recordRepository.save(recordings);
    }

}
