package pl.training.springboot51.rest.assembler;

public interface Assembler<T, R> {

    R assemble(T source);
}
