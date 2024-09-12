package br.com.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Payroll {

    private String workerName;
    private String description;
    private Double hourlyPrice;
    private Double workedHours;
    private Double totalPayment;

    @Override
    public String toString() {
        return "Payroll{" +
                "workerName='" + workerName + '\'' +
                ", description='" + description + '\'' +
                ", hourlyPrice=" + hourlyPrice +
                ", workedHours=" + workedHours +
                ", totalPayment=" + totalPayment +
                '}';
    }
}
