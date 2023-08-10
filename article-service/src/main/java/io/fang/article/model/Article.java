package io.fang.article.model;

import io.fang.account.model.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "articles")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false, columnDefinition = "text")
    private String title;

    @Column(unique = true, nullable = false, columnDefinition = "text")
    private String body;

    @Column(name = "author_id")
    private Long authorId;

    @Transient
    private User author;
}
