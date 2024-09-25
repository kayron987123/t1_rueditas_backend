package pe.edu.cibertec.apprueditas.back_end.dto;

import java.math.BigDecimal;

public record SearchResponseDTO(String codigo,
                                String mensaje,
                                String marca,
                                String modelo,
                                Integer nroAsientos,
                                BigDecimal precio,
                                String color) {
}
