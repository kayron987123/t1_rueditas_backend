package pe.edu.cibertec.apprueditas.back_end.service;

import pe.edu.cibertec.apprueditas.back_end.dto.SearchRequestDTO;

public interface PlacaService {

    String[] buscarPlaca(SearchRequestDTO searchRequestDTO);
}
