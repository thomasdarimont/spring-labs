insert into project (name) values('Project A');
insert into project (name) values('Project B');
insert into project (name) values('Project C');

insert into task (name, project_id) values ('Task A 1', (select id from project where name = 'Project A'));
insert into task (name, project_id) values ('Task A 2', (select id from project where name = 'Project A'));
insert into task (name, project_id, status) values ('Task A 3', (select id from project where name = 'Project A'), 'PROGRESS');

insert into task (name, project_id) values ('Task B 1', (select id from project where name = 'Project B'));
insert into task (name, project_id) values ('Task B 2', (select id from project where name = 'Project B'));
insert into task (name, project_id, status) values ('Task B 3', (select id from project where name = 'Project B'), 'PROGRESS');
insert into task (name, project_id) values ('Task B 4', (select id from project where name = 'Project B'));

insert into task (name, project_id) values ('Task C 1', (select id from project where name = 'Project C'));
insert into task (name, project_id) values ('Task C 2', (select id from project where name = 'Project C'));
insert into task (name, project_id, status) values ('Task C 3', (select id from project where name = 'Project C'), 'PROGRESS');
insert into task (name, project_id) values ('Task C 4', (select id from project where name = 'Project C'));
insert into task (name, project_id) values ('Task C 5', (select id from project where name = 'Project C'));