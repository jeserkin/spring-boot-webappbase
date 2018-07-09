package com.artcoder.webappbase.process.service;

import com.artcoder.webappbase.process.domain.Process;

import java.util.Collection;

public interface ProcessService {
  Collection<Process> findProcesses();
  void markComplete(long processId);
}
