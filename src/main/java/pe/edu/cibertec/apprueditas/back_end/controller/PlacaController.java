package pe.edu.cibertec.apprueditas.back_end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.apprueditas.back_end.dto.SearchRequestDTO;
import pe.edu.cibertec.apprueditas.back_end.dto.SearchResponseDTO;
import pe.edu.cibertec.apprueditas.back_end.service.PlacaService;

@RestController
@RequestMapping("/placas")
public class PlacaController {

    @Autowired
    private PlacaService placaService;

    @PostMapping("/search")
    public SearchResponseDTO buscarPlaca(@RequestBody SearchRequestDTO searchRequestDTO) {
        return null;
    }
}
