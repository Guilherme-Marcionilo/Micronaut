package br.com.zup.autores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lbr/com/zup/autores/AutorRepository;", "Lio/micronaut/data/jpa/repository/JpaRepository;", "Lbr/com/zup/autores/Autor;", "", "findByEmail", "Ljava/util/Optional;", "email", "", "nossa-casa-do-codigo"})
@io.micronaut.data.annotation.Repository()
public abstract interface AutorRepository extends io.micronaut.data.jpa.repository.JpaRepository<br.com.zup.autores.Autor, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<br.com.zup.autores.Autor> findByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
}