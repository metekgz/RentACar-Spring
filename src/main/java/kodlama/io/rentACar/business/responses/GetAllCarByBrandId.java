package kodlama.io.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCarByBrandId {
    private String modelName;
    private String plate;
    private double dailyPrice;
    private int state;
    private int modelYear;
    private String carImg;
}