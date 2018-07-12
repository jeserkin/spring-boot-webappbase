'use strict';

const loadProcess = async (processId) => {
  const response = await fetch(new Request(`/process/${processId}`));
  return await response.json();
};