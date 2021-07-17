package kupovina.kontroleri;

import kupovina.modeli.Kupac;
import kupovina.repozitorijumi.KupacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KupacKontroler {

    @Autowired
    KupacRepository kupacRepository;

    //pokazuje sve kupce
    @GetMapping("/kupac")
    public List<Kupac> sviKupci(){
        return kupacRepository.findAll();
    }

    //pokazuje kupca po id-u
    @GetMapping("/kupac/{id}")
    public Kupac pokaziKupca(@PathVariable String id){
        int kId = Integer.parseInt(id);
        return kupacRepository.findById(kId).orElse(null);
    }

    //kreira ili azurira kupca
    @PostMapping("/kupac")
    public Kupac napraviKupca(@RequestBody Kupac kupac){
        return kupacRepository.save(kupac);
    }

    //brise odredjenog kupca
    @DeleteMapping("kupac/{id}")
    public boolean brisiKupca(@PathVariable String id){
        int kId= Integer.parseInt(id);
        kupacRepository.deleteById(kId);
        return true;
    }
}
