CREATE DATABSE db_banco;

USE DATABASE db_banco;

CREATE TABLE t_cliente(
    nombre_completo VARCHAR(50) NOT NULL,
    cedula  VARCHAR(10) PRIMARY KEY,
    fecha_nacimiento DATE NOT NULL,
    ocupacion VARCHAR(25),
    residencia VARCHAR(25),
    contrasenia VARCHAR(25) NOT NULL
)

CREATE TABLE t_cuentas_ahorro(
    id VARCHAR(10) PRIMARY KEY,
    saldo DOUBLE NOT NULL,
    CONSTRAINT chk_saldo_ahorro CHECK ( saldo >= 100 ),
    porcentaje_interes DOUBLE NOT NULL,
    CONSTRAINT chk_porcentaje_interes_ahorro CHECK(porcentaje_interes >= 0 AND porcentaje_interes <= 1),
    cedula_cliente VARCHAR(10),
    FOREIGN KEY (cedula_cliente) REFERENCES t_cliente(cedula)
)

CREATE TABLE t_cuentas_credito(
    id VARCHAR(10) PRIMARY KEY,
    saldo DOUBLE NOT NULL,
    CONSTRAINT chk_saldo_credito CHECK ( saldo <= 0 ),
    limite DOUBLE NOT NULL,
    porcentaje_interes DOUBLE NOT NULL,
    CONSTRAINT chk_porcentaje_interes_credito CHECK(porcentaje_interes >= 0 AND porcentaje_interes <= 1),
    cedula_cliente VARCHAR(10),
    FOREIGN KEY (cedula_cliente) REFERENCES t_cliente(cedula)
)

CREATE TABLE t_cuentas_debito(
     id VARCHAR(10) PRIMARY KEY,
     saldo DOUBLE NOT NULL,
     CONSTRAINT chk_saldo_debito CHECK ( saldo >= 0 ),
     porcentaje_interes DOUBLE NOT NULL,
     CONSTRAINT chk_porcentaje_interes_debito CHECK(porcentaje_interes >= 0 AND porcentaje_interes <= 1),
     cedula_cliente VARCHAR(10),
     FOREIGN KEY (cedula_cliente) REFERENCES t_cliente(cedula)
)