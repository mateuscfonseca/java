drop table if EXISTS public.usuario;

CREATE TABLE IF NOT EXISTS public.usuario (
    id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    login varchar(256) NOT NULL,
    senha varchar(256) NOT NULL,
    criacao timestamptz(3) NOT NULL DEFAULT now(),
    ultima_edicao timestamptz(3) NOT NULL DEFAULT now(),
    apelido varchar NOT NULL,
    email varchar NOT NULL,
    CONSTRAINT usuario_pk PRIMARY KEY (id)
);

do $$ begin
insert into
    public.usuario (login, senha, apelido, email)
values
    (
        'mateuscfonseca',
        '607133502fa673297e35882bebb42a1697d57eb3e74a76be4cb277fe0dd6303c',
        'Mateus',
        'mateuscfonseca@gmail.com'
    );

end $$