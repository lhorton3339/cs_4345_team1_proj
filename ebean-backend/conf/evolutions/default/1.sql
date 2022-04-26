# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table author (
  aid                           bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_author primary key (aid)
);

create table paper (
  pid                           bigint auto_increment not null,
  title                         varchar(255),
  year                          varchar(255),
  pages                         varchar(255),
  constraint pk_paper primary key (pid)
);

create table paper_author (
  paper_pid                     bigint not null,
  author_aid                    bigint not null,
  constraint pk_paper_author primary key (paper_pid,author_aid)
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (id)
);

alter table paper_author add constraint fk_paper_author_paper foreign key (paper_pid) references paper (pid) on delete restrict on update restrict;
create index ix_paper_author_paper on paper_author (paper_pid);

alter table paper_author add constraint fk_paper_author_author foreign key (author_aid) references author (aid) on delete restrict on update restrict;
create index ix_paper_author_author on paper_author (author_aid);


# --- !Downs

alter table paper_author drop foreign key fk_paper_author_paper;
drop index ix_paper_author_paper on paper_author;

alter table paper_author drop foreign key fk_paper_author_author;
drop index ix_paper_author_author on paper_author;

drop table if exists author;

drop table if exists paper;

drop table if exists paper_author;

drop table if exists user;

