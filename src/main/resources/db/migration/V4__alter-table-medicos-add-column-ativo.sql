alter table medicos add column ativo smallint;
update medicos set ativo = 1;
