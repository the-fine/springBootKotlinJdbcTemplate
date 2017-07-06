CREATE TABLE IF NOT EXISTS "users" (
  "id" int(11) unsigned NOT NULL,
  "first_name" varchar(255) DEFAULT NULL,
  "last_name" varchar(255) DEFAULT NULL,
  "email" varchar(255) DEFAULT NULL,
  PRIMARY KEY ("id")
);