package com.artcoder.webappbase.process.controller;

import com.artcoder.webappbase.process.domain.Process;
import com.artcoder.webappbase.process.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(ProcessController.BASE_URL)
public class ProcessController {

  static final String BASE_URL = "/process";

  private final ProcessService processService;

  @Autowired
  public ProcessController(ProcessService processService) {
    this.processService = processService;
  }

  @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public Collection<Process> findProcesses() {
    return processService.findProcesses();
  }

  @GetMapping(value = "/{processId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<Process> getProcess(@PathVariable Long processId) {
    return ResponseEntity.ok(processService.getProcess(processId));
  }

  @PutMapping(value = "/{processId}/mark-complete")
  public ResponseEntity<Void> markComplete(@PathVariable Long processId) {
    processService.markComplete(processId);
    return ResponseEntity.ok().build();
  }
}
