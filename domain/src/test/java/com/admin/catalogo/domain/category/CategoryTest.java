package com.admin.catalogo.domain.category;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {
//    @Test
//    public void testNewCategory(){
//        Assertions.assertNotNull(new Category());
//
//    }
//

    @Test
    public void givenAValidParams_whenCallNewCategory_thenInstantiateACategory(){
        final var expectedName = "Filmes";
        final var expectedDescription = "A castegoria mais vista";
        final var expectedActive = true;

        final var actualCategory = Category.newCategory(expectedName, expectedDescription, expectedActive);


        Assertions.assertNotNull(actualCategory);
        Assertions.assertNotNull(actualCategory.getId());
        Assertions.assertEquals(expectedName, actualCategory.getName());
        Assertions.assertEquals(expectedDescription, actualCategory.getDescription());
        Assertions.assertEquals(expectedActive, actualCategory.isActive());

        Assertions.assertNotNull(actualCategory.getCreatedAt());
        Assertions.assertNotNull(actualCategory.getUpdatedAt());
        Assertions.assertNull(actualCategory.getDeleteAt());



    }
}
