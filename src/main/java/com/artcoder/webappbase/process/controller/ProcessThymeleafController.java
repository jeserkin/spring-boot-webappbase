package com.artcoder.webappbase.process.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(ProcessThymeleafController.BASE_URL)
public class ProcessThymeleafController {

  static final String BASE_URL = "/thymeleaf/process";

  @GetMapping(value = "/list")
  public String processes() {
    return "processes/processes";
  }

  @GetMapping(value = "/{processId}")
  public String processes(@PathVariable Long processId, Model model) {
    model.addAttribute("processId", processId);
    return "process/process";
  }
}
