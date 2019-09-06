package com.github.josecxsta.exemplo.infrastructure;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/**
 * Implementação da criação de uma instância a partir do nome da classe
 * fornecido por uma sequência de caracteres.
 */
public class Factory {

    /**
     * Cria uma instância da classe cujo nome é fornecido.
     *
     * <p>A presente versão assume que a classe possui um construtor padrão
     * (default), ou seja, um construtor público sem argumento.
     * </p>
     *
     * @param classe O nome da classe (nome completo).
     * @return Retorna instância da classe.
     * @throws NullPointerException     Se o nome da classe fornecido é {@code
     *                                  null}.
     * @throws IllegalArgumentException Se o nome da classe fornecido é vazio.
     */
    public static Object newInstance(final String classe) {
        Objects.requireNonNull(classe, "classe");

        if (classe.isEmpty()) {
            throw new IllegalArgumentException("classe vazio");
        }

        final Class<?> clazz = getClass(classe);
        if (clazz == null) {
            final String msg = String.format("classpath não inclui %s", classe);
            throw new IllegalArgumentException(msg);
        }

        try {
            Constructor<?> construtor = clazz.getConstructor();
            return construtor.newInstance();
        } catch (NoSuchMethodException e) {
            final String fmt = "%s possui construtor default?";
            throw new IllegalArgumentException(String.format(fmt, classe));
        } catch (IllegalAccessException e) {
            final String fmt = "%s possui construtor default público?";
            throw new IllegalArgumentException(String.format(fmt, classe));
        } catch (InstantiationException | InvocationTargetException e) {
            final String fmt = "erro ao criar objeto de %";
            throw new IllegalArgumentException(String.format(fmt, classe), e);
        }
    }

    /**
     * Recupera instância de {@link Class} para a classe cujo nome completo é
     * fornecido.
     *
     * @param className O nome completo da classe.
     * @return A instância de {@link Class} ou o valor {@code null}, caso a
     * classe não faça parte do <em>classpath</em> corrente.
     */
    private static Class<?> getClass(final String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}

