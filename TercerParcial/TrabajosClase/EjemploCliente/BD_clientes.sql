use Cliente;
select * from usuario;
update usuario set nombre='user2',apellido='user2',email='user3@gmail',telefono='777888999' where (idCliente ='2');
delete from usuario where idCliente=3;