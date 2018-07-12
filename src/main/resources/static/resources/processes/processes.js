(async () => {
  'use strict';

  const loadProcesses = async () => {
    const response = await fetch(new Request('/process/list'));
    return await response.json();
  };

  const fillTable = async () => {
    const processes = await loadProcesses();
    const tBodyId = 'processes-tbody';

    const addRow = (tBodyId, index) => {
      const table = document.getElementById(tBodyId);
      return table.insertRow(index);
    };

    const addCell = (row, process, prop, index, valueFilterCb) => {
      const cel = row.insertCell(index);
      const cellValue = !valueFilterCb ? process[prop] : valueFilterCb(process[prop]);
      if (typeof cellValue === 'object') {
        cel.appendChild(cellValue);
      }
      else {
        const text = document.createTextNode(cellValue);
        cel.appendChild(text);
      }
    };

    const filterMap = {
      id: value => {
        const link = document.createElement('a');
        link.setAttribute('href', `/thymeleaf/process/${value}`);
        const linkText = document.createTextNode(value);
        link.appendChild(linkText);
        return link;
      },
      timestamp: value => new Date(value).toLocaleDateString('et-EE', {
        day: '2-digit',
        month: '2-digit',
        year: 'numeric'
      }),
      status: value => value === 1 ? 'Enabled' : 'Disabled'
    };
    processes.forEach((process, index) => {
      const row = addRow(tBodyId, index);
      Object.keys(process).forEach((key, index) => {
        addCell(row, process, key, index, filterMap[key]);
      });
    });
  };

  await fillTable();
})();