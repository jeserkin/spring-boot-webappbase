package com.artcoder.webappbase.process.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artcoder.webappbase.process.domain.Process;
import com.artcoder.webappbase.process.repository.ProcessRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class ProcessServiceImpl implements ProcessService {

  private final ProcessRepository processRepository;

  @Autowired
  public ProcessServiceImpl(ProcessRepository processRepository) {
    this.processRepository = processRepository;
  }

  @Override
  public Collection<Process> findProcesses() {
    return processRepository.findAll();
  }

  @Override
  public void markComplete(long processId) {
    Optional<Process> byId = processRepository.findById(processId);
    byId.ifPresent(process -> {
      process.setStatus(1);
      processRepository.save(process);
    });
    byId.orElseThrow(() -> new RuntimeException("No processes found!"));
  }

  @Override
  public Process getProcess(long processId) {
    return processRepository.findById(processId)
      .orElseThrow(() -> new RuntimeException("Process not found!"));
  }
}
