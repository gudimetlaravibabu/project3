CREATE TABLE IF NOT EXISTS account_summary (
  account_name varchar(255) NOT NULL,
  npbe double DEFAULT NULL,
  pmbe double DEFAULT NULL,
  rtb double DEFAULT NULL,
  dhbe double DEFAULT NULL,
  DA varchar(255) DEFAULT NULL,
  remarks varchar(255) DEFAULT NULL,
  PRIMARY KEY (account_name)
);

CREATE TABLE IF NOT EXISTS accountbe (
   id int(11) NOT NULL AUTO_INCREMENT,
   account_name varchar(255) DEFAULT NULL,
   account_track varchar(255) DEFAULT NULL,
   npbe double DEFAULT NULL,
   pm varchar(255) DEFAULT NULL,
   pmbe double DEFAULT NULL,
   remarks varchar(255) DEFAULT NULL,
   rtb double DEFAULT NULL,
   show_summary bit(1) DEFAULT NULL,
   summary varchar(255) DEFAULT NULL,
   showTextbox tinyint(1) DEFAULT 0,
   show_textbox bit(1) NOT NULL,
   show_updatebutton bit(1) NOT NULL,
   showUpdatebutton tinyint(1) DEFAULT 0,
   dhbe double DEFAULT NULL,
   DA varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS dhrtbr (
  id int(11) NOT NULL AUTO_INCREMENT,
  account_name varchar(255) DEFAULT NULL,
  account_track varchar(255) DEFAULT NULL,
  dhbe double DEFAULT NULL,
  rtbr double DEFAULT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS phc (
  id int(11) NOT NULL AUTO_INCREMENT,
  accountmcc varchar(255) DEFAULT NULL,
  account_name varchar(255) DEFAULT NULL,
  account_track varchar(255) DEFAULT NULL,
  alloc_end_date datetime DEFAULT NULL,
  emp_name varchar(255) DEFAULT NULL,
  fut_exits varchar(255) DEFAULT NULL,
  lastmcc varchar(255) DEFAULT NULL,
  next_alloc_date datetime DEFAULT NULL,
  proj_type varchar(255) DEFAULT NULL,
  account_du varchar(255)  DEFAULT NULL,
  dm varchar(255)  DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS phc_vol (
  id int(11) NOT NULL AUTO_INCREMENT,
  account_name varchar(255) DEFAULT NULL,
  account_track varchar(255) DEFAULT NULL,
  da varchar(255) DEFAULT NULL,
  phcaod double DEFAULT 0,
  phcaol double DEFAULT 0,
  phc_target double DEFAULT 0,
  remarks varchar(255) DEFAULT NULL,
  volaod double DEFAULT 0,
  volaol double DEFAULT 0,
  vol_target double DEFAULT 0,
  show_textbox tinyint(1) DEFAULT NULL,
  show_updatebutton tinyint(1) DEFAULT NULL,
  account_du varchar(255)  DEFAULT NULL,
  dm varchar(255)  DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS phc_vol_summary (
  account_name varchar(255) NOT NULL,
  da varchar(255) DEFAULT NULL,
  phcaod double NOT NULL,
  phcaol double NOT NULL,
  phc_target double NOT NULL,
  remarks varchar(255) DEFAULT NULL,
  volaod double NOT NULL,
  volaol double NOT NULL,
  vol_target double NOT NULL,
  dm varchar(255) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS user (
  id int(11) NOT NULL,
  active tinyint(1) DEFAULT NULL,
  password varchar(45) DEFAULT NULL,
  roles varchar(45) DEFAULT NULL,
  user_name varchar(45) DEFAULT NULL
);
