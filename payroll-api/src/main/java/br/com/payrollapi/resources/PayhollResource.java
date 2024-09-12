package br.com.payrollapi.resources;

import br.com.payrollapi.domain.Payroll;
import br.com.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping(value = "/api/payments")
public class PayhollResource {
private final PayrollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayroll(@PathVariable Long workerId, @RequestBody Payroll payroll){
        var resultService = service.getPayment(workerId, payroll);
        log.info("Dados retornado com sucesso {}", resultService.toString());
        return ResponseEntity.ok().body(resultService);
    }

}
