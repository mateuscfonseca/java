CREATE TABLE IF NOT EXISTS public.investimento (
    id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    nome varchar NOT NULL,
    CONSTRAINT investimento_pk PRIMARY KEY (id)
);
