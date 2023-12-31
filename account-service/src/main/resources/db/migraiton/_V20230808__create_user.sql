CREATE TABLE "users" (
    id bigint NOT NULL PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
    username text UNIQUE NOT NULL,
    password text NOT NULL,
    birthday date,
    created_at timestamp with time zone DEFAULT now(),
    updated_at timestamp with time zone DEFAULT current_timestamp
);

COMMENT ON TABLE "users" IS '用户';
COMMENT ON COLUMN "users"."id" IS 'id';
COMMENT ON COLUMN "users"."username" IS '用户名';
COMMENT ON COLUMN "users"."password" IS '密码';
COMMENT ON COLUMN "users"."birthday" IS '生日';
