package pe.edu.cibertec.apprueditas.back_end.dto;

import java.math.BigDecimal;

public record SearchResponseDTO(String codigo,
                                String mensaje,
                                String marca,
                                String modelo,
                                Integer nroAsientos,
                                Integer precio,
                                String color) {
}
