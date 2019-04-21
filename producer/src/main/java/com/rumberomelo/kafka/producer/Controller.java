package com.rumberomelo.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/envia")
public class Controller {
	

	@Autowired
private  Producer producer;

@GetMapping(value = "/mensaje")
public void sendMessageToKafkaTopic(@RequestParam("texto") String message){
this.producer.sendMessage(message);
}

}
