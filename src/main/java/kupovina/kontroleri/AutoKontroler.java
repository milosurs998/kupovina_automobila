package kupovina.kontroleri;

import kupovina.modeli.Auto;
import kupovina.repozitorijumi.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AutoKontroler {

    @Autowired
    AutoRepository autoRepository;

    //pokazuje sve aute
    @GetMapping("/auto")
    public List<Auto> sviAuti(){
        return autoRepository.findAll();
    }

    //pokazuje auto po id-u
    @GetMapping("/auto/{id}")
    public Auto pokaziAuto(@PathVariable String id){
        int aId = Integer.parseInt(id);
        return autoRepository.findById(aId).orElse(null);
    }

    //kreira ili azurira auto
    @PostMapping("/auto")
    public Auto napraviAuto(@RequestBody Auto auto){
        return autoRepository.save(auto);
    }

    //brise odredjeni auto
    @DeleteMapping("auto/{id}")
    public boolean brisiAuto(@PathVariable String id){
        int aId= Integer.parseInt(id);
        autoRepository.deleteById(aId);
        return true;
    }


}
