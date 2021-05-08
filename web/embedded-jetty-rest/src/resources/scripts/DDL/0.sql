CREATE TABLE IF NOT EXISTS public.usuario (
    id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    login varchar NOT NULL,
    senha varchar NOT NULL,
    criacao timestamptz(0) NOT NULL DEFAULT now(),
    ultima_edicao timestamptz(0) NOT NULL DEFAULT now(),
    apelido varchar NOT NULL,
    email varchar NOT NULL,
    CONSTRAINT usuario_pk PRIMARY KEY (id)
);