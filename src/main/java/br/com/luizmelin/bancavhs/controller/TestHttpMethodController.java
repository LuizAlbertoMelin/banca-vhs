package br.com.luizmelin.bancavhs.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/teste")
public class TestHttpMethodController {

    @GetMapping("/select")
    public String select() {
        return "SELECT *";

    }

    @GetMapping("/select/{id}")
    public ResponseEntity<String> selectComId(@PathVariable("id") Long id) {
        if (id>= 1 && id<= 100){
            return ResponseEntity.ok("SELECT * FROM TABELA WHERE ID=" + id) ;
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("id não encontrado :(");
    }

    @PostMapping("/insert")
    public Map <String, Object> insert(@RequestBody Map<String, Object> body) {
        return Map.of(
                "codigo banco","INSERT INTO TABELA(coluna1,coluna2) VALUES(valor1, valor2)",
                "resquest feita", body);
    }

    @PutMapping("/put")
    public String put() {
        return "PUT - VHS";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "DELETE - VHS";
    }

    @PatchMapping("/patch")
    public String patch(){
        return "patch - vhs";
    }
}
