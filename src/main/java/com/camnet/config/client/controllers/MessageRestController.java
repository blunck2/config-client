package com.camnet.config.client.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {

  @Value("${prefix:unknown}")
  private String prefix;

  @Value("${message:unknown}")
  private String message;

  @RequestMapping("/message")
  String getMessage() {
    return this.prefix + " " + this.message;
  }
}
