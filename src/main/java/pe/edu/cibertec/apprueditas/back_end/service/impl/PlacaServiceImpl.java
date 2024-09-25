package pe.edu.cibertec.apprueditas.back_end.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.apprueditas.back_end.dto.SearchRequestDTO;
import pe.edu.cibertec.apprueditas.back_end.service.PlacaService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class PlacaServiceImpl implements PlacaService {

    @Autowired
    ResourceLoader resourceLoader;

    @Override
    public String[] buscarPlaca(SearchRequestDTO searchRequestDTO) throws IOException {

        String[] datosPlaca = null;
        Resource resource =  resourceLoader.getResource("classpath:vehiculos.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(resource.getFile()));

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (searchRequestDTO.placa().equals(datos[1])) {

                    datosPlaca = new String[5];

                    datosPlaca[0] = datos[2];
                    datosPlaca[1] = datos[3];
                    datosPlaca[2] = datos[4];
                    datosPlaca[3] = datos[5];
                    datosPlaca[4] = datos[6];

                    break;
                }
            }
        } catch (IOException e) {
            datosPlaca = null;
            throw new RuntimeException(e);
        }
        return datosPlaca;
    }
}
