package br.com.zup.autores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\u0012\u001a\u00020\fH\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lbr/com/zup/autores/CadastraAutorController;", "", "autorRepository", "Lbr/com/zup/autores/AutorRepository;", "(Lbr/com/zup/autores/AutorRepository;)V", "getAutorRepository", "()Lbr/com/zup/autores/AutorRepository;", "atualiza", "Lio/micronaut/http/HttpResponse;", "id", "", "descricao", "", "cadastra", "request", "Lbr/com/zup/autores/NovoAutorRequest;", "deleta", "lista", "email", "nossa-casa-do-codigo"})
@io.micronaut.http.annotation.Controller(value = "/autores")
@io.micronaut.validation.Validated()
public class CadastraAutorController {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    private final br.com.zup.autores.AutorRepository autorRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Get()
    public io.micronaut.http.HttpResponse<java.lang.Object> lista(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue(defaultValue = "")
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Post()
    public io.micronaut.http.HttpResponse<java.lang.Object> cadastra(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    br.com.zup.autores.NovoAutorRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Put(value = "/{id}")
    public io.micronaut.http.HttpResponse<java.lang.Object> atualiza(@io.micronaut.http.annotation.PathVariable()
    long id, @org.jetbrains.annotations.NotNull()
    java.lang.String descricao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Delete(value = "/{id}")
    public io.micronaut.http.HttpResponse<java.lang.Object> deleta(@io.micronaut.http.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.autores.AutorRepository getAutorRepository() {
        return null;
    }
    
    public CadastraAutorController(@org.jetbrains.annotations.NotNull()
    br.com.zup.autores.AutorRepository autorRepository) {
        super();
    }
}