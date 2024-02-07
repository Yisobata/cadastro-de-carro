package com.luizisobata.autoscore.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.luizisobata.autoscore.domain.Veiculo;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResources {
//https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=ABC1234
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Veiculo>> findAll() {
		Veiculo veiculo = new Veiculo("José da Silva", "203.397.390-53", "ABC1234");
		List<Veiculo> list = new ArrayList<>();
		list.add(veiculo);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/data")
	public String getData(Veiculo veiculo) {
		RestTemplate restTemplate = new RestTemplate();
		String url = String.format("https://localhost:8080/veiculos?key=55ad1cd0&placa=%s", veiculo.getPlaca());
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		String responseBody = responseEntity.getBody();
		return responseBody;
	}
}
