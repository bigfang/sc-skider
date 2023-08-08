CREATE TABLE "articles" (
    id bigint NOT NULL PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
    title text UNIQUE NOT NULL,
    body text NOT NULL,
    author_id bigint NOT NULL,
    created_at timestamp with time zone DEFAULT now(),
    updated_at timestamp with time zone DEFAULT current_timestamp
);
CREATE INDEX on "articles" (author_id);

COMMENT ON TABLE "articles" IS '文章';
COMMENT ON COLUMN "articles"."id" IS 'id';
COMMENT ON COLUMN "articles"."title" IS '标题';
COMMENT ON COLUMN "articles"."body" IS '正文';
COMMENT ON COLUMN "articles"."author_id" IS '作者 id';