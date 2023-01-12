package br.com.spring_kafka.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring_kafka.app.service.TopicService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class TopicContoller {

    private final TopicService topicService;

    @GetMapping(value = "/send")
    public void send() {
        topicService.send("Mensagem de teste enviada ao tópico");
    }

}
