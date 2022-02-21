CREATE DATABASE Jaegers;

CREATE TABLE jaegers (
                      id SERIAL PRIMARY KEY,
                      modelName TEXT,
					  mark      CHAR(6),
                      height    INTEGER,
					  weight    INTEGER,
					  status    CHAR(9),
                      origin    TEXT,
					  launch    DATE,
					  kaijuKill INTEGER
					  );