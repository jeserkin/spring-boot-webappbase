package com.artcoder.webappbase.process.controller;

import com.artcoder.webappbase.process.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProcessThymeleafController {

  private final ProcessService processService;

  @Autowired
  public ProcessThymeleafController(ProcessService processService) {
    this.processService = processService;
  }

  @GetMapping(value = "/process-list")
  public String processes(Model model) {
    model.addAttribute("processes", processService.findProcesses());
    return "processes";
  }
}
