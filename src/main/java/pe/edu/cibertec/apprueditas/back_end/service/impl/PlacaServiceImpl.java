package pe.edu.cibertec.apprueditas.back_end.service.impl;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.apprueditas.back_end.dto.SearchRequestDTO;
import pe.edu.cibertec.apprueditas.back_end.service.PlacaService;

@Service
public class PlacaServiceImpl implements PlacaService {
    @Override
    public String[] buscarPlaca(SearchRequestDTO searchRequestDTO) {
        return new String[0];
    }
}
