-- Create all tables here

CREATE SCHEMA IF NOT EXISTS webappbase;

CREATE TABLE IF NOT EXISTS webappbase.process (
  id SERIAL PRIMARY KEY,
  process_name VARCHAR(255) NOT NULL,
  timestamp TIMESTAMP NOT NULL,
  status INTEGER DEFAULT 0);