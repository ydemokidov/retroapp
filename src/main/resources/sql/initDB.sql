DROP TABLE IF EXISTS "users";
DROP TABLE IF EXISTS "roles";
DROP TABLE IF EXISTS "user_roles";
DROP TABLE IF EXISTS "teams";
DROP TABLE IF EXISTS "team_users";
DROP TABLE IF EXISTS "boards";
DROP TABLE IF EXISTS "board_columns";
DROP TABLE IF EXISTS "tickets";
DROP TABLE IF EXISTS "votes";
DROP TABLE IF EXISTS "comments";

CREATE TABLE "users" (
  "id" SERIAL PRIMARY KEY,
  "last_name" varchar,
  "fst_name" varchar,
  "login" varchar,
  "pwd" varchar,
  "created_at" timestamp
);

CREATE TABLE "roles" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar,
  "created_at" timestamp
);

CREATE TABLE "user_roles" (
  "user_id" int,
  "role_id" int,
  PRIMARY KEY ("user_id", "role_id")
);

CREATE TABLE "teams" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar,
  "created_at" timestamp
);

CREATE TABLE "team_users" (
  "user_id" int,
  "team_id" int,
  "created_at" timestamp,
  PRIMARY KEY ("user_id", "team_id")
);

CREATE TABLE "boards" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar,
  "team_id" int,
  "created_at" timestamp
);

CREATE TABLE "board_columns" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar,
  "board_id" int,
  "order" int,
  "created_at" timestamp
);

CREATE TABLE "tickets" (
  "id" SERIAL PRIMARY KEY,
  "created_at" timestamp,
  "text" varchar,
  "order" int,
  "author_id" int,
  "assignee_id" int,
  "board_column_id" int
);

CREATE TABLE "votes" (
  "id" SERIAL PRIMARY KEY,
  "created_at" timestamp,
  "ticket_id" int,
  "type" varchar,
  "author_id" int
);

CREATE TABLE "comments" (
  "id" SERIAL PRIMARY KEY,
  "created_at" timestamp,
  "author_id" int,
  "ticket_id" int,
  "text" varchar
);

ALTER TABLE "user_roles" ADD FOREIGN KEY ("user_id") REFERENCES "users" ("id");

ALTER TABLE "user_roles" ADD FOREIGN KEY ("role_id") REFERENCES "roles" ("id");

ALTER TABLE "team_users" ADD FOREIGN KEY ("user_id") REFERENCES "users" ("id");

ALTER TABLE "team_users" ADD FOREIGN KEY ("team_id") REFERENCES "teams" ("id");

ALTER TABLE "boards" ADD FOREIGN KEY ("team_id") REFERENCES "teams" ("id");

ALTER TABLE "board_columns" ADD FOREIGN KEY ("board_id") REFERENCES "boards" ("id");

ALTER TABLE "tickets" ADD FOREIGN KEY ("author_id") REFERENCES "users" ("id");

ALTER TABLE "tickets" ADD FOREIGN KEY ("assignee_id") REFERENCES "users" ("id");

ALTER TABLE "tickets" ADD FOREIGN KEY ("board_column_id") REFERENCES "board_columns" ("id");

ALTER TABLE "votes" ADD FOREIGN KEY ("ticket_id") REFERENCES "tickets" ("id");

ALTER TABLE "votes" ADD FOREIGN KEY ("author_id") REFERENCES "users" ("id");

ALTER TABLE "comments" ADD FOREIGN KEY ("author_id") REFERENCES "users" ("id");

ALTER TABLE "comments" ADD FOREIGN KEY ("ticket_id") REFERENCES "tickets" ("id");

