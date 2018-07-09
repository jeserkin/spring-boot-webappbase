-- Create all tables here

CREATE TABLE process (
  id INTEGER NOT NULL AUTO_INCREMENT,
  process_name VARCHAR(255),
  timestamp TIMESTAMP,
  status INTEGER DEFAULT 0,
  PRIMARY KEY (id));