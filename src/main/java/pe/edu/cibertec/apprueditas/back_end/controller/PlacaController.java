package pe.edu.cibertec.apprueditas.back_end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.apprueditas.back_end.dto.SearchRequestDTO;
import pe.edu.cibertec.apprueditas.back_end.dto.SearchResponseDTO;
import pe.edu.cibertec.apprueditas.back_end.service.PlacaService;

import java.io.IOException;
import java.time.Duration;

@RestController
@RequestMapping("/placas")
public class PlacaController {

    @Autowired
    private PlacaService placaService;

    @PostMapping("/search")
    public SearchResponseDTO buscarPlaca(@RequestBody SearchRequestDTO searchRequestDTO) {

        try {
            String[] datosPlaca = placaService.buscarPlaca(searchRequestDTO);

            if (datosPlaca == null) {
                return new SearchResponseDTO("01", "Error: Placa no encontrada", "", "", 0, 0, "");
            }

            return new SearchResponseDTO("00", "", datosPlaca[0], datosPlaca[1], Integer.parseInt(datosPlaca[2]), Integer.parseInt(datosPlaca[3]), datosPlaca[4]);

        } catch (Exception e) {
            return new SearchResponseDTO("99", "Error: Ocurrio un problema", "", "", 0, 0, "");
        }
    }
}
