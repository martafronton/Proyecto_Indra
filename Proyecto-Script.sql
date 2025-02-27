create table USUARIO(
id_usuario number(6)primary key,
nombre varchar2(20)not null,
correo_electronico varchar2(40)not null,
contrasenia varchar2(20)not null
);

create table UBICACION (
id_ubicacion number(6) primary key,
presencial varchar2(10) not null,
direccion varchar2(30),
enlace varchar2(2048)
);
create table CATEGORIA(
id_categoria number(2)primary key,
nombre varchar2(20) not null,
Descripcion varchar2(250)
);

create table ORGANIZADOR(
id_organizador number(6)primary key,
nombre varchar2(25) not null,
correo_electronico number(30) not null
);

create table ORGANIZADOR_TELEFONO(
id_organizador number(6),
telefono number(11),
foreign key(id_organizador) references organizador(id_organizador),
primary key(id_organizador, telefono)
);

create table EVENTO (
id_evento number(6) primary key,
nombre varchar2(20)not null,
fecha date not null,
hora number(2,2)not null,
duracion number(2,2)not null check(duracion>0),
id_ubicacion number(6)not null,
id_categoria number(2)not null,
foreign key(id_ubicacion) references ubicacion(id_ubicacion),
foreign key(id_categoria) references categoria(id_categoria)
);

create table INSCRIPCION(
id_evento number(6),
id_usuario number(6),
fecha_inscripcion date not null,
foreign key(id_evento) references evento(id_evento),
foreign key(id_usuario) references usuario(id_usuario),
primary key(id_evento, id_usuario)
);

create table ORGANIZADOR_EVENTO (
id_organizador number(6),
id_evento number(6),
foreign key(id_organizador) references organizador(id_organizador),
foreign key(id_evento) references evento(id_evento),
primary key(id_evento,id_organizador)
)

